package com.mind.asvisa.huncon.hunvisa.HunSag;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun1;
import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun2;
import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun3;
import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun4;


public class PageSag extends FragmentPagerAdapter {

    private int numoftab;

    public PageSag(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new saghun1();
            case 1:
                return new saghun2();
            case 2:
                return new saghun3();
            case 3:
                return new saghun4();
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