package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class WeatherPagerAdapter extends FragmentPagerAdapter {

    public WeatherPagerAdapter(@NonNull FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new WeatherAndForecastFragment(); // First page
            case 1:
                return new WeatherAndForecastFragment(); // Second page
            case 2:
                return new WeatherAndForecastFragment(); // Third page
            default:
                return new WeatherAndForecastFragment();
        }
    }

    @Override
    public int getCount() {

        return 3;
    }
}



