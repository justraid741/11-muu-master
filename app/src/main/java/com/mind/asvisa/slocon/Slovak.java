package com.mind.asvisa.slocon;

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
import com.mind.asvisa.porcon.Portugal;
import com.mind.asvisa.porcon.porvisa.PorAile.PorAile;
import com.mind.asvisa.porcon.porvisa.PorEgitim.PorEgitim;
import com.mind.asvisa.porcon.porvisa.PorKult.PorKult;
import com.mind.asvisa.porcon.porvisa.PorResmi.PorResmi;
import com.mind.asvisa.porcon.porvisa.PorSag.PorSag;
import com.mind.asvisa.porcon.porvisa.PorSofor.PorSofor;
import com.mind.asvisa.porcon.porvisa.PorSpor.PorSpor;
import com.mind.asvisa.porcon.porvisa.PorTicari.PorTicari;
import com.mind.asvisa.porcon.porvisa.PorTou.PorTourist;
import com.mind.asvisa.porcon.porvisa.PorTran.PorTransit;
import com.mind.asvisa.porcon.porvisa.Poraea.PorAea;
import com.mind.asvisa.slocon.slovisa.SloAile.SloAile;
import com.mind.asvisa.slocon.slovisa.SloEgitim.SloEgitim;
import com.mind.asvisa.slocon.slovisa.SloKult.SloKult;
import com.mind.asvisa.slocon.slovisa.SloResmi.SloResmi;
import com.mind.asvisa.slocon.slovisa.SloSag.SloSag;
import com.mind.asvisa.slocon.slovisa.SloSofor.SloSofor;
import com.mind.asvisa.slocon.slovisa.SloSpor.SloSpor;
import com.mind.asvisa.slocon.slovisa.SloTicari.SloTicari;
import com.mind.asvisa.slocon.slovisa.SloTou.SloTourist;
import com.mind.asvisa.slocon.slovisa.SloTran.SloTransit;
import com.mind.asvisa.slocon.slovisa.Sloaea.SloAea;

public class Slovak extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    public Button  btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slovak);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();






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



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn1=new Intent(Slovak.this, SloTourist.class);
                startActivity(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2=new Intent(Slovak.this, SloTicari.class);
                startActivity(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3=new Intent(Slovak.this, SloAile.class);
                startActivity(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn4=new Intent(Slovak.this, SloKult.class);
                startActivity(btn4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn5=new Intent(Slovak.this, SloEgitim.class);
                startActivity(btn5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn6=new Intent(Slovak.this, SloTransit.class);
                startActivity(btn6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn7=new Intent(Slovak.this, SloSag.class);
                startActivity(btn7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8=new Intent(Slovak.this, SloSpor.class);
                startActivity(btn8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn9=new Intent(Slovak.this, SloResmi.class);
                startActivity(btn9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn10=new Intent(Slovak.this, SloSofor.class);
                startActivity(btn10);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn11=new Intent(Slovak.this, SloAea.class);
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

