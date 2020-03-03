package com.mind.asvisa.porcon.porvisa.PorTicari;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorTicari extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorTicari(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ticpor1();
            case 1:
                return new ticpor2();
            case 2:
                return new ticpor3();
            case 3:
                return new ticpor4();
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