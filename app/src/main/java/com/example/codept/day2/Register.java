package com.example.codept.day2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    private static EditText name,email,pass,cpass,cont;
    private static Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register();
    }

    public void register(){
        name = (EditText) findViewById(R.id.editText3);
        email = (EditText) findViewById(R.id.editText4);
        pass = (EditText) findViewById(R.id.editText5);
        cpass = (EditText) findViewById(R.id.editText7);
        cont = (EditText) findViewById(R.id.editText6);

        btn = (Button)findViewById(R.id.button4);
        btn.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v) {
                if (cpass.getText().toString().equals("admin") && pass.getText().toString().equals("admin")) {
                    Toast.makeText(Register.this,"register successful", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(Register.this,"Login unsuccessful", Toast.LENGTH_SHORT).show();
                }

            }
        }
        );
    }
}
