package com.mind.asvisa.norcon;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.mind.asvisa.MainActivity;
import com.mind.asvisa.MenuItems.MenuBasvuru;
import com.mind.asvisa.MenuItems.MenuGenel;
import com.mind.asvisa.MenuItems.MenuOnemli;
import com.mind.asvisa.MenuItems.MenuRandevu;
import com.mind.asvisa.R;
import com.mind.asvisa.huncon.Hungary;
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
import com.mind.asvisa.norcon.norvisa.NorAile.NorAile;
import com.mind.asvisa.norcon.norvisa.NorEgitim.NorEgitim;
import com.mind.asvisa.norcon.norvisa.NorKult.NorKult;
import com.mind.asvisa.norcon.norvisa.NorResmi.NorResmi;
import com.mind.asvisa.norcon.norvisa.NorSag.NorSag;
import com.mind.asvisa.norcon.norvisa.NorSofor.NorSofor;
import com.mind.asvisa.norcon.norvisa.NorSpor.NorSpor;
import com.mind.asvisa.norcon.norvisa.NorTicari.NorTicari;
import com.mind.asvisa.norcon.norvisa.NorTou.NorTourist;
import com.mind.asvisa.norcon.norvisa.NorTran.NorTransit;
import com.mind.asvisa.norcon.norvisa.Noraea.NorAea;


public class Norway extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11;
    TextView textbas;

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_norway);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();





        textbas = (TextView)findViewById(R.id.textbas);
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
                Intent btn1=new Intent(Norway.this, NorTourist.class);
                startActivity(btn1);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn2=new Intent(Norway.this, NorTicari.class);
                startActivity(btn2);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn3=new Intent(Norway.this, NorAile.class);
                startActivity(btn3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn4=new Intent(Norway.this, NorKult.class);
                startActivity(btn4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn5=new Intent(Norway.this, NorEgitim.class);
                startActivity(btn5);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn6=new Intent(Norway.this, NorTransit.class);
                startActivity(btn6);
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn7=new Intent(Norway.this, NorSag.class);
                startActivity(btn7);
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn8=new Intent(Norway.this, NorSpor.class);
                startActivity(btn8);
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn9=new Intent(Norway.this, NorResmi.class);
                startActivity(btn9);
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn10=new Intent(Norway.this, NorSofor.class);
                startActivity(btn10);
            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent btn11=new Intent(Norway.this, NorAea.class);
                startActivity(btn11);
            }
        });

        textbas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.as-visa.com/docs/english_applicationform.pdf"));
                startActivity(in);
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
