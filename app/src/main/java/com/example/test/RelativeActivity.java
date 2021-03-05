package com.example.test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeActivity extends AppCompatActivity {
//------------------
    // member variable--------------------
    //----------------------------
    //member method - override method

    @Override
    protected void onCreate(Bundle savedInstanceState) {
  // contentView 설정
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_frame2);
    }
}