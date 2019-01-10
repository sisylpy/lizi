package com.swolo.lpy.lizi.Order;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.astuetz.PagerSlidingTabStrip;
import com.swolo.lpy.lizi.Order.adapter.MyFragmentViewAdapter;
import com.swolo.lpy.lizi.Order.fragment.ListViewFragment;
import com.swolo.lpy.lizi.R;

import java.util.ArrayList;
import java.util.List;

public class ToOrderActivity extends AppCompatActivity {

     ViewPager vp;
     PagerSlidingTabStrip pst;
    List<Fragment> list = new ArrayList<>();
    List<String> title = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_order);

        vp = findViewById(R.id.vp1);
        pst = findViewById(R.id.pst1);


        title.add("sports");
        title.add("enjoy");
        title.add("olpic");
        title.add("commerice");
        title.add("inter");

        for (int i = 0; i < 5; i++) {
            Fragment fragment = new ListViewFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("arg",i+1);
            fragment.setArguments(bundle);
            list.add(fragment);
        }

        MyFragmentViewAdapter ma = new MyFragmentViewAdapter(getSupportFragmentManager(),list,title);
        vp.setAdapter(ma);
        pst.setViewPager(vp);
    }
}
