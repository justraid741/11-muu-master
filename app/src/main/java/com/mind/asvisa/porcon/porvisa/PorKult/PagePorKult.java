package com.mind.asvisa.porcon.porvisa.PorKult;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorKult extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorKult(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new kultpor1();
            case 1:
                return new kultpor2();
            case 2:
                return new kultpor3();
            case 3:
                return new kultpor4();
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