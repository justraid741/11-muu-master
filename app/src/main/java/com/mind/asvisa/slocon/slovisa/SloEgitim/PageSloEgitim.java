package com.mind.asvisa.slocon.slovisa.SloEgitim;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSloEgitim extends FragmentPagerAdapter {

    private int numoftab;

    public PageSloEgitim(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new egislo1();
            case 1:
                return new egislo2();
            case 2:
                return new egislo3();
            case 3:
                return new egislo4();
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