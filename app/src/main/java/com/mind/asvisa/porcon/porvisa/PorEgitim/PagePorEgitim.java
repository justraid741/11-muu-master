package com.mind.asvisa.porcon.porvisa.PorEgitim;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorEgitim extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorEgitim(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new egipor1();
            case 1:
                return new egipor2();
            case 2:
                return new egipor3();
            case 3:
                return new egipor4();
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