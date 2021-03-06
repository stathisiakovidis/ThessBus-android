package com.example.iakov.thessbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginScreenController extends AppCompatActivity {

    protected TextView RegisterLink;
    protected Button LoginBtn;
    protected EditText Username;
    protected EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_controller);

        LoginBtn = (Button) findViewById(R.id.LoginBtn);
        Username = (EditText) findViewById(R.id.username);
        Password = (EditText) findViewById(R.id.password);
        RegisterLink = (TextView) findViewById(R.id.registerText);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Username.getText().toString().equals("a") && Password.getText().toString().equals("a")) {
                    Intent intent = new Intent(LoginScreenController.this, HomePageController.class);
                    startActivity(intent);
                    Toast.makeText(LoginScreenController.this, "User and Password is correct", Toast.LENGTH_SHORT).show();
                    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                    finish();
                } else {
                    Toast.makeText(LoginScreenController.this, "User and Password is not correct", Toast.LENGTH_SHORT).show();
                }
            }
        });

        RegisterLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginScreenController.this, RegisterController.class);
                startActivity(intent);
                intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                finish();
            }
        });

    }


    }







}
