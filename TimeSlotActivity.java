package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TimeSlotActivity extends AppCompatActivity implements View.OnClickListener{
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    Button next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.time_slot10);
        b1 = (Button) findViewById(R.id.time1);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.time2);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.time3);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.time4);
        b4.setOnClickListener(this);
        b5 = (Button) findViewById(R.id.time5);
        b5.setOnClickListener(this);
        b6 = (Button) findViewById(R.id.time6);
        b6.setOnClickListener(this);
        b7 = (Button) findViewById(R.id.time7);
        b7.setOnClickListener(this);
        b8 = (Button) findViewById(R.id.time8);
        b8.setOnClickListener(this);
        next=(Button)findViewById(R.id.timebtn);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neo=new Intent(TimeSlotActivity.this, LogoutActivity.class);
                startActivity(neo);
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.time1:
                showToast("Your table will be booked in time slot 09:00am - 10:00am");
                break;
            case R.id.time2:
                showToast("Your table will be booked in time slot 10:30am - 11:30am");
                break;
            case R.id.time3:
                showToast("Your table will be booked in time slot 12:30pm - 01:30pm");
                break;
            case R.id.time4:
                showToast("Your table will be booked in time slot 02:00pm - 03:00pm");
                break;
            case R.id.time5:
                showToast("Your table will be booked in time slot 03:30pm - 04:30pm");
                break;
            case R.id.time6:
                showToast("Your table will be booked in time slot 05:00pm - 06:00pm");
                break;
            case R.id.time7:
                showToast("Your table will be booked in time slot 06:30pm - 07:30pm");
                break;
            case R.id.time8:
                showToast("Your table will be booked in time slot 08:00pm - 09:00pm");
                break;

        }

    }

    private void showToast(String s) {
        Toast.makeText(TimeSlotActivity.this,s,Toast.LENGTH_SHORT).show();
    }
}
