package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class LoginOptionsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_options);
        final RadioGroup radiog = (RadioGroup)findViewById(R.id.rg);
        final RadioButton r1 = (RadioButton) findViewById(R.id.radio_one);
        final RadioButton r2 = (RadioButton) findViewById(R.id.radio_two);
        //final Button go = (Button) findViewById(R.id.apply);
        /*go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r1.isChecked()) {
                    Intent neo1 = new Intent(LoginOptionsActivity.this, ManagerLoginActivity.class);
                    startActivity(neo1);
                }
                if (r2.isChecked()) {
                    Intent neo2 = new Intent(LoginOptionsActivity.this, LoginActivity.class);
                    startActivity(neo2);
                }
            }
        });*/

        r1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent n1=new Intent(LoginOptionsActivity.this, ManagerLoginActivity.class);
                startActivity(n1);
            }
        });

        r2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Intent n2=new Intent(LoginOptionsActivity.this, LoginActivity.class);
                startActivity(n2);
            }
        });
    }
}

