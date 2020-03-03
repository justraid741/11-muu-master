package com.mind.asvisa.norcon.norvisa.NorSpor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorSpor extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorSpor(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new spornor1();
            case 1:
                return new spornor2();
            case 2:
                return new spornor3();
            case 3:
                return new spornor4();
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