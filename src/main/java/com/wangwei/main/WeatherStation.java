package com.wangwei.main;

import com.wangwei.mode.observermode.beans.CurrentConditionsDisplay;
import com.wangwei.mode.observermode.beans.ForecastDisplay;
import com.wangwei.mode.observermode.beans.StatisticsDisplay;
import com.wangwei.mode.observermode.beans.WeatherData;

/**
 * @author: wangwei
 * @date: 2019-07-29 00:45
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
