package com.mind.asvisa.slocon.slovisa.Sloaea;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.mind.asvisa.R;

public class SloAea extends AppCompatActivity {
    private TabLayout pagetab;
    private ViewPager pageview;
    private TabItem page1, page2, page3, page4 ;
    public PagerAdapter pageHun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hun_aea);

        pagetab =(TabLayout) findViewById(R.id.pagetab);
        page1 =(TabItem) findViewById(R.id.page1);
        page2 =(TabItem) findViewById(R.id.page2);
        page3 =(TabItem) findViewById(R.id.page3);
        page4 =(TabItem) findViewById(R.id.page4);
        pageview = findViewById(R.id.pageview);


        pageHun =new PageSlo(getSupportFragmentManager(),pagetab.getTabCount());
        pageview.setAdapter(pageHun);

        pagetab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageview.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 ){
                    pageHun.notifyDataSetChanged();
                } else if (tab.getPosition() == 1 ) {
                    pageHun.notifyDataSetChanged();
                }else if (tab.getPosition() == 2 ) {
                    pageHun.notifyDataSetChanged();
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
