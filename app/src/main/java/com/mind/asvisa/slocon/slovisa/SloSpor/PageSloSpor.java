package com.mind.asvisa.slocon.slovisa.SloSpor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSloSpor extends FragmentPagerAdapter {

    private int numoftab;

    public PageSloSpor(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new sporslo1();
            case 1:
                return new sporslo2();
            case 2:
                return new sporslo3();
            case 3:
                return new sporslo4();
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