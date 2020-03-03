package com.mind.asvisa.porcon.porvisa.PorTran;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PagePorTran extends FragmentPagerAdapter {

    private int numoftab;

    public PagePorTran(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new tranpor1();
            case 1:
                return new tranpor2();
            case 2:
                return new tranpor3();
            case 3:
                return new tranpor4();
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