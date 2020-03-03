package com.mind.asvisa.slocon.slovisa.SloKult;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSloKult extends FragmentPagerAdapter {

    private int numoftab;

    public PageSloKult(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new kultslo1();
            case 1:
                return new kultslo2();
            case 2:
                return new kultslo3();
            case 3:
                return new kultslo4();
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