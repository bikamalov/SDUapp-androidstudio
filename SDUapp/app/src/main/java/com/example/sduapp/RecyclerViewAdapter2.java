package com.example.sduapp;


import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter2 extends RecyclerView.Adapter<RecyclerViewAdapter2.MyViewHolder> {
    Context mContext2;
    List<Staff>mData2;
    Dialog myDialog2;
    int pos=0;

    public RecyclerViewAdapter2(Context mContext2, List<Staff> mData) {
        this.mContext2 = mContext2;
        this.mData2 = mData;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int i) {
        final View v;
        v = LayoutInflater.from(mContext2).inflate(R.layout.item_staff,parent,false);
        final MyViewHolder vHolder2 = new MyViewHolder(v);

        return vHolder2;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.tv_name.setText(mData2.get(i).getName());
        myViewHolder.tv_department.setText(mData2.get(i).getDepartment());
        myViewHolder.tv_position.setText(mData2.get(i).getPosition());
        myViewHolder.img.setImageResource(mData2.get(i).getPhoto());
    }
    @Override
    public int getItemCount() {
        return mData2.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        private LinearLayout item_staff;
        private TextView tv_name;
        private TextView tv_department;
        private TextView tv_position;
        private ImageView img;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            item_staff = (LinearLayout)itemView.findViewById(R.id.item_staff_id);
            tv_name = (TextView)itemView.findViewById(R.id.staff_name);
            tv_department = itemView.findViewById(R.id.staff_department);
            tv_position = itemView.findViewById(R.id.staff_position);
            img = itemView.findViewById(R.id.img_staff);
        }
    }
}
