package com.mind.asvisa.huncon.hunvisa.HunD;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.mind.asvisa.R;
import com.mind.asvisa.huncon.hunvisa.Hunaea.PageHun;

public class HunD extends AppCompatActivity {
    private TabLayout pagetab;
    private ViewPager pageview;
    private TabItem page1, page2, page3;
    public PagerAdapter pageD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hun_d);
        pagetab =(TabLayout) findViewById(R.id.pagetab);
        page1 =(TabItem) findViewById(R.id.page1);
        page2 =(TabItem) findViewById(R.id.page2);
        page3 =(TabItem) findViewById(R.id.page3);
        pageview = findViewById(R.id.pageview);


        pageD =new PageD(getSupportFragmentManager(),pagetab.getTabCount());
        pageview.setAdapter(pageD);

        pagetab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageview.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 ){
                    pageD.notifyDataSetChanged();
                } else if (tab.getPosition() == 1 ) {
                    pageD.notifyDataSetChanged();
                }else if (tab.getPosition() == 2 ) {
                    pageD.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        pageview.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(pagetab));
    }
}
