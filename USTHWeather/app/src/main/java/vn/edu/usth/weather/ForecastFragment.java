package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ForecastFragment extends Fragment {

    public ForecastFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // You can initialize any necessary variables here
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment from the XML file
        View view = inflater.inflate(R.layout.fragment_forecast, container, false);

        // Set the background color of the fragment's root view if needed
        view.setBackgroundColor(0x20FF0000); // Replace with your desired color or remove if not needed

        return view;
    }
}
