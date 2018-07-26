package xyz.redbooks.kouluni.ui.about;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.redbooks.kouluni.R;
import xyz.redbooks.kouluni.adapter.AboutTabsViewPagerAdapter;

/**
 * Created by h4rdw1r3
 */

public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_about, container, false);

        TabLayout tabLayout = view.findViewById(R.id.tabs_about);
        ViewPager pager = view.findViewById(R.id.pager_info_gallery);
        pager.setAdapter(new AboutTabsViewPagerAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(pager);

        return view;
    }

}