package com.swolo.lpy.lizi.recylerView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.astuetz.PagerSlidingTabStrip;
import com.swolo.lpy.lizi.R;

import java.util.ArrayList;
import java.util.List;

public class OrderAppActivity extends AppCompatActivity {
    private RecyclerView rev1;
    private ViewPager viewPager1 ;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private  String[] titles;
    List<Fragment> list;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_app);
        titles = new String[] {"a","b"};
        list = new ArrayList<>();





//        rev1 = findViewById(R.id.rev_01);
//        rev1.setLayoutManager(new LinearLayoutManager(OrderAppActivity.this));
//        rev1.addItemDecoration(new SimpleDividerDecoration(this));
//        rev1.addItemDecoration(new LeftAndRightTagDecoration(this));
//        rev1.setAdapter(new OrderListAdatper(OrderAppActivity.this));
//        mSectionsPagerAdapter = new TextAdapter (getSupportFragmentManager(),titles,list);


        viewPager1 = findViewById(R.id.vp_order);
//        viewPager1.setAdapter(mSectionsPagerAdapter);
        viewPager1.setAdapter(new TextAdapter(getSupportFragmentManager(), titles, list));

        // Bind the tabs to the ViewPager
        PagerSlidingTabStrip tabs = findViewById(R.id.tabs);





// 设置Tab底部选中的指示器 Indicator的颜色
        tabs.setIndicatorColor(getResources().getColor(R.color.colorAccent));
        //设置Tab标题文字的颜色
        tabs.setTextColor(getResources().getColor(R.color.colorPrimary));
        // 设置Tab标题文字的大小
        tabs.setTextSize(16);
        //设置Tab底部分割线的颜色
        tabs.setUnderlineColor(getResources().getColor(R.color.colorPrimary));
        // 设置点击某个Tab时的背景色,设置为0时取消背景色
        tabs.setTabBackground(0);
        // 设置Tab是自动填充满屏幕的
        tabs.setShouldExpand(true);
        //!!!设置选中的Tab文字的颜色!!!

//        tabs.setSelectedTextColor(getResources().getColor(R.color.colorPrimary));

        //tab间的分割线
        tabs.setDividerColor(getResources().getColor(R.color.colorPrimary));
        //底部横线与字体宽度一致
//        tabs.setIndicatorinFollower(true);


        tabs.setViewPager(viewPager1);


    }



    class TextAdapter extends FragmentPagerAdapter {
        String[] titles;
        List<Fragment> lists = new ArrayList<>();

        public TextAdapter(FragmentManager fm, String[] titles, List<Fragment> list) {
            super(fm);
            this.titles = titles;
            this.lists = list;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles[position];
        }

        @Override
        public Fragment getItem(int position) {
            return lists.get(position);
        }

        @Override
        public int getCount() {
            return lists.size();
        }
    }

//// continued from above
//tabs.setOnPageChangeListener(mPageChangeListener);

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }
     class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            // getItem is called to instantiate the fragment for the given page.
            // Return a PlaceholderFragment (defined as a static inner class below).
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }




//    https://www.jianshu.com/p/b46a4ff7c10a
    public class SimpleDividerDecoration extends RecyclerView.ItemDecoration {

        private int dividerHeight;
        private Paint dividerPaint;

        public SimpleDividerDecoration(Context context) {
            dividerPaint = new Paint();
            dividerPaint.setColor(context.getResources().getColor(R.color.colorAccent));
            dividerHeight = context.getResources().getDimensionPixelSize(R.dimen.deviderHeight);
        }

        @NonNull
        @Override
        public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            super.getItemOffsets(outRect, view, parent, state);
            outRect.bottom = dividerHeight;
        }

        @Override
        public void onDraw(@NonNull Canvas c, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
            int childCount = parent.getChildCount();
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();

            for (int i = 0; i < childCount - 1; i++) {
                View view = parent.getChildAt(i);
                float top = view.getBottom();
                float bottom = view.getBottom() + dividerHeight;
                c.drawRect(left, top, right, bottom, dividerPaint);
            }
        }
    }


    public class LeftAndRightTagDecoration extends RecyclerView.ItemDecoration {
        private int tagWidth;
        private Paint leftPaint;
        private Paint rightPaint;

        public  LeftAndRightTagDecoration(Context context) {
            leftPaint = new Paint();
            leftPaint.setColor(context.getResources().getColor(R.color.colorAccent));
            rightPaint = new Paint();
            rightPaint.setColor(context.getResources().getColor(R.color.colorPrimary));
            tagWidth = context.getResources().getDimensionPixelSize(R.dimen.tag_width);
        }

        @Override
        public void onDrawOver(@NonNull Canvas c, @NonNull RecyclerView parent,@NonNull RecyclerView.State state) {
            super.onDrawOver(c, parent, state);
            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);
                int pos = parent.getChildAdapterPosition(child);
                boolean isLeft = pos % 2 == 0;
                if (isLeft) {
                    float left = child.getLeft();
                    float right = left + tagWidth;
                    float top = child.getTop();
                    float bottom = child.getBottom();
                    c.drawRect(left, top, right, bottom, leftPaint);
                } else {
                    float right = child.getRight();
                    float left = right - tagWidth;
                    float top = child.getTop();
                    float bottom = child.getBottom();
                    c.drawRect(left, top, right, bottom, rightPaint);
                }
            }
        }
    }



}
