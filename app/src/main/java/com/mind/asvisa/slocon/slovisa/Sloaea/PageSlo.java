package com.mind.asvisa.slocon.slovisa.Sloaea;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSlo extends FragmentPagerAdapter {

    private int numoftab;

    public PageSlo(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new aeaslo1();
            case 1:
                return new aeaslo2();
            case 2:
                return new aeaslo3();
            case 3:
                return new aeaslo4();
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