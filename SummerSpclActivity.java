package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SummerSpclActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton s1, s2, s3, s4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.summer_spcl8);
        s1 = (ImageButton) findViewById(R.id.sum1);
        s1.setOnClickListener(this);
        s2 = (ImageButton) findViewById(R.id.sum2);
        s2.setOnClickListener(this);
        s3 = (ImageButton) findViewById(R.id.sum3);
        s3.setOnClickListener(this);
        s4 = (ImageButton) findViewById(R.id.sum4);
        s4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sum1:
                Intent neo1 = new Intent(SummerSpclActivity.this, OrderTableActivity.class);
                startActivity(neo1);
                break;
            case R.id.sum2:
                Intent neo2 = new Intent(SummerSpclActivity.this, OrderTableActivity.class);
                startActivity(neo2);
                break;
            case R.id.sum3:
                Intent neo3 = new Intent(SummerSpclActivity.this, OrderTableActivity.class);
                startActivity(neo3);
                break;
            case R.id.sum4:
                Intent neo4 = new Intent(SummerSpclActivity.this, OrderTableActivity.class);
                startActivity(neo4);
                break;

        }
    }
}
