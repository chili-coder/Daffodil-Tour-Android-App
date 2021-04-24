package com.sohaghlab.diutour;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.sohaghlab.diutour.page.UpdateActivity;


public class ProfileFragment extends Fragment {

    TextView pName,pEmail,pStudentId;
    TextView logout;

    Button updateBTN;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;




    public ProfileFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_profile, container, false);

        pName=view.findViewById(R.id.nameProfile);
        pEmail=view.findViewById(R.id.emailProfile);
        pStudentId=view.findViewById(R.id.studentidProfile);

        logout=view.findViewById(R.id.logout);
        updateBTN=view.findViewById(R.id.editProfile);

        Intent i = getActivity().getIntent();
        String mName=i.getStringExtra("name");
        String mEmail=i.getStringExtra("email");
        String mStudentId=i.getStringExtra("studentid");

        pName.setText(mName);
        pEmail.setText(mEmail);
        pStudentId.setText(mStudentId);



        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(),LoginActivity.class);
                startActivity(intent);

                Toast.makeText(getContext(), "Successfully Logout", Toast.LENGTH_SHORT).show();
            }
        });

        updateBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getContext(), UpdateActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}