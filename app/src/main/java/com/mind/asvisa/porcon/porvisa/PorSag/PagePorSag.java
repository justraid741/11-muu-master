package com.mind.asvisa.porcon.porvisa.PorSag;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorSag extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorSag(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new sagpor1();
            case 1:
                return new sagpor2();
            case 2:
                return new sagpor3();
            case 3:
                return new sagpor4();
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