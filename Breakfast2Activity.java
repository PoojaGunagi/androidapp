package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Breakfast2Activity extends AppCompatActivity implements View.OnClickListener {
ImageButton b2,b3,b4,b10;
Button n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);
        b2 = (ImageButton) findViewById(R.id.bf);
        b2.setOnClickListener(this);
        b3 = (ImageButton) findViewById(R.id.bf11);
        b3.setOnClickListener(this);
        b4 = (ImageButton) findViewById(R.id.bf12);
        b4.setOnClickListener(this);
        b10 = (ImageButton) findViewById(R.id.bf13);
        b10.setOnClickListener(this);
      /*  n=(Button)findViewById(R.id.button);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neo=new Intent(Breakfast2Activity.this,OrderTableActivity.class);
                startActivity(neo);

            }
        });*/

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bf:
                Intent neo1 = new Intent(Breakfast2Activity.this, OrderTableActivity.class);
                Intent neo8 = new Intent(Breakfast2Activity.this, ManagerTrack2Activity.class);
                neo8.putExtra("ITEM","IDLI-VADA");
                startActivity(neo1);
                startActivity(neo8);
                break;
            case R.id.bf11:
                Intent neo2 = new Intent(Breakfast2Activity.this, OrderTableActivity.class);
                Intent neo9 = new Intent(Breakfast2Activity.this, ManagerTrack2Activity.class);
                neo9.putExtra("ITEM","SIRA");
                startActivity(neo2);
                startActivity(neo9);
                break;
            case R.id.bf12:
                Intent neo3 = new Intent(Breakfast2Activity.this, OrderTableActivity.class);
                Intent neo10 = new Intent(Breakfast2Activity.this, ManagerTrack2Activity.class);
                neo10.putExtra("ITEM","VEGETABLE DOSA");
                startActivity(neo3);
                startActivity(neo10);
                break;
            case R.id.bf13:
                Intent neo4 = new Intent(Breakfast2Activity.this, OrderTableActivity.class);
                Intent neo11 = new Intent(Breakfast2Activity.this, ManagerTrack2Activity.class);
                neo11.putExtra("ITEM","UPMA");
                startActivity(neo4);
                startActivity(neo11);
                break;
    }
}
}
