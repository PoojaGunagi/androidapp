package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenuActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1, b2, b3, b4, b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu3);
        b1 = (Button) findViewById(R.id.btn1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.btn2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.btn3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.btn4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.btn5);
        b5.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                Intent neo1 = new Intent(MainMenuActivity.this, Breakfast1Activity.class);
                startActivity(neo1);
                break;
            case R.id.btn2:
                Intent neo2 = new Intent(MainMenuActivity.this, LunchActivity.class);
                startActivity(neo2);
                break;
            case R.id.btn3:
                Intent neo3 = new Intent(MainMenuActivity.this, BeveragesActivity.class);
                startActivity(neo3);
                break;
            case R.id.btn4:
                Intent neo4 = new Intent(MainMenuActivity.this, EveningSpclActivity.class);
                startActivity(neo4);
                break;
            case R.id.btn5:
                Intent neo5 = new Intent(MainMenuActivity.this, SummerSpclActivity.class);
                startActivity(neo5);
                break;
        }
    }
}


