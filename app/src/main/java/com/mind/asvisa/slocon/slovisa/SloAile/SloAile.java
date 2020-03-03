package com.mind.asvisa.slocon.slovisa.SloAile;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.mind.asvisa.R;

public class SloAile extends AppCompatActivity {
    private TabLayout pagetab;
    private ViewPager pageview;
    private TabItem page1, page2, page3, page4 ;
    public PagerAdapter pageHunAile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hun_aile);

        pagetab =(TabLayout) findViewById(R.id.pagetab);
        page1 =(TabItem) findViewById(R.id.page1);
        page2 =(TabItem) findViewById(R.id.page2);
        page3 =(TabItem) findViewById(R.id.page3);
        page4 =(TabItem) findViewById(R.id.page4);
        pageview = findViewById(R.id.pageview);

        pageHunAile =new PagSloAile(getSupportFragmentManager(),pagetab.getTabCount());
        pageview.setAdapter(pageHunAile);

        pagetab.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pageview.setCurrentItem(tab.getPosition());
                if (tab.getPosition() == 0 ){
                    pageHunAile.notifyDataSetChanged();
                } else if (tab.getPosition() == 1 ) {
                    pageHunAile.notifyDataSetChanged();
                }else if (tab.getPosition() == 2 ) {
                    pageHunAile.notifyDataSetChanged();
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
