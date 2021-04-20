package com.sohaghlab.diutour;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
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

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class SignUpActivity extends AppCompatActivity {

    private static final String apiurl="http://sohaghlab.com/tour/register.php";
    EditText rName,rStudentid,rEmail,rPassword;
    Button regiBtn;
    TextView moveToLoginPage, regiSuccessText;
     private ProgressDialog dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        rName =findViewById(R.id.regi_name);
        rStudentid =findViewById(R.id.regi_id);
        rEmail =findViewById(R.id.regi_email);
        rPassword =findViewById(R.id.regi_password);
        regiBtn =findViewById(R.id.regi_btn);
        moveToLoginPage =findViewById(R.id.signup);
        regiSuccessText=findViewById(R.id.regisuccess);

        dialog = new ProgressDialog(this);

        dialog.setTitle("Register");
        dialog.setMessage("Please Wait Loading");


        moveToLoginPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(intent);

                Toast.makeText(SignUpActivity.this, "Login account", Toast.LENGTH_SHORT).show();
            }
        });

        regiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





               if(rName.length()==0){
                   rName.setError("Enter Name");
               }
               else if(rStudentid.length()==0){

                   rStudentid.setError("Enter Student ID");
               }
                 else if(rEmail.length()==0){

                   rEmail.setError("Enter Email");
               }
               else if(rPassword.length()==0){

                   rPassword.setError("Enter Password");
               }
               else{

                   Regidata();
               }

            }
        });





    }




    private void Regidata() {

      regiBtn.setVisibility(View.GONE);
      dialog.show();
        final String name=rName.getText().toString().trim();
        final String studentid=rStudentid.getText().toString().trim();
        final String eml=rEmail.getText().toString().trim();
        final String pwd=rPassword.getText().toString().trim();




        StringRequest request = new StringRequest(Request.Method.POST, apiurl, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                JSONObject jsonObject = null;
                try {
                    jsonObject = new JSONObject(response);
                    String success = jsonObject.getString("success");

                    if (success.equals("1")){

                        rName.setText("");
                        rEmail.setText("");
                        rStudentid.setText("");
                        rPassword.setText("");
                        regiSuccessText.setText("Register Successfully\n Go To Login Page");



                        Toast.makeText(SignUpActivity.this, "Register Success", Toast.LENGTH_SHORT).show();
                    }
                        dialog.dismiss();

                } catch (JSONException e) {
                    e.printStackTrace();
                    regiBtn.setVisibility(View.VISIBLE);
                    dialog.dismiss();

                    Toast.makeText(SignUpActivity.this, "Error! "+e.toString(), Toast.LENGTH_SHORT).show();
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
                param.put("email",eml);
                param.put("pass",pwd);
                return param;

            }
        };

        RequestQueue queue= Volley.newRequestQueue(getApplicationContext());
        queue.add(request);



    }


}