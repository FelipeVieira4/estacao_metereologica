package Displays;

import java.util.ArrayList;

import WeatherData.WeatherData;

public abstract class Display {

	private ArrayList<WeatherData> weatherDataList = new ArrayList<>();

	public Display(){
	}

	public ArrayList<WeatherData> getWeatherDataList() {
		return weatherDataList;
	}

	public void addWeatherData(WeatherData weatherData) {
		if(weatherData!=null){
			this.weatherDataList.add(weatherData);
			return;
		}

		System.out.println("ERRO");
		System.exit(-1);
	}

	public abstract void draw(int index);
	
	public void update(){

		for(WeatherData weatherData : weatherDataList){
			weatherData.update();
		}
	}
}
