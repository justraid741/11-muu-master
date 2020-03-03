package com.mind.asvisa.slocon.slovisa.SloAile;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagSloAile extends FragmentPagerAdapter {

    private int numoftab;

    public PagSloAile(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new sloaile1();
            case 1:
                return new sloaile2();
            case 2:
                return new sloaile3();
            case 3:
                return new sloaile4();
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