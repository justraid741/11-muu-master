package com.mind.asvisa.slocon.slovisa.SloTou;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSloTou extends FragmentPagerAdapter {

    private int numoftab;

    public PageSloTou(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new touslo1();
            case 1:
                return new touslo2();
            case 2:
                return new touslo3();
            case 3:
                return new touslo4();
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