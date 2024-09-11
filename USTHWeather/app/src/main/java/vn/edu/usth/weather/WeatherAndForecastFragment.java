package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class WeatherAndForecastFragment extends Fragment {


    public WeatherAndForecastFragment() {}

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_weather_and_forecast, container, false);


        FragmentTransaction transaction = getChildFragmentManager().beginTransaction();


        WeatherFragment weatherFragment = new WeatherFragment();
        transaction.replace(R.id.weather_fragment_container, weatherFragment);

        ForecastFragment forecastFragment = new ForecastFragment();
        transaction.replace(R.id.forecast_fragment_container, forecastFragment);

        transaction.commit();

        return view;
    }
}
