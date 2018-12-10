package com.example.iakov.thessbus;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class HomePageController extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    protected DrawerLayout mDrawerLayout;
    protected ActionBarDrawerToggle mToggle;
    protected Button Ticket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);
        Drawer();
        /*

        if(savedInstanceState== "LoginScreenController"){
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new MainPageController()).commit();}

        */

        /*
        //paei allou (MainPageController)

        Ticket = (Button)findViewById(R.id.ticket);

        Ticket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    Intent intent = new Intent(HomePageController.this,TestActivity.class);
                    startActivity(intent);
                    intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);


            }
        });*/
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void Drawer()
    {
        mDrawerLayout= (DrawerLayout)findViewById(R.id.drawerlayout);
        mToggle= new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView = (NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);

        //navigationView.setCheckedItem(R.id.history);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if(id == R.id.history)
        {
            Toast.makeText(this,"This is History", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(this,HistoryController.class);
            startActivity(intent);
            /*  getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new HistoryController()).commit();*/
        }
        else if(id == R.id.settings)
        {
            Toast.makeText(this,"This is Setting", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.about)
        {
            Toast.makeText(this,"This is About Page", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.deposit)
        {
            Toast.makeText(this,"This is Deposit", Toast.LENGTH_SHORT).show();
        }
        else if(id == R.id.home)
        {
            Intent intent = new Intent(this,HomePageController.class);
            startActivity(intent);
            Toast.makeText(this,"This is Home", Toast.LENGTH_SHORT).show();

        }
        else if(id == R.id.logout)
        {
            //Toast.makeText(this,"This is Logout", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(HomePageController.this, LoginScreenController.class);
            startActivity(intent);
            finish();
        }

        mDrawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }
}
