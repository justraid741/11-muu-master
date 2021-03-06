package com.mind.asvisa.MenuItems;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
import com.mind.asvisa.MainActivity;
import com.mind.asvisa.MenuAdds.EkServisler;
import com.mind.asvisa.MenuAdds.Guvenlik_duzenlemeleri;
import com.mind.asvisa.MenuAdds.YararliLinkler;
import com.mind.asvisa.R;

public class MenuGenel extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    Button y, ek, guv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_genel);
        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        toolbar = findViewById(R.id.toolbar);
        y = findViewById(R.id.y_btn);
        ek = findViewById(R.id.ek_btn);
        guv = findViewById(R.id.guv_btn);

        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y= new Intent(MenuGenel.this, YararliLinkler.class);
                startActivity(y);

            }
        });
        ek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y= new Intent(MenuGenel.this, EkServisler.class);
                startActivity(y);

            }
        });
        guv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y= new Intent(MenuGenel.this, Guvenlik_duzenlemeleri.class);
                startActivity(y);

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

