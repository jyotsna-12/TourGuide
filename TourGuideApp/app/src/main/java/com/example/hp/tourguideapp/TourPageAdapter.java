package com.example.hp.tourguideapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class TourPageAdapter extends FragmentPagerAdapter {

    private Context mContext;
    TourPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }
    @Override
    public int getCount() {
        return 4;
    }
    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = Fragment.instantiate(mContext, HotelFragment.class.getName());
                break;
            case 1:
                fragment = Fragment.instantiate(mContext, EventFragment.class.getName());
                break;
            case 2:
                fragment = Fragment.instantiate(mContext, Market.class.getName());
                break;
            case 3:
                fragment = Fragment.instantiate(mContext, HistoricLocationFragment2.class.getName());
                break;
        }
        return fragment;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.hotels);
        } else if (position == 1) {
            return mContext.getString(R.string.event);
        } else if (position == 2) {
            return mContext.getString(R.string.markets);
        } else {
            return mContext.getString(R.string.history);
        }
    }


}
