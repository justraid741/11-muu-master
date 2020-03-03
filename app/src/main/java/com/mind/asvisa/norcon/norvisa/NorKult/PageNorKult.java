package com.mind.asvisa.norcon.norvisa.NorKult;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorKult extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorKult(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new kultnor1();
            case 1:
                return new kultnor2();
            case 2:
                return new kultnor3();
            case 3:
                return new kultnor4();
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