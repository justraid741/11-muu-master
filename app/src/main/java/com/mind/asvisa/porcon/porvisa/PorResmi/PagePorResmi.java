package com.mind.asvisa.porcon.porvisa.PorResmi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorResmi extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorResmi(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new respor1();
            case 1:
                return new respor2();
            case 2:
                return new respor3();
            case 3:
                return new respor4();
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