package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.ArrayList;
import java.util.List;

public class WeatherActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private WeatherPagerAdapter pagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);


        viewPager = findViewById(R.id.viewPager);


        pagerAdapter = new WeatherPagerAdapter(getSupportFragmentManager());
        setupViewPager(viewPager);

        viewPager.setAdapter(pagerAdapter);
    }


    private void setupViewPager(ViewPager viewPager) {
        WeatherPagerAdapter adapter = new WeatherPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new WeatherAndForecastFragment(), "Weather and Forecast 1");
        adapter.addFragment(new WeatherAndForecastFragment(), "Weather and Forecast 2");
        adapter.addFragment(new WeatherAndForecastFragment(), "Weather and Forecast 3");
        viewPager.setAdapter(adapter);
    }


    private static class WeatherPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> fragmentList = new ArrayList<>();
        private final List<String> fragmentTitleList = new ArrayList<>();

        public WeatherPagerAdapter(FragmentManager manager) {
            super(manager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            fragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitleList.get(position);
        }
    }
}
