package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FrontCoverActivity extends AppCompatActivity {
    public Button start;
    public TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front_cover1);
        start=(Button)findViewById(R.id.btn);
        text=(TextView)findViewById(R.id.page1);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neo=new Intent(FrontCoverActivity.this, LoginOptionsActivity.class);
                startActivity(neo);
            }
        });
    }
}
