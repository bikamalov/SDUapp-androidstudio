package com.example.sduapp;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;



public class FullImageFragment extends Fragment {


    public FullImageFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view;
         view=inflater.inflate(R.layout.fragment_full_image, container, false);
        ImageView fullImage = view.findViewById(R.id.full_image);
        String data = getActivity().getIntent().getExtras().getString("img");
        fullImage.setImageURI(Uri.parse(data));
         return view;
    }

}
