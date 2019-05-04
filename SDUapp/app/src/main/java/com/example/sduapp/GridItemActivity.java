package com.example.sduapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class GridItemActivity extends AppCompatActivity {
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_item);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        imageView.setImageResource(intent.getIntExtra("image",0));
    }
}
