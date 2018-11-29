package com.example.iakov.thessbus;


import android.os.Bundle;
import android.support.design.widget.NavigationView;

public class TestActivity extends HomePageController implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Drawer();

    }


}
