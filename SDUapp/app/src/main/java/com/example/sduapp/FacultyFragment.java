package com.example.sduapp;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class FacultyFragment extends Fragment {


    public FacultyFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_faculty, container, false);

        Button eng = view.findViewById(R.id.engeneering_id);
        Button law = view.findViewById(R.id.law_id);
        Button economic = view.findViewById(R.id.economic_id);
        Button phyl = view.findViewById(R.id.phyl_id);
        eng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Engeneering.class);
                startActivity(intent);
            }
        });
        law.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Law.class);
                startActivity(intent);
            }
        });
        economic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Economic.class);
                startActivity(intent);
            }
        });
        phyl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),Phylology.class);
                startActivity(intent);
            }
        });
        return view;
    }

}
