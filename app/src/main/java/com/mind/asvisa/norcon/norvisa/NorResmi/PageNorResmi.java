package com.mind.asvisa.norcon.norvisa.NorResmi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorResmi extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorResmi(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new resnor1();
            case 1:
                return new resnor2();
            case 2:
                return new resnor3();
            case 3:
                return new resnor4();
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