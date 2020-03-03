package com.mind.asvisa.norcon.norvisa.NorTou;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorTou extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorTou(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tounor1();
            case 1:
                return new tounor2();
            case 2:
                return new tounor3();
            case 3:
                return new tounor4();
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