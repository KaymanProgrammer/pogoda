package com.example.weatherapi.service;

import com.example.weatherapi.model.Location;
import com.example.weatherapi.model.Weather;

import java.util.List;
import java.util.Locale;

public interface WeatherService {
    List<Location> findLocationByName(String name);
    Weather getWeatherById(String woeId);

}
