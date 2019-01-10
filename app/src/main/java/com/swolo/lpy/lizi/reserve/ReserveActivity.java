package com.swolo.lpy.lizi.reserve;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;

import com.astuetz.PagerSlidingTabStrip;
import com.swolo.lpy.lizi.Order.fragment.ListViewFragment;
import com.swolo.lpy.lizi.R;

import java.util.List;

public class ReserveActivity extends AppCompatActivity {
     FrameLayout fm;
     PagerSlidingTabStrip psts;
     ViewPager vp;
     List<Fragment> fragments;
     List<String> title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserve);

        fm = findViewById(R.id.res_fl);
        psts = findViewById(R.id.res_psts);
        vp = findViewById(R.id.res_vp);


        title.add("sports");
        title.add("enjoy");
        title.add("olpic");
        title.add("commerice");
        title.add("inter");

        for (int i = 0; i < 5; i++) {
            Fragment fragment = new ReserveViewFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("arg",i+1);
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }


        ReserveFragmentPagerAdapter ofdp = new ReserveFragmentPagerAdapter(getSupportFragmentManager(), fragments, title);
        vp.setAdapter(ofdp);
        psts.setViewPager(vp);


    }
}
