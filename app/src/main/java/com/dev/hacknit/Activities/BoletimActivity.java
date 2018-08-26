package com.dev.hacknit.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import android.os.Bundle;
import com.dev.hacknit.Fragments.Boletim1Fragment;
import com.dev.hacknit.Fragments.Boletim2Fragment;
import com.dev.hacknit.Fragments.Boletim3Fragment;
import com.dev.hacknit.Fragments.Boletim4Fragment;
import com.dev.hacknit.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItemAdapter;
import com.ogaclejapan.smarttablayout.utils.v4.FragmentPagerItems;

public class BoletimActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private SmartTabLayout smartTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boletim);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle("Boletim de notas");
        getSupportActionBar().setElevation(0);

        viewPager = findViewById(R.id.viewPager);
        smartTabLayout = findViewById(R.id.smartTabLayout);

        //Configurando o adapter e criando as abas que serão fragments
        FragmentPagerItemAdapter adapter = new FragmentPagerItemAdapter(
                getSupportFragmentManager(), FragmentPagerItems.with(this)
                .add("1° Bim.", Boletim1Fragment.class)
                .add("2° Bim.", Boletim2Fragment.class)
                .add("3° Bim.", Boletim3Fragment.class)
                .add("4° Bim.", Boletim4Fragment.class)
                .create()
        );
        viewPager.setAdapter(adapter);
        smartTabLayout.setViewPager(viewPager);
        viewPager.setCurrentItem(0);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
