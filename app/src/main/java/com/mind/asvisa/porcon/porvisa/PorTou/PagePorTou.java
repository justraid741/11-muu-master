package com.mind.asvisa.porcon.porvisa.PorTou;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorTou extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorTou(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new toupor1();
            case 1:
                return new toupor2();
            case 2:
                return new toupor3();
            case 3:
                return new toupor4();
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