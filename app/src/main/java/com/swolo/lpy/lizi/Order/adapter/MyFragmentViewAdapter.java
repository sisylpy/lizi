package com.swolo.lpy.lizi.Order.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class MyFragmentViewAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;
    private  List<String> title;
    private Context context;

    public MyFragmentViewAdapter(FragmentManager fm, List<Fragment> list, List<String> title) {
        super(fm);
        this.title = title;
        this.list = list;
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }

    @Override
    public int getCount() {
        return list.size();
    }

   public CharSequence getPageTitle(int i ){

        return  title.get(i);

    }

}
