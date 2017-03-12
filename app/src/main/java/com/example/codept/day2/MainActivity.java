package com.example.codept.day2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
   Button btn1,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 =(Button)findViewById(R.id.button);
        btn2 =(Button)findViewById(R.id.button2);
        openLogin();
        openRegister();
    }

    public void openLogin(){


        btn1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.codept.day2.Login");
                startActivity(intent);
            }
        }
        );

    }

    public void openRegister(){


        btn2.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.example.codept.day2.Register");
                startActivity(intent);
            }
        }
        );

    }
}
