package com.example.sduapp;


import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    Dialog myDialog;
    public ContactFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        TextView tv_contuct_us = view.findViewById(R.id.tv_contactus);
        TextView tv_telephonecall = view.findViewById(R.id.btn_for_call_telephone);
        TextView tv_telephonecal18 = view.findViewById(R.id.btn_for_call_118);
        TextView tv_mobilecall = view.findViewById(R.id.dialog_mobile_id);
        tv_contuct_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:87273079565"));
                startActivity(callIntent);
            }
        });

        tv_telephonecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:87273079560"));
                startActivity(callIntent);
            }
        });
        tv_telephonecal18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:118"));
                startActivity(callIntent);
            }
        });
        tv_mobilecall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:87273079565"));
                startActivity(callIntent);
            }
        });

        return view;
    }

}
