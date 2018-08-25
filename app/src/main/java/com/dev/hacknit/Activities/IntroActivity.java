package com.dev.hacknit.Activities;

import android.os.Bundle;

import com.dev.hacknit.Helpers.CustomFragmentManagerAdapter;
import com.dev.hacknit.R;
import com.google.android.material.tabs.TabLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class IntroActivity  extends AppCompatActivity implements ViewPager.OnPageChangeListener {


    private CustomFragmentManagerAdapter mCustomFragmentManagerAdapter;
    private ViewPager mViewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        mViewPager = findViewById(R.id.ViewPagerMaterials);

        mCustomFragmentManagerAdapter = new CustomFragmentManagerAdapter(getSupportFragmentManager());

        mViewPager.addOnPageChangeListener(this);

        setupViewPager(mViewPager);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


    }


    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


    }

    @Override
    public void onPageSelected(int position) {
        setViewPager(position);
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }


    public void setupViewPager(ViewPager viewPager) {


        mCustomFragmentManagerAdapter.AddFragment(new CustomFragmentManagerAdapter.Page(new FragmentIntro1(), "intro 1"));
        mCustomFragmentManagerAdapter.AddFragment(new CustomFragmentManagerAdapter.Page(new FragmentIntro2(), "intro 2"));

        viewPager.setAdapter(mCustomFragmentManagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.MaterialstabDots);
        tabLayout.setupWithViewPager(viewPager, true);
    }


    public void setViewPager(int fragmentNumber) {
        mViewPager.setCurrentItem(fragmentNumber);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}