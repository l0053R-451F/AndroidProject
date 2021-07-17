package com.example.radarx;

import org.json.JSONException;
import org.json.JSONObject;

public class weatherData {
    private String mTemperature,micon, mcity, mweatherType;
    private int mCondition;
    public static weatherData fromJson(JSONObject jsonObject){
        try {
            weatherData weatherD = new weatherData();
            weatherD.mcity = jsonObject.getString("name");
            weatherD.mCondition = jsonObject.getJSONArray("weather").getJSONObject(0).getInt("id");
            weatherD.mweatherType = jsonObject.getJSONArray("weather").getJSONObject(0).getString("main");
            weatherD.micon = updateWeatherIcon(weatherD.mCondition);
            double tempResult = jsonObject.getJSONObject("main").getDouble("temp") - 273.15;
            int roundedValue = (int)Math.rint(tempResult);
            weatherD.mTemperature = Integer.toString(roundedValue);
            return weatherD;
        }
        catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
