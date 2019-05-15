package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class LunchActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton l1, l2, l3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lunch5);
        l1 = (ImageButton) findViewById(R.id.lun1);
        l1.setOnClickListener(this);
        l2 = (ImageButton) findViewById(R.id.lun2);
        l2.setOnClickListener(this);
        l3 = (ImageButton) findViewById(R.id.lun3);
        l3.setOnClickListener(this);
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.lun1:
                String x="CHAPATI";
                Intent neo1 = new Intent(LunchActivity.this, OrderTableActivity.class);
                Intent neo8 = new Intent(LunchActivity.this, ManagerTrack2Activity.class);
                neo8.putExtra("LUNCH",x);
                startActivity(neo1);
                startActivity(neo8);
                break;
            case R.id.lun2:
                String y="PULAV";
                Intent neo2 = new Intent(LunchActivity.this, OrderTableActivity.class);
                Intent neo9 = new Intent(LunchActivity.this, ManagerTrack2Activity.class);
                neo9.putExtra("LUNCH",y);
                startActivity(neo2);
                startActivity(neo9);
                break;
            case R.id.lun3:
                String z="CURD RICE";
                Intent neo3 = new Intent(LunchActivity.this, OrderTableActivity.class);
                Intent neo10 = new Intent(LunchActivity.this, ManagerTrack2Activity.class);
                neo10.putExtra("LUNCH",z);
                startActivity(neo3);
                startActivity(neo10);
                break;

        }
    }
}
