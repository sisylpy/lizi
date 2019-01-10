package com.swolo.lpy.lizi.reserve;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class ReserveFragmentPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments;
    private List<String> title;


    public ReserveFragmentPagerAdapter(FragmentManager fm, List<Fragment> fragments, List<String> title) {
        super(fm);
        this.fragments = fragments;
        this.title = title;
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title.get(position);
    }
}
