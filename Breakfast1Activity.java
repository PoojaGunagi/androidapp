package com.example.sample;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Breakfast1Activity extends AppCompatActivity implements View.OnClickListener{
    ImageButton b2,b3,b4;
    ImageButton b10;
    Button n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfast4);
        b2 = (ImageButton) findViewById(R.id.bf2);
        b2.setOnClickListener(this);
        b3 = (ImageButton) findViewById(R.id.bf3);
        b3.setOnClickListener(this);
        b4 = (ImageButton) findViewById(R.id.bf4);
        b4.setOnClickListener(this);
        b10 = (ImageButton) findViewById(R.id.bf10);
        b10.setOnClickListener(this);
        n=(Button)findViewById(R.id.button3);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent neo=new Intent(Breakfast1Activity.this, Breakfast2Activity.class);
                startActivity(neo);
            }
        });

    }
    public void onClick(View v)
    {
    switch(v.getId())
                {

                    case R.id.bf2:
                        Intent neo2=new Intent(Breakfast1Activity.this, OrderTableActivity.class);
                        startActivity(neo2);
                        break;
                    case R.id.bf3:
                        Intent neo3=new Intent(Breakfast1Activity.this, OrderTableActivity.class);
                        startActivity(neo3);
                        break;
                    case R.id.bf4:
                        Intent neo4=new Intent(Breakfast1Activity.this, OrderTableActivity.class);
                        startActivity(neo4);
                        break;

                    case R.id.bf10:
                        Intent neo10=new Intent(Breakfast1Activity.this, OrderTableActivity.class);
                        startActivity(neo10);
                        break;

                }

            }


}


