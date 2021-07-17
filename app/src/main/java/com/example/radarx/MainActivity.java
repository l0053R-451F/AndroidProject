package com.example.radarx;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    final String APP_ID = "314ed512624ccd0aa0e9ecdeb8cd7812";
    final String WEATHER_URL = "https://home.openweathermap.org/data/2.5/weather";
    final long MIN_TIME = 5000;
    final float MIN_DISTANCE = 1000;
    final int REQUEST_CODE = 101;




    String Location_Provider = LocationManager.GPS_PROVIDER;
    TextView NameofCity, weatherState, Temparature;
    ImageView mweatherIcon;
    RelativeLayout mCityFinder;
    LocationManager mLocationManager;
    LocationListener mLocationListner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        weatherState = findViewById(R.id.weatherCondition);
    }
}