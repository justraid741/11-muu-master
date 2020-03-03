package com.mind.asvisa.huncon.hunvisa.Hunaea;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageHun extends FragmentPagerAdapter {

    private int numoftab;

    public PageHun(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new aeahun1();
            case 1:
                return new aeahun2();
            case 2:
                return new aeahun3();
            case 3:
                return new aeahun4();
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