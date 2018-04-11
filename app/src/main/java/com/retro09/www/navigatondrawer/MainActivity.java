package com.retro09.www.navigatondrawer;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DrawerLayout
        mDrawerLayout=(DrawerLayout) findViewById(R.id.drawer);
        mToggle= new ActionBarDrawerToggle(this,mDrawerLayout, R.string.open,R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id=item.getItemId();
        if(id ==R.id.sush){
            Toast.makeText(this, "Sushant", Toast.LENGTH_SHORT).show();
            Intent sush = new Intent(MainActivity.this,Sushant.class);
            startActivity(sush);
        }
        if(id ==R.id.jit){
            Toast.makeText(this, "Jitender", Toast.LENGTH_SHORT).show();
            Intent jit = new Intent(MainActivity.this,Jitender.class);
            startActivity(jit);
        }
        if(id ==R.id.tan){
            Toast.makeText(this, "Tanmay", Toast.LENGTH_SHORT).show();
            Intent tan = new Intent(MainActivity.this,Tanmay.class);
            startActivity(tan);
        }
        if(id ==R.id.tar){
            Toast.makeText(this, "Taranjot", Toast.LENGTH_SHORT).show();
            Intent tar = new Intent(MainActivity.this,Taranjot.class);
            startActivity(tar);
        }

        return false;
    }
}
