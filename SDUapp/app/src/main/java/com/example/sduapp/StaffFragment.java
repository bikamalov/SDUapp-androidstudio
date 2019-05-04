package com.example.sduapp;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class StaffFragment extends Fragment {
    private View v;
    private RecyclerView myrecyclerView2;
    static List<Staff> listStaff;

    public StaffFragment() {

    }
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        listStaff = new ArrayList<>();
        listStaff.add(new Staff("Meirambek Zhaparov","Engeneering and Natural Science","Dean",R.drawable.zhaparov));
        listStaff.add(new Staff("Kanat Kozhakhmet","Rectorate","Rector",R.drawable.kozhakhmet));
        listStaff.add(new Staff("Askar Jumadildayev","Department of Mathematics and Natural Sciences","Профессор",R.drawable.jumadildayev));
        listStaff.add(new Staff("Talgat Yechshzhanov","Faculty of education and humanities","Dean",R.drawable.yechshzhanov));
        listStaff.add(new Staff("Kurmangazy Sadykbekov","Department of Philology","Professor",R.drawable.sadykbekov));
        listStaff.add(new Staff("Meirambek Zhaparov","Engeneering and Natural Science","Dean",R.drawable.zhaparov));
        listStaff.add(new Staff("Kanat Kozhakhmet","Rectorate","Rector",R.drawable.kozhakhmet));
        listStaff.add(new Staff("Askar Jumadildayev","Department of Mathematics and Natural Sciences","Профессор",R.drawable.jumadildayev));
        listStaff.add(new Staff("Talgat Yechshzhanov","Faculty of education and humanities","Dean",R.drawable.yechshzhanov));
        listStaff.add(new Staff("Kurmangazy Sadykbekov","Department of Philology","Professor",R.drawable.sadykbekov));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.fragment_staff,container,false);
        myrecyclerView2 = v.findViewById(R.id.staff_recyclerview);
        RecyclerViewAdapter2 recyclerViewAdapter2 = new RecyclerViewAdapter2(getContext(),listStaff);
        myrecyclerView2.setLayoutManager(new LinearLayoutManager(getActivity()));
        myrecyclerView2.setAdapter(recyclerViewAdapter2);
        return v;
    }

}
