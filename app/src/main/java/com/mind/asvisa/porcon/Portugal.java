package com.mind.asvisa.porcon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
import com.mind.asvisa.MainActivity;
import com.mind.asvisa.MenuItems.MenuBasvuru;
import com.mind.asvisa.MenuItems.MenuGenel;
import com.mind.asvisa.MenuItems.MenuOnemli;
import com.mind.asvisa.MenuItems.MenuRandevu;
import com.mind.asvisa.R;
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

public class Portugal extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    public Button  btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugal);


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
                Intent btn1=new Intent(Portugal.this, PorTourist.class);
                startActivity(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2=new Intent(Portugal.this, PorTicari.class);
                startActivity(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3=new Intent(Portugal.this, PorAile.class);
                startActivity(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn4=new Intent(Portugal.this, PorKult.class);
                startActivity(btn4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn5=new Intent(Portugal.this, PorEgitim.class);
                startActivity(btn5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn6=new Intent(Portugal.this, PorTransit.class);
                startActivity(btn6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn7=new Intent(Portugal.this, PorSag.class);
                startActivity(btn7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8=new Intent(Portugal.this, PorSpor.class);
                startActivity(btn8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn9=new Intent(Portugal.this, PorResmi.class);
                startActivity(btn9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn10=new Intent(Portugal.this, PorSofor.class);
                startActivity(btn10);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn11=new Intent(Portugal.this, PorAea.class);
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

