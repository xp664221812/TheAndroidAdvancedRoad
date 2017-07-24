package cn.xp.advanced.draw1_1;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import cn.xp.advanced.R;

/**
 * Created by xp on 17-7-24.
 */

public class BasicDrawActivity extends AppCompatActivity {

    private List<Fragment> fragmentList = new ArrayList<>();

    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;

    private SimpleFragmentPagerAdapter pagerAdapter;

    private TabLayout mTabLayout;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();

        fragmentList.add(fragment1);
        fragmentList.add(fragment2);
        fragmentList.add(fragment3);

        mTabLayout= (TabLayout) findViewById(R.id.tl_tabs);

        mViewPager= (ViewPager) findViewById(R.id.viewpager);


        pagerAdapter = new SimpleFragmentPagerAdapter(
                getSupportFragmentManager(), this, fragmentList);


        mViewPager.setAdapter(pagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        mTabLayout.setTabMode(TabLayout.MODE_FIXED);

    }
}
