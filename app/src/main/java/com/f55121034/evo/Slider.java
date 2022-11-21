package com.f55121034.evo;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Slider extends FragmentPagerAdapter {

    public Slider(@NonNull FragmentManager fm) {
        super(fm);
    }

    public Slider(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Frag1();
            case 1:
                return new Frag2();
            default:
                return new Frag1();
        }
    }
    @Override
    public int getCount() {
        return 2;
    }
}
