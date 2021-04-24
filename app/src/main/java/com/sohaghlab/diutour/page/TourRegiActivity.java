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
import com.sohaghlab.diutour.SignUpActivity;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class TourRegiActivity extends AppCompatActivity {

    private static final String apiurl="http://sohaghlab.com/tour/regitour.php";
    EditText rName,rStudentid,r,rDept,rDate, rTshart;
    Button regiBtn;
    TextView successText;
    private ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_regi);

        rName=findViewById(R.id.name_tour_regi);
        rStudentid=findViewById(R.id.idstudent_tour_regi);
        rDept=findViewById(R.id.dept_tour_regi);
        rDate=findViewById(R.id.date_tour_regi);
        rTshart=findViewById(R.id.tshart_tour_regi);
        regiBtn=findViewById(R.id.tourRgi);
        successText=findViewById(R.id.regitourText);


        dialog = new ProgressDialog(this);

        dialog.setTitle("Register");
        dialog.setMessage("Please Wait Loading");

        regiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                if(rName.length()==0){
                    rName.setError("Enter Name");
                }
                else if(rStudentid.length()==0){

                    rStudentid.setError("Enter Student ID");
                }
                else if(rDept.length()==0){

                    rDept.setError("Enter Dept.");
                }
                else if(rDate.length()==0){

                    rDate.setError("Enter Date");
                }
                else if(rTshart.length()==0){

                    rTshart.setError("Enter T-Shart Size");
                }
                else{

                    TourRegidata();
                }

            }
        });

    }


    private void TourRegidata() {

        regiBtn.setVisibility(View.GONE);
        dialog.show();
        final String name=rName.getText().toString().trim();
        final String studentid=rStudentid.getText().toString().trim();
        final String dept=rDept.getText().toString().trim();
        final String date=rDate.getText().toString().trim();
        final String tshart=rTshart.getText().toString().trim();




        StringRequest request = new StringRequest(Request.Method.POST, apiurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                JSONObject jsonObject = null;
                try {
                    jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");

                    if (success.equals("1")){

                        rName.setText("");
                       rDept.setText("");
                        rStudentid.setText("");
                        rDate.setText("");
                        rTshart.setText("");
                        successText.setText("Register Successfully\n Happy Tour ");



                        Toast.makeText(TourRegiActivity.this, "Tour Register Success", Toast.LENGTH_SHORT).show();
                    }
                    dialog.dismiss();

                } catch (JSONException e) {
                    e.printStackTrace();
                    regiBtn.setVisibility(View.VISIBLE);
                    dialog.dismiss();

                    Toast.makeText(TourRegiActivity.this, "Error! "+e.toString(), Toast.LENGTH_SHORT).show();
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
                param.put("name",name);
                param.put("studentid",studentid);  ///database identy name t1,t2,t3...etc add hobe
                param.put("dept",dept);
                param.put("tshart",tshart);
                param.put("date",date);
                return param;

            }
        };

        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);



    }
}