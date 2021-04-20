package com.sohaghlab.diutour;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Post_View_Activity extends AppCompatActivity {

    TextView view_title,view_description,view_location,view_date;
    ImageView view_image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post__view);

        view_title= findViewById(R.id.view_title);
        view_location= findViewById(R.id.view_location);
        view_date= findViewById(R.id.view_date);
        view_description= findViewById(R.id.view_description);
        view_image= findViewById(R.id.view_img);


        view_image.setImageResource(getIntent().getIntExtra("imagename",0));
        view_title.setText(getIntent().getStringExtra("title"));
       view_description.setText(getIntent().getStringExtra("description"));
        view_location.setText(getIntent().getStringExtra("location"));
        view_date.setText(getIntent().getStringExtra("date"));




    }
}