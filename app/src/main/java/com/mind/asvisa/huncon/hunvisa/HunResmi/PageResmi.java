package com.mind.asvisa.huncon.hunvisa.HunResmi;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun1;
import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun2;
import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun3;
import com.mind.asvisa.huncon.hunvisa.Hunaea.aeahun4;


public class PageResmi extends FragmentPagerAdapter {

    private int numoftab;

    public PageResmi(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new reshun1();
            case 1:
                return new reshun2();
            case 2:
                return new reshun3();
            case 3:
                return new reshun4();
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