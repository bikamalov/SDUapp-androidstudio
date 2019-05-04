package com.example.sduapp;


import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;
import java.util.List;

import static android.support.v4.content.ContextCompat.startActivity;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    List<News>mData;
    Dialog myDialog;
    int pos=0;

    public RecyclerViewAdapter(Context mContext, List<News> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int i) {
        final View v;
        v = LayoutInflater.from(mContext).inflate(R.layout.items_news,parent,false);

        final MyViewHolder vHolder = new MyViewHolder(v);
        myDialog = new Dialog(mContext);
        myDialog.setContentView(R.layout.dialog_news);

        vHolder.item_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView dialog_title = (TextView)myDialog.findViewById(R.id.dialog_title);
                TextView dialog_description = myDialog.findViewById(R.id.dialog_description);
                ImageView dialog_img = myDialog.findViewById(R.id.dialog_img);
                dialog_title.setText(mData.get(vHolder.getAdapterPosition()).getTitle());
                dialog_description.setText(mData.get(vHolder.getAdapterPosition()).getDescription());
                dialog_img.setImageResource(mData.get(vHolder.getAdapterPosition()).getPhoto());
                myDialog.show();
            }
        });

        return vHolder;
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.tv_name.setText(mData.get(position).getTitle());
       // holder.tv_phone.setText(mData.get(position).getDescription());
        holder.img.setImageResource(mData.get(position).getPhoto());
    }
    @Override
    public int getItemCount() {
        return mData.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private LinearLayout item_contact;
        private TextView tv_name;
        private TextView tv_phone;
        private ImageView img;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_contact = (LinearLayout)itemView.findViewById(R.id.item_news_id);
            tv_name = (TextView)itemView.findViewById(R.id.news_title);
            tv_phone = itemView.findViewById(R.id.news_description);
            img = itemView.findViewById(R.id.img_news);
        }
    }
}
