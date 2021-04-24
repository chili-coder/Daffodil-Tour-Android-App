package com.sohaghlab.diutour;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
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

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    EditText email, password;

    String str_email, str_password;
 Button login;
    TextView signUp;
    private ProgressDialog dialog;
    private static final String apiurl = "http://sohaghlab.com/tour/login.php";
    private static final String apiurl2 = "http://sohaghlab.com/tour/signin.php";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        email = findViewById(R.id.login_email);
        password = findViewById(R.id.login_password);
        login=findViewById(R.id.login_btn);


        dialog = new ProgressDialog(this);

        dialog.setTitle("Login");
        dialog.setMessage("Please Wait Loading");


        signUp = findViewById(R.id.signup);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mEmail=email.getText().toString().trim();
                String mPass=password.getText().toString().trim();
                if (!mEmail.isEmpty() || !mPass.isEmpty()){

                    Login(mEmail,mPass);
                }else{
                    email.setError("Insert Email");
                    password.setError("Insert Password");
                }


            }
        });





    }


    private void Login(String email, String password){

        dialog.show();

        StringRequest stringRequest= new StringRequest(Request.Method.POST, apiurl2, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    String result =jsonObject.getString("status");

                JSONArray jsonArray =jsonObject.getJSONArray("data");

                    if(result.equals("success")) {

                        for (int i=0; i<jsonArray.length(); i++){

                            JSONObject object = jsonArray.getJSONObject(i);
                            String name= object.getString("name");
                            String email= object.getString("email");
                            String studentid= object.getString("studentid");

                            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
                            intent.putExtra("name",name);
                            intent.putExtra("email",email);
                            intent.putExtra("studentid",studentid);
                            startActivity(intent);
                            finish();


                            Toast.makeText(LoginActivity.this, "Login Successfully", Toast.LENGTH_SHORT).show();
                        }



                       // startActivity(new Intent(LoginActivity.this, MainActivity.class));

                        dialog.dismiss();
                    } else{
                        dialog.dismiss();
                        Toast.makeText(LoginActivity.this, "Email or Password Wrong!", Toast.LENGTH_SHORT).show();
                    }



                } catch (JSONException e) {



                    Toast.makeText(LoginActivity.this, "Error "+e.toString(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                    dialog.dismiss();
                }
            }

        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                dialog.dismiss();
                Toast.makeText(LoginActivity.this, "Error "+error.toString(), Toast.LENGTH_SHORT).show();

            }
        })

        {
            @Nullable
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();

                params.put("email", email);  ///add data mysql
                params.put("password", password);
                return params;

            }
        };

        RequestQueue requestQueue= Volley.newRequestQueue(getApplicationContext());
        requestQueue.add(stringRequest);

    }





   /* public void Login( View view) {

        if (ed_email.getText().toString().equals("")) {
            Toast.makeText(this, "Enter Email", Toast.LENGTH_SHORT).show();
        } else if (ed_password.getText().toString().equals("")) {
            Toast.makeText(this, "Enter Password", Toast.LENGTH_SHORT).show();
        } else {

            final ProgressDialog progressDialog = new ProgressDialog(this);
            progressDialog.setMessage("Please Wait..");

            progressDialog.show();

            str_email = ed_email.getText().toString().trim();
            str_password = ed_password.getText().toString().trim();


            StringRequest request = new StringRequest(Request.Method.POST, apiurl, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    progressDialog.dismiss();






                        ed_email.setText("");
                        ed_password.setText("");
                        startActivity(new Intent(LoginActivity.this, MainActivity.class));
                        Toast.makeText(LoginActivity.this, response, Toast.LENGTH_SHORT).show();


                }
            }, new Response.ErrorListener() {

                @Override
                public void onErrorResponse(VolleyError error) {
                    progressDialog.dismiss();
                    Toast.makeText(LoginActivity.this, error.getMessage().toString(), Toast.LENGTH_SHORT).show();
                }
            }

            ) {
                @Override
                protected Map<String, String> getParams() throws AuthFailureError {
                    Map<String, String> params = new HashMap<String, String>();
                    params.put("email", str_email);
                    params.put("password", str_password);
                    return params;

                }
            };

            RequestQueue requestQueue = Volley.newRequestQueue(LoginActivity.this);
            requestQueue.add(request);


        }

    }

    */
        @Override
        public void onBackPressed () {

            AlertDialog.Builder builder = new AlertDialog.Builder(LoginActivity.this)
                    .setTitle("Daffodil Tour")
                    .setCancelable(false)
                    .setMessage("আপনি কি এপ্স থেকে বের হতে চান?")
                    .setPositiveButton("হ্যা", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.finishAffinity(LoginActivity.this);
                        }
                    })
                    .setNegativeButton("না", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {

                        }
                    });

            builder.show();

        }
    }


