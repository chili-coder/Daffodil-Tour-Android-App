package com.sohaghlab.diutour.page;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.sohaghlab.diutour.R;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class PaymentActivity extends AppCompatActivity {

    private static final String apiurl="http://sohaghlab.com/tour/payment.php";
    EditText studentidpay,amountpay,bkashpay,texpay, paylinkpay;
    Button payBtn;
    TextView successText;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        studentidpay = findViewById(R.id.studntidpay);
        amountpay = findViewById(R.id.amount);
        bkashpay = findViewById(R.id.bkash);
        texpay = findViewById(R.id.texId);
        payBtn=findViewById(R.id.payBtn);
        paylinkpay = findViewById(R.id.pay_drive_link);
        successText=findViewById(R.id.successpayText);

        successText = findViewById(R.id.successpayText);


        dialog = new ProgressDialog(this);

        dialog.setTitle("Register");
        dialog.setMessage("Please Wait Loading");


        payBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (studentidpay.length() == 0) {
                    studentidpay.setError("Enter Student Id");
                } else if (amountpay.length() == 0) {

                    amountpay.setError("Enter Amount");
                } else if (bkashpay.length() == 0) {

                    bkashpay.setError("Enter Bkash Number");
                } else if (texpay.length() == 0) {

                    texpay.setError("Enter Bkash Text Id");
                } else {

                    Paydata();
                }

            }
        });

    }
        private void Paydata() {

            payBtn.setVisibility(View.GONE);
            dialog.show();

            final String studentid=studentidpay.getText().toString().trim();
            final String amount =amountpay.getText().toString().trim();
            final String bkash =bkashpay.getText().toString().trim();
            final String texid=texpay.getText().toString().trim();
            final String drivelink=paylinkpay.getText().toString().trim();




            StringRequest request = new StringRequest(Request.Method.POST, apiurl, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {

                    JSONObject jsonObject = null;
                    try {
                        jsonObject = new JSONObject(response);
                        String success = jsonObject.getString("success");

                        if (success.equals("1")){


                            successText.setText("Payment Successfully\n Wait for Aprove ");



                            Toast.makeText(PaymentActivity.this, "Tour Register Success", Toast.LENGTH_SHORT).show();
                        }
                        dialog.dismiss();

                    } catch (JSONException e) {
                        e.printStackTrace();
                        payBtn.setVisibility(View.VISIBLE);
                        dialog.dismiss();

                        Toast.makeText(PaymentActivity.this, "Error! "+e.toString(), Toast.LENGTH_SHORT).show();
                    }

                }
            },
                    new Response.ErrorListener() {
                        @Override
                        public void onErrorResponse(VolleyError error) {
                            Toast.makeText(getApplicationContext(),error.toString(),Toast.LENGTH_LONG).show();


                        }
                    }){

                @Nullable
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {

                    Map<String,String> param=new HashMap<String,String>();
                    param.put("studentid",studentid);  ///database identy name t1,t2,t3...etc add hobe
                    param.put("amount",amount);
                    param.put("bkash",bkash);
                    param.put("texid",texid);
                    param.put("drivelink",drivelink);
                    return param;

                }
            };

            RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
            queue.add(request);



        }

}