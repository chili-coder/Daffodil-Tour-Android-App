package com.sohaghlab.diutour;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements PostAdapter.postAdapterDetails {

    RecyclerView recyclerview;

    private ArrayList<PostModel> postholder;



    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;



    public HomeFragment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home, container, false);


        recyclerview = view.findViewById(R.id.post_recView);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));

        postholder = new ArrayList<>();
        PostModel ob1 = new PostModel(R.drawable.campus,"Do You Want Start A Course At DIU?", getString(R.string.des1),"dhaka","02/03/2021");
        postholder.add(ob1);
        PostModel ob2 = new PostModel(R.drawable.cox,"কক্সবাজার সমুদ্র সৈকত", getString(R.string.cox),"Cox's Bazar","02/03/2021");
        postholder.add(ob2);
        PostModel ob3 = new PostModel(R.drawable.sun,"Three day Sundarban",getString(R.string.des2),"Sundarban","02/02/2020");
        postholder.add(ob3);
        PostModel ob4 = new PostModel(R.drawable.sy,"Sylhet is the popular and well-visited tourist destination",getString(R.string.des3),"Sylhet","24/07/2020");
        postholder.add(ob4);
        PostModel ob5 = new PostModel(R.drawable.snn,"বাংলাদেশের একমাত্র প্রবাল দ্বীপ সেন্টমার্টিন",getString(R.string.des4),"সেন্টমার্টিন দ্বীপ","02/03/2020");
        postholder.add(ob5);
        PostModel ob6 = new PostModel(R.drawable.sn,"তিন পার্বত্য জেলার অন্যতম বান্দরবান",getString(R.string.des5),"বান্দরবান","02/03/2020");
        postholder.add(ob6);
        PostModel ob7 = new PostModel(R.drawable.kh,"পার্বত্য চট্টগ্রামের আরেকটি জেলা খাগড়াছড়ি",getString(R.string.des6),"খাগড়াছড়ি","02/04/2020");
        postholder.add(ob7);
        PostModel ob8 = new PostModel(R.drawable.mb,"বাংলাদেশের সবচেয়ে বেশি চা বাগান মৌলভী বাজার ",getString(R.string.des7),"মৌলভী বাজার","02/03/2021");
        postholder.add(ob8);
        PostModel ob9 = new PostModel(R.drawable.snn,"বাংলাদেশের একমাত্র প্রবাল দ্বীপ সেন্টমার্টিন",getString(R.string.des4),"সেন্টমার্টিন দ্বীপ","02/03/2020");
        postholder.add(ob9);
        PostModel ob10 = new PostModel(R.drawable.sn,"তিন পার্বত্য জেলার অন্যতম বান্দরবান",getString(R.string.des5),"বান্দরবান","02/03/2020");
        postholder.add(ob10);
        PostModel ob11 = new PostModel(R.drawable.kh,"পার্বত্য চট্টগ্রামের আরেকটি জেলা খাগড়াছড়ি",getString(R.string.des6),"খাগড়াছড়ি","02/04/2020");
        postholder.add(ob11);
        PostModel ob12 = new PostModel(R.drawable.mb,"বাংলাদেশের সবচেয়ে বেশি চা বাগান মৌলভী বাজার ",getString(R.string.des7),"মৌলভী বাজার","02/03/2021");
        postholder.add(ob12);










      recyclerview.setAdapter(new PostAdapter(this,postholder));






        return view;
    }


    @Override
    public void onPostClick(PostModel postModel) {

        Intent intent = new Intent(getContext(),Post_View_Activity.class);
        intent.putExtra("imagename",postModel.getImage());
        intent.putExtra("title",postModel.getTitle());
        intent.putExtra("description",postModel.getDescription());
        intent.putExtra("location",postModel.getLocation());
        intent.putExtra("date",postModel.getDate());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);


        Toast.makeText(getActivity(), postModel.getTitle()+" ("+postModel.getLocation()+")",
                Toast.LENGTH_SHORT).show();


    }
}