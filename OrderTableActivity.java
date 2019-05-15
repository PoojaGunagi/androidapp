package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OrderTableActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton t1, t2, t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.order_table9);
        t1 = (ImageButton) findViewById(R.id.tab1);
        t1.setOnClickListener(this);
        t2 = (ImageButton) findViewById(R.id.tab2);
        t2.setOnClickListener(this);
        t3 = (ImageButton) findViewById(R.id.tab3);
        t3.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tab1:
                Intent neo1 = new Intent(OrderTableActivity.this, TimeSlotActivity.class);
                startActivity(neo1);
                break;
            case R.id.tab2:
                Intent neo2 = new Intent(OrderTableActivity.this, TimeSlotActivity.class);
                startActivity(neo2);
                break;
            case R.id.tab3:
                Intent neo3 = new Intent(OrderTableActivity.this, TimeSlotActivity.class);
                startActivity(neo3);
                break;
        }
    }
}
