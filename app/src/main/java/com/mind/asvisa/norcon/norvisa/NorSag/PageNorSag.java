package com.mind.asvisa.norcon.norvisa.NorSag;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorSag extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorSag(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new sagnor1();
            case 1:
                return new sagnor2();
            case 2:
                return new sagnor3();
            case 3:
                return new sagnor4();
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