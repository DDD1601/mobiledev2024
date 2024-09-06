package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.graphics.Color;

public class WeatherFragment extends Fragment {

    public WeatherFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Create RelativeLayout
        RelativeLayout layout = new RelativeLayout(getActivity());
        layout.setBackgroundColor(Color.parseColor("#e0f7d4")); // Light green color

        // Create TextView for temperature
        TextView tempTextView = new TextView(getActivity());
        tempTextView.setId(View.generateViewId());
        tempTextView.setText("12°C");
        tempTextView.setTextSize(24);
        tempTextView.setTextColor(Color.BLACK);
        RelativeLayout.LayoutParams tempParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        tempParams.addRule(RelativeLayout.ALIGN_PARENT_START);
        layout.addView(tempTextView, tempParams);

        // Create TextView for weather condition
        TextView conditionTextView = new TextView(getActivity());
        conditionTextView.setId(View.generateViewId());
        conditionTextView.setText("Cloudy");
        conditionTextView.setTextSize(18);
        conditionTextView.setTextColor(Color.BLACK);
        RelativeLayout.LayoutParams conditionParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        conditionParams.addRule(RelativeLayout.BELOW, tempTextView.getId());
        layout.addView(conditionTextView, conditionParams);

        // Create ImageView for weather icon
        ImageView weatherIcon = new ImageView(getActivity());
        weatherIcon.setImageResource(R.drawable.cloudy); // Replace with actual icon name
        RelativeLayout.LayoutParams iconParams = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT);
        iconParams.addRule(RelativeLayout.ALIGN_PARENT_END);
        layout.addView(weatherIcon, iconParams);

        return layout;
    }
}
