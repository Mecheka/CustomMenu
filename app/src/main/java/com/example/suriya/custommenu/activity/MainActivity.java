package com.example.suriya.custommenu.activity;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.suriya.custommenu.R;
import com.example.suriya.custommenu.adapter.PagerViewAdapter;
import com.example.suriya.custommenu.fragment.FortFragment;
import com.example.suriya.custommenu.fragment.OneFragment;
import com.example.suriya.custommenu.fragment.TreeFragment;
import com.example.suriya.custommenu.fragment.TwoFragment;
import com.example.suriya.custommenu.view.CustomMenu;

public class MainActivity extends AppCompatActivity {

    private CustomMenu menu1, menu2, menu3, menu4;
    private ViewPager mMainPager;
    private PagerViewAdapter mPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initInstance();
    }

    private void initInstance() {

        menu1 = (CustomMenu) findViewById(R.id.menu1);
        menu1.setActivated(true);
        menu2 = (CustomMenu) findViewById(R.id.menu2);
        menu3 = (CustomMenu) findViewById(R.id.menu3);
        menu4 = (CustomMenu) findViewById(R.id.menu4);

        menu1.setTvMenu("tab1");
        menu2.setTvMenu("tab2");
        menu3.setTvMenu("tab3");
        menu4.setTvMenu("tab4");

        mMainPager = (ViewPager) findViewById(R.id.mainPager);
        mMainPager.setOffscreenPageLimit(2);
        mMainPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                switch (position){
                    case 0:
                        OneFragment oneFragment = OneFragment.newInstance(111);
                        return oneFragment;
                    case 1:
                        TwoFragment twoFragment = TwoFragment.newInstance(222);
                        return twoFragment;
                    case 2:
                        TreeFragment treeFragment = TreeFragment.newInstance(333);
                        return treeFragment;
                    case 3:
                        FortFragment fortFragment = new FortFragment();
                        return fortFragment;
                        default:
                            return null;
                }
            }

            @Override
            public int getCount() {
                return 4;
            }
        });


        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(0);
            }
        });
        menu2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(1);

            }
        });
        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(2);
                Log.d("click", "Ok2");
            }
        });
        menu4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainPager.setCurrentItem(3);
            }
        });

        mMainPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                changeTabs(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void changeTabs(int position) {

        if (position == 0) {
            menu1.setActivated(true);
            menu2.setActivated(false);
            menu3.setActivated(false);
            menu4.setActivated(false);
        }
        if (position == 1) {
            menu1.setActivated(false);
            menu2.setActivated(true);
            menu3.setActivated(false);
            menu4.setActivated(false);
        }
        if (position == 2) {
            menu1.setActivated(false);
            menu2.setActivated(false);
            menu3.setActivated(true);
            menu4.setActivated(false);
        }
        if (position == 3) {
            menu1.setActivated(false);
            menu2.setActivated(false);
            menu3.setActivated(false);
            menu4.setActivated(true);
        }

    }
}
