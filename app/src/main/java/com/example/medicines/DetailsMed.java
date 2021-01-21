package com.example.medicines;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailsMed extends AppCompatActivity {


    TextView textView;
    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    TextView textView10;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_med);

        textView= findViewById(R.id.name);
        textView1= findViewById(R.id.textdes1);
        textView2= findViewById(R.id.textdes2);
        textView3= findViewById(R.id.textdes3);
        textView4= findViewById(R.id.textdes4);
        textView5= findViewById(R.id.textdes5);
        textView6= findViewById(R.id.textdes6);
        textView7= findViewById(R.id.textdes7);
        textView8= findViewById(R.id.textdes8);
        textView9= findViewById(R.id.textdes9);
        textView10= findViewById(R.id.textdes10);

        Intent intent = getIntent();

        String detailsname = intent.getStringExtra("medname");
        String details1 = intent.getStringExtra("medDes1");
        String details2 = intent.getStringExtra("medDes2");
        String details3 = intent.getStringExtra("medDes3");
        String details4 = intent.getStringExtra("medDes4");
        String details5 = intent.getStringExtra("medDes5");
        String details6 = intent.getStringExtra("medDes6");
        String details7 = intent.getStringExtra("medDes7");
        String details8 = intent.getStringExtra("medDes8");
        String details9 = intent.getStringExtra("medDes9");
        String details10 = intent.getStringExtra("medDes10");


        textView.setText(detailsname);
        textView1.setText(details1);
        textView2.setText(details2);
        textView3.setText(details3);
        textView4.setText(details4);
        textView5.setText(details5);
        textView6.setText(details6);
        textView7.setText(details7);
        textView8.setText(details8);
        textView9.setText(details9);
        textView10.setText(details10);




    }
}