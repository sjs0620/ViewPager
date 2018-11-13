package com.sjs.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    int images[] = {R.drawable.image1,R.drawable.image2,R.drawable.image3};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return ItemFragment.newInstance(images[position]);
    }

    @Override
    public int getCount() {
        return 3;
    }
}
