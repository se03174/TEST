package com.example.test;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class FrameActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame2);
    }

    //------------
    // member method - onclick attr method
    //-------------------
    public void onClick(View v) {

            v.setVisibility(View.GONE);

    }
}

