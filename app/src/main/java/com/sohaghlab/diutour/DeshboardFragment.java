package com.sohaghlab.diutour;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sohaghlab.diutour.page.PaymentActivity;
import com.sohaghlab.diutour.page.TourRegiActivity;


public class DeshboardFragment extends Fragment {

    CardView chackAllow,tourRegi,payment;



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
}