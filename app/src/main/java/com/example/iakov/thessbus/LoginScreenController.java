package com.example.iakov.thessbus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginScreenController extends AppCompatActivity {

    protected Button LoginBtn;
    protected EditText Username;
    protected EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen_controller);
        Toast.makeText(LoginScreenController.this,"Hello World",Toast.LENGTH_SHORT).show();
        LoginBtn = (Button)findViewById(R.id.LoginBtn);
        Username = (EditText)findViewById(R.id.username);
        Password = (EditText)findViewById(R.id.password);

        LoginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Username.getText().toString().equals("admin")&& Password.getText().toString().equals("admin"))
                {
                    Intent intent = new Intent(LoginScreenController.this,HomePageController.class);
                    startActivity(intent);
                    Toast.makeText(LoginScreenController.this,"User and Password is correct",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(LoginScreenController.this,"User and Password is not correct",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
