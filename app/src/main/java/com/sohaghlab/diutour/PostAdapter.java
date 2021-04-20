package com.sohaghlab.diutour;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.myviewholder>{

    ArrayList<PostModel> postholder;


    private postAdapterDetails postAdapterDetails;



    public PostAdapter(postAdapterDetails postAdapterDetails,ArrayList<PostModel> postholder) {
        this.postholder = postholder;
        this.postAdapterDetails=postAdapterDetails;


    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_row,parent,false);
       return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {

        holder.img.setImageResource(postholder.get(position).getImage());
        holder.title.setText(postholder.get(position).getTitle());
        holder.description.setText(postholder.get(position).getDescription());
        holder.location.setText(postholder.get(position).getLocation());
        holder.date.setText(postholder.get(position).getDate());

        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /// this is my simple project
                ///
                postAdapterDetails.onPostClick(postholder.get(position));






            }
        });



    }

    @Override
    public int getItemCount() {
        return postholder.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{

        ImageView img;
        TextView title,description,location,date;
        CardView cardView;


        public myviewholder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.p_img);
            title=itemView.findViewById(R.id.title_t);
            description=itemView.findViewById(R.id.description_t);
            location=itemView.findViewById(R.id.location_t);
            date=itemView.findViewById(R.id.date_t);
            cardView=itemView.findViewById(R.id.cardVIEW);

        }
    }

    public interface postAdapterDetails{
        void onPostClick(PostModel postModel);
    }


}
