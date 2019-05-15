package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManagerTrack1Activity extends AppCompatActivity {
String Name;
String Password;
String Lunch;
String Item;
Button g;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);
        Name = getIntent().getExtras().getString("NAME");
        Password=getIntent().getExtras().getString("PASSWORD");
        g=(Button)findViewById(R.id.buttn);
        g.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent neo=new Intent(ManagerTrack1Activity.this, ManagerTrack2Activity.class);
                startActivity(neo);
            }
        });
       // Item=getIntent().getExtras().getString("ITEM");
        //Lunch=getIntent().getExtras().getString("LUNCH");
        TextView textView = (TextView)findViewById(R.id.tView);
        textView.setText("Name: "+" "+Name+"\n"+"Password: "+" "+Password+"\n");


    }
}
