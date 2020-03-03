package com.mind.asvisa.slocon.slovisa.SloTicari;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSloTicari extends FragmentPagerAdapter {

    private int numoftab;

    public PageSloTicari(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ticslo1();
            case 1:
                return new ticslo2();
            case 2:
                return new ticslo3();
            case 3:
                return new ticslo4();
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