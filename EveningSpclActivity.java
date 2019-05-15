package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class EveningSpclActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton e1, e2, e3, e4, e5, e6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.evening_spcl7);
        e1 = (ImageButton) findViewById(R.id.eve1);
        e1.setOnClickListener(this);
        e2 = (ImageButton) findViewById(R.id.eve2);
        e2.setOnClickListener(this);
        e3 = (ImageButton) findViewById(R.id.eve3);
        e3.setOnClickListener(this);
        e4 = (ImageButton) findViewById(R.id.eve4);
        e4.setOnClickListener(this);
        e5 = (ImageButton) findViewById(R.id.eve5);
        e5.setOnClickListener(this);
        e6 = (ImageButton) findViewById(R.id.eve6);
        e6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.eve1:
                Intent neo1 = new Intent(EveningSpclActivity.this, OrderTableActivity.class);
                startActivity(neo1);
                break;
            case R.id.eve2:
                Intent neo2 = new Intent(EveningSpclActivity.this, OrderTableActivity.class);
                startActivity(neo2);
                break;
            case R.id.eve3:
                Intent neo3 = new Intent(EveningSpclActivity.this, OrderTableActivity.class);
                startActivity(neo3);
                break;
            case R.id.eve4:
                Intent neo4 = new Intent(EveningSpclActivity.this, OrderTableActivity.class);
                startActivity(neo4);
                break;
            case R.id.eve5:
                Intent neo5 = new Intent(EveningSpclActivity.this, OrderTableActivity.class);
                startActivity(neo5);
                break;

            case R.id.eve6:
                Intent neo6 = new Intent(EveningSpclActivity.this, OrderTableActivity.class);
                startActivity(neo6);
                break;

        }
    }
}
