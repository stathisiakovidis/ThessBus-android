package com.example.iakov.thessbus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class TestActivity extends HomePageController {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Drawer();
    }
}
