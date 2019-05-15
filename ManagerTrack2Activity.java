package com.example.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ManagerTrack2Activity extends AppCompatActivity {
String bf;
String ln;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main17);
        bf = getIntent().getExtras().getString("ITEM");
        ln=getIntent().getExtras().getString("LUNCH");
        TextView textView = (TextView)findViewById(R.id.tView1);
        textView.setText("Breakfast: "+" "+bf+"\n"+"Lunch: "+" "+ln+"\n");

    }
}
