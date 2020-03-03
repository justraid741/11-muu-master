package com.mind.asvisa.huncon.hunvisa.HunAile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageHunAile extends FragmentPagerAdapter {

    private int numoftab;

    public PageHunAile(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new hunaile1();
            case 1:
                return new hunaile2();
            case 2:
                return new hunaile3();
            case 3:
                return new hunaile4();
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return numoftab;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }


}