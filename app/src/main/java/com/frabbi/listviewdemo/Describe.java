package com.frabbi.listviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Describe extends AppCompatActivity {
    private TextView textView;
    private ImageView imageView;
    private PlaceInfo placeInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_describe);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null) {
            placeInfo = (PlaceInfo) bundle.getSerializable("obj");
        }
        getSupportActionBar().setTitle(placeInfo.getpName());

        textView = findViewById(R.id.textView);
        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(placeInfo.getpImg());
        textView.setText(placeInfo.getpDesc());

    }
}