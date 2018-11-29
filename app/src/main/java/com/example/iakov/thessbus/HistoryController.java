package com.example.iakov.thessbus;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class HistoryController extends Fragment{
    protected ListView historyitemlist;
    protected ImageView imgview;
    protected TextView datetxt;
    protected TextView bustxt;
    protected TextView pricetxt;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_history_controller,container,false);

    }

   /* @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        historyitemlist = (ListView) view.findViewById(R.id.historyitemlist);
        imgview.setImageResource(R.drawable.qrcode);
        datetxt.setText("14/1/2019");
        bustxt.setText("14A");
        pricetxt.setText("1$");
        historyitemlist.addView(imgview);
        historyitemlist.addView(datetxt);
        historyitemlist.addView(bustxt);
        historyitemlist.addView(pricetxt);
    }*/
}




