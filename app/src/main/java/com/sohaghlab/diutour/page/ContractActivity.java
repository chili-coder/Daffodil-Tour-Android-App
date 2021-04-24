package com.sohaghlab.diutour.page;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.sohaghlab.diutour.R;

public class ContractActivity extends AppCompatActivity {


    private EditText mto;
    private EditText mSubjectt;
    private EditText mbody;
    Button sendBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contract);
        mto=findViewById(R.id.to);
        mSubjectt=findViewById(R.id.subject);
        mbody=findViewById(R.id.bodyEmail);
        sendBtn=findViewById(R.id.SendbTn);


        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMail();
            }
        });


    }



    private void sendMail() {
        String recipientList = mto.getText().toString();
        String[] recipients = recipientList.split(",");
        String subject = mSubjectt.getText().toString();
        String message = mbody.getText().toString();
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, recipients);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, message);
        intent.setType("message/rfc822");
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }
}