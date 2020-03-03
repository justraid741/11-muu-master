package com.mind.asvisa.huncon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.mind.asvisa.MainActivity;
import com.mind.asvisa.MenuItems.MenuBasvuru;
import com.mind.asvisa.MenuItems.MenuGenel;
import com.mind.asvisa.MenuItems.MenuOnemli;
import com.mind.asvisa.MenuItems.MenuRandevu;
import com.mind.asvisa.R;
import com.mind.asvisa.huncon.hunvisa.HunAile.HunAile;
import com.mind.asvisa.huncon.hunvisa.HunD.HunD;
import com.mind.asvisa.huncon.hunvisa.HunEgitim.HunEgitim;
import com.mind.asvisa.huncon.hunvisa.HunKult.HunKult;
import com.mind.asvisa.huncon.hunvisa.HunResmi.HunResmi;
import com.mind.asvisa.huncon.hunvisa.HunSag.HunSag;
import com.mind.asvisa.huncon.hunvisa.HunSofor.HunSofor;
import com.mind.asvisa.huncon.hunvisa.HunSpor.HunSpor;
import com.mind.asvisa.huncon.hunvisa.HunTicari.HunTicari;
import com.mind.asvisa.huncon.hunvisa.HunTou.HunTourist;
import com.mind.asvisa.huncon.hunvisa.HunTran.HunTransit;
import com.mind.asvisa.huncon.hunvisa.Hunaea.HunAea;


public class Hungary extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

public Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hungary);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();






        btn0 =(Button)findViewById(R.id.btn0);
        btn1 =  (Button)findViewById(R.id.btn1);
        btn2 =  (Button)findViewById(R.id.btn2);
        btn3 =  (Button)findViewById(R.id.btn3);
        btn4 =  (Button)findViewById(R.id.btn4);
        btn5 =  (Button)findViewById(R.id.btn5);
        btn6 =  (Button)findViewById(R.id.btn6);
        btn7 =  (Button)findViewById(R.id.btn7);
        btn8 =  (Button)findViewById(R.id.btn8);
        btn9 =  (Button)findViewById(R.id.btn9);
        btn10 =  (Button)findViewById(R.id.btn10);
        btn11 =  (Button)findViewById(R.id.btn11);


        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn0=new Intent(Hungary.this, HunD.class);
                startActivity(btn0);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1=new Intent(Hungary.this, HunTourist.class);
                startActivity(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2=new Intent(Hungary.this, HunTicari.class);
                startActivity(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3=new Intent(Hungary.this, HunAile.class);
                startActivity(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn4=new Intent(Hungary.this, HunKult.class);
                startActivity(btn4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn5=new Intent(Hungary.this, HunEgitim.class);
                startActivity(btn5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn6=new Intent(Hungary.this, HunTransit.class);
                startActivity(btn6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn7=new Intent(Hungary.this, HunSag.class);
                startActivity(btn7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8=new Intent(Hungary.this, HunSpor.class);
                startActivity(btn8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn9=new Intent(Hungary.this, HunResmi.class);
                startActivity(btn9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn10=new Intent(Hungary.this, HunSofor.class);
                startActivity(btn10);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn11=new Intent(Hungary.this, HunAea.class);
                startActivity(btn11);
            }
        });





    }
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()){

            case R.id.nav_home:
                Intent home=new Intent(this, MainActivity.class);
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
