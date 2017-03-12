package com.example.codept.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.view.View.*;

public class Login extends AppCompatActivity {
private static EditText uname,password;

    private static Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login();
    }

    public void login()
    {
        uname = (EditText) findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);


        bt= (Button)findViewById(R.id.button3);
        bt.setOnClickListener(new OnClickListener()
        {

            @Override
            public void onClick(View view) {
              if (uname.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
                  Toast.makeText(Login.this,"Login as Admin", Toast.LENGTH_SHORT).show();
              }

                else {
                  Toast.makeText(Login.this,"Login unsuccessful", Toast.LENGTH_SHORT).show();
              }

            }
        }
        );
    }

}

