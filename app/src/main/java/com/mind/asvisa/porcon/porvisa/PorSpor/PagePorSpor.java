package com.mind.asvisa.porcon.porvisa.PorSpor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorSpor extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorSpor(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new sporpor1();
            case 1:
                return new sporpor2();
            case 2:
                return new sporpor3();
            case 3:
                return new sporpor4();
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