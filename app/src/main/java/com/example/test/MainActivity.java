package com.example.test;


import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
// 멤버 면수 선언---------------------------
    private final static String TAG = "TEST APP" ;  //로그 출력 시 구분자
    //ui-------
    private LinearLayout joinLAY ;
    private TextView titleTXT;
    //Control------------
    private Random       random  ;
   //-----------------------

    // 멤버 메서드
    // AppCompatActivity 's method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // 사용자에게 보여지는 화면 설정

        setContentView(R.layout.join);
//디버깅을 위한 로그 출력
        Log.i(TAG,  "onCreate()");
        // 간단한 메세지 창 띄우기
        Toast.makeText( MainActivity.this,  "My App create~",Toast.LENGTH_LONG).show();

        //ui 요소 객체 가져오기
        joinLAY = (LinearLayout)findViewById(R.id.joinLAY);
        joinLAY.setBackgroundColor(Color.rgb(255,0,225)) ;

        titleTXT=findViewById(R.id.titleTXT);


    }

    // onClick 속성 지원 Method------------
    //ui 요소 중 온 클릭 속성 설정한 경우 실행되는 매서드
   /* public void clickFun(View v){
        if(v.getId() == R.id.cancel)
        Toast.makeText( MainActivity.this,  "취소다 임마",Toast.LENGTH_LONG).show();
        else if(v.getId()==R.id.join)
        Toast.makeText( MainActivity.this,  "회원가입 하자",Toast.LENGTH_LONG).show();
    }*/

    /* 버튼 눌렀을때 배경 색 바꾸기
    public void background(View v) {
        if (v.getId() == R.id.join)
            joinLAY.setBackgroundColor(Color.RED);
        else if (v.getId() == R.id.cancel)
//            Toast.makeText( MainActivity.this,  "회원가입 하자",Toast.LENGTH_LONG).show();
            joinLAY.setBackgroundColor(Color.BLUE);
    }*/
    // 랜덤으로 배경색 바꾸기
    public void background(View v) {
        int red = 0 ;
        int blue = 0 ;
        int green = 0 ;
        if (v.getId() == R.id.join)
            red=(int)(Math.random()*255);
            blue=(int)(Math.random()*255);
            green=(int)(Math.random()*255);
            joinLAY.setBackgroundColor(Color.rgb(red,green,blue));
    }

    // 선생님 랜덤 배경색
   /* public void background(View v) {
        if (v.getId() == R.id.join)
            joinLAY.setBackgroundColor(Color.RED);
        titleTXT.setVisibility(View.INVISIBLE);
        else if (v.getId() == R.id.cancel)
//            Toast.makeText( MainActivity.this,  "회원가입 하자",Toast.LENGTH_LONG).show();
            joinLAY.setBackgroundColor(Color.rgb(random.nextInt(255),
                    random.nextInt(255),
                    random.nextInt(255)));
        titleTXT.setVisibility(View.VISIBLE);*/
       // else if (v.getId()==R.id.titleTXT)
        //Log.i(TAG,"title click");
    }
