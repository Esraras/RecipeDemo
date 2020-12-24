package com.example.projedemo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;

public class FragmentAdapter extends FragmentPagerAdapter {

    ArrayList<String> section;

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
        section = new ArrayList<>();
        section.add("Once");
        section.add("Custom");
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 0: {
                fragment = Custom.newInstance(section.get(position));
                break;
            }
            case 1: {
                fragment = Once.newInstance(section.get(position));
                break;
            }
            default:{
                fragment = Custom.newInstance(section.get(position));
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return section.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return section.get(position);
    }
}
