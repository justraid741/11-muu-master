package com.mind.asvisa.slocon.slovisa.SloSofor;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


public class PageSloSofor extends FragmentPagerAdapter {

    private int numoftab;

    public PageSloSofor(FragmentManager fm, int numOfTab) {
        super(fm);
        this.numoftab = numOfTab;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new soforslo1();
            case 1:
                return new soforslo2();
            case 2:
                return new soforslo3();
            case 3:
                return new soforslo4();
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