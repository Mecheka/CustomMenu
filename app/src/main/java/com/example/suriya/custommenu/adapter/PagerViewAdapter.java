package com.example.suriya.custommenu.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.suriya.custommenu.fragment.FortFragment;
import com.example.suriya.custommenu.fragment.OneFragment;
import com.example.suriya.custommenu.fragment.TreeFragment;
import com.example.suriya.custommenu.fragment.TwoFragment;

/**
 * Created by Suriya on 17/1/2561.
 */

public class PagerViewAdapter extends FragmentPagerAdapter {

    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

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
                TreeFragment treeFragment = new TreeFragment();
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
}
