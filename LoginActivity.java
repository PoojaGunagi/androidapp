  package com.example.sample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
   EditText UserNameEt,PasswordEt;
    Button manage;
   @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);
       UserNameEt=(EditText)findViewById(R.id.editText);
        PasswordEt=(EditText)findViewById(R.id.pswd);
        manage=(Button)findViewById(R.id.manager);
        manage.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                String name = UserNameEt.getText().toString();
                String passsword = PasswordEt.getText().toString();
                Intent intent = new Intent(LoginActivity.this, ManagerTrack1Activity.class);
                intent.putExtra("NAME",name);
                intent.putExtra("PASSWORD",passsword);
                startActivity(intent);
            }
        });
    }



    /*
    public void onLogin(View view) {
       String username=UserNameEt.getText().toString();
       String password=PasswordEt.getText().toString();
       String method="login";
       BackgroundWorker bg=new BackgroundWorker(this);
       bg.execute(method,username,password);
    }*/

    public void userReg(View view)
    {
        Intent intent=new Intent(LoginActivity.this, MainMenuActivity.class);
        startActivity(intent);
        String username=UserNameEt.getText().toString();
        String password=PasswordEt.getText().toString();
        String method="register";
        BackgroundTask bg1=new BackgroundTask(this);
        bg1.execute(method,username,password);
    }
}
