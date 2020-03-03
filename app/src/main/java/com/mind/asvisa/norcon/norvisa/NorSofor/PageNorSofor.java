package com.mind.asvisa.norcon.norvisa.NorSofor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageNorSofor extends FragmentPagerAdapter {

    private int numoftab;

    public PageNorSofor(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new sofornor1();
            case 1:
                return new sofornor2();
            case 2:
                return new sofornor3();
            case 3:
                return new sofornor4();
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