package com.mind.asvisa;


import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.google.android.material.navigation.NavigationView;
import com.mind.asvisa.MenuItems.MenuBasvuru;
import com.mind.asvisa.MenuItems.MenuGenel;
import com.mind.asvisa.MenuItems.MenuHome;
import com.mind.asvisa.MenuItems.MenuOnemli;
import com.mind.asvisa.MenuItems.MenuRandevu;
import com.mind.asvisa.huncon.Hungary;
import com.mind.asvisa.norcon.Norway;
import com.mind.asvisa.porcon.Portugal;
import com.mind.asvisa.slocon.Slovak;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {


    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Menu menu;
    TextView textView;
    ImageButton macar, portugal, norway, slovak;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        macar = findViewById(R.id.macar);
        portugal = findViewById(R.id.portugal);
        norway = findViewById(R.id.norway);
        slovak = findViewById(R.id.slovak);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        textView = findViewById(R.id.textView);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();




        macar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, Hungary.class);
                startActivity(int1);
            }
        });
        portugal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this, Portugal.class);
                startActivity(int2);
            }
        });
        norway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(MainActivity.this, Norway.class);
                startActivity(int3);
            }
        });
        portugal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(MainActivity.this, Portugal.class);
                startActivity(int4);
            }
        });
        slovak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int5 = new Intent(MainActivity.this, Slovak.class);
                startActivity(int5);
            }
        });



    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){

            case R.id.nav_home:
                    Intent home=new Intent(MainActivity.this, MainActivity.class);
                    this.startActivity(home);
            break;
            case R.id.nav_randevu:
                Intent ran=new Intent(this, MenuRandevu.class);
                this.startActivity(ran);
                break;
            case R.id.nav_genel:
                Intent gen=new Intent(this, MenuGenel.class);
                this.startActivity(gen);
                break;
            case R.id.nav_basvuru:
                Intent bas=new Intent(this, MenuBasvuru.class);
                this.startActivity(bas);
                break;
            case R.id.nav_onemli:
                Intent on=new Intent(this, MenuOnemli.class);
                this.startActivity(on);
                break;

        }
        return true;
    }

    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    }












