package com.mind.asvisa.norcon.norvisa.NorEgitim;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorEgitim extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorEgitim(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new eginor1();
            case 1:
                return new eginor2();
            case 2:
                return new eginor3();
            case 3:
                return new eginor4();
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