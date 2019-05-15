package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ManagerLoginActivity extends AppCompatActivity {
Button manager_login;
EditText manager_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_login);
        manager_pass=(EditText)findViewById(R.id.manager_password);
        manager_login=(Button)findViewById(R.id.submit_btn);
        manager_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = manager_pass.getText().toString();
                if(a.compareTo("123")==0)
                {
                    Intent neo = new Intent(ManagerLoginActivity.this, LoginActivity.class);
                    startActivity(neo);
                       }
                else {
                    showToast("Incorrect password");

                }
            }
        });
    }

    private void showToast(String s) {
        Toast.makeText(ManagerLoginActivity.this,s,Toast.LENGTH_SHORT).show();
    }
}
