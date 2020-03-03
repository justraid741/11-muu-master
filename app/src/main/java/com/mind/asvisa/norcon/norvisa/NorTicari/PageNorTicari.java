package com.mind.asvisa.norcon.norvisa.NorTicari;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorTicari extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorTicari(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ticnor1();
            case 1:
                return new ticnor2();
            case 2:
                return new ticnor3();
            case 3:
                return new ticnor4();
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