package vn.edu.usth.weather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

public class WeatherFragment extends Fragment {

    private TextView temperatureTextView;
    private TextView descriptionTextView;
    private ImageView weatherIconImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        // Initialize UI components
        temperatureTextView = view.findViewById(R.id.text_temperature);
        descriptionTextView = view.findViewById(R.id.text_weather_description);
        weatherIconImageView = view.findViewById(R.id.image_weather_icon);

        // You can set default values or update them dynamically based on data
        updateWeatherUI("12C", "Cloudy", R.drawable.cloudy); // Update these values as per your need

        return view;
    }

    // A method to update the UI components with weather data
    private void updateWeatherUI(String temperature, String description, int iconResId) {
        temperatureTextView.setText(temperature);
        descriptionTextView.setText(description);
        weatherIconImageView.setImageResource(iconResId);
    }
}

