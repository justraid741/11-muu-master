package com.mind.asvisa.porcon.porvisa.PorSofor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorSofor extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorSofor(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new soforpor1();
            case 1:
                return new soforpor2();
            case 2:
                return new soforpor3();
            case 3:
                return new soforpor4();
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