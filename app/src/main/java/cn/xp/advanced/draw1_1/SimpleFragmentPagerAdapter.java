package cn.xp.advanced.draw1_1;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by xp on 17-7-24.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    final int PAGE_COUNT = 3;
    private String tabTitles[] = new String[]{"tab1","tab2","tab3"};
    private Context context;
    private List<Fragment> fragmentList;


    public SimpleFragmentPagerAdapter(FragmentManager fm, Context context,List<Fragment> list) {
        super(fm);
        fragmentList=list;
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position );
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
