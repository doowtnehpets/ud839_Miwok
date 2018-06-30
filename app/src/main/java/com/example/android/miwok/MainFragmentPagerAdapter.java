package com.example.android.miwok;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragmentPagerAdapter extends FragmentPagerAdapter {


    public MainFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        // Return the correct fragment for the current position
        switch (position) {
            case 0:
                return new NumbersFragment();
            case 1:
                return new FamilyFragment();
            case 2:
                return new ColorsFragment();
            case 3:
                return new PhrasesFragment();
            default:
                return new NumbersFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        // Return the correct title for the current position
        switch (position) {
            case 0:
                return "Numbers";
            case 1:
                return "Family";
            case 2:
                return "Colors";
            case 3:
                return "Phrases";
            default:
                return "Numbers";
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
}
