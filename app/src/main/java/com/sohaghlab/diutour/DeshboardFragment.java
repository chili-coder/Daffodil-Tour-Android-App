package com.sohaghlab.diutour;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.sohaghlab.diutour.page.ContractActivity;
import com.sohaghlab.diutour.page.PaymentActivity;
import com.sohaghlab.diutour.page.TourRegiActivity;


public class DeshboardFragment extends Fragment implements ValueEventListener {

    CardView chackAllow,tourRegi,payment,contract,help;

    TextView titleTex,subtitleTex,dayTex,takaTex,dateTex,timeTex;
 private FirebaseDatabase firebaseDatabase =FirebaseDatabase.getInstance();
 private DatabaseReference databaseReference= firebaseDatabase.getReference();
 private DatabaseReference titleData = databaseReference.child("title");
 private DatabaseReference subtitledata =databaseReference.child("subtitle");
 private DatabaseReference daydata =databaseReference.child("day");
 private DatabaseReference takadata =databaseReference.child("taka");
 private DatabaseReference datedata =databaseReference.child("date");
 private DatabaseReference timedata =databaseReference.child("time");





    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    public DeshboardFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View v= inflater.inflate(R.layout.fragment_deshboard, container, false);
       chackAllow= v.findViewById(R.id.chack_allow);
       tourRegi=v.findViewById(R.id.tour_regi);
       payment=v.findViewById(R.id.tour_pay);
       titleTex=v.findViewById(R.id.titlelication);
       subtitleTex=v.findViewById(R.id.subtitlelocation);
       dayTex=v.findViewById(R.id.daylocation);
       takaTex=v.findViewById(R.id.takalocation);
       dateTex=v.findViewById(R.id.datelocation);
       timeTex=v.findViewById(R.id.timelocation);

       contract=v.findViewById(R.id.contact);
       help=v.findViewById(R.id.help);

       contract.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               Intent intent = new Intent(getActivity(), ContractActivity.class);
               startActivity(intent);
           }
       });

       help.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(getContext(), "Comming Soon", Toast.LENGTH_SHORT).show();
           }
       });


       tourRegi.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), TourRegiActivity.class);
               startActivity(intent);

           }
       });

       payment.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getActivity(), PaymentActivity.class);
               startActivity(intent);

           }
       });



        chackAllow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),AllowActivity.class);
                startActivity(intent);
            }
        });
        return v;
    }

    @Override
    public void onDataChange(@NonNull DataSnapshot snapshot) {

        if (snapshot.getValue(String.class)!=null){

            String key =snapshot.getKey();

            if(key.equals("title")){
               String title =snapshot.getValue(String.class);
               titleTex.setText(title);
            }
            if(key.equals("subtitle")){
                String subtitle =snapshot.getValue(String.class);
                subtitleTex.setText(subtitle);
            }
            if(key.equals("day")){
                String day =snapshot.getValue(String.class);
                dayTex.setText(day);
            }
            if(key.equals("taka")){
                String taka =snapshot.getValue(String.class);
                takaTex.setText(taka);
            }
            if(key.equals("date")){
                String date =snapshot.getValue(String.class);
                dateTex.setText(date);
            }
            if(key.equals("time")){
                String time =snapshot.getValue(String.class);
                timeTex.setText(time);
            }


        }

    }

    @Override
    public void onCancelled(@NonNull DatabaseError error) {


    }

    @Override
    public void onStart() {
        super.onStart();
        titleData.addValueEventListener(this);
        subtitledata.addValueEventListener(this);
        daydata.addValueEventListener(this);
        takadata.addValueEventListener(this);
        timedata.addValueEventListener(this);
        datedata.addValueEventListener(this);

    }
}