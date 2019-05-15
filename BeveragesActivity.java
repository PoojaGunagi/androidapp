package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class BeveragesActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beverages6);
        bt1 = (ImageButton) findViewById(R.id.bev1);
        bt1.setOnClickListener(this);
        bt2 = (ImageButton) findViewById(R.id.bev2);
        bt2.setOnClickListener(this);
        bt3 = (ImageButton) findViewById(R.id.bev3);
        bt3.setOnClickListener(this);
        bt4 = (ImageButton) findViewById(R.id.bev4);
        bt4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bev1:
                Intent neo1 = new Intent(BeveragesActivity.this, OrderTableActivity.class);
                startActivity(neo1);
                break;
            case R.id.bev2:
                Intent neo2 = new Intent(BeveragesActivity.this, OrderTableActivity.class);
                startActivity(neo2);
                break;
            case R.id.bev3:
                Intent neo3 = new Intent(BeveragesActivity.this, OrderTableActivity.class);
                startActivity(neo3);
                break;
            case R.id.bev4:
                Intent neo4 = new Intent(BeveragesActivity.this, OrderTableActivity.class);
                startActivity(neo4);
                break;

        }
    }
}
