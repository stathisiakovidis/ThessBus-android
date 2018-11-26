package com.example.iakov.thessbus;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent LoginScreen = new Intent(this,LoginScreenController.class);
        startActivity(LoginScreen);

    }
}
