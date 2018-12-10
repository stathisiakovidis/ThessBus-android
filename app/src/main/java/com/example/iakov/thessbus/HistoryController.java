package com.example.iakov.thessbus;

import android.os.Bundle;
import android.widget.ListView;

public class HistoryController extends HomePageController{
    protected ListView historyitemlist;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history_controller);
        Drawer();
    }

}




