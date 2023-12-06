package Displays;

import WeatherData.WeatherData;

public class DisplayFactory {

  public StatisticsDisplay criarStatisticsDisplay(WeatherData wd){
    return new StatisticsDisplay(wd);
  }

    public CurrentConditionsDisplay criarConditionsDisplay (WeatherData wd){
    return new CurrentConditionsDisplay(wd);
  }
}
