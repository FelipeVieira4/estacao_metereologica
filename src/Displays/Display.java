package Displays;

import WeatherData.WeatherData;

public abstract class Display {

	private WeatherData weatherData;

	public Display(WeatherData wd){
		this.setWeatherData(wd);
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		if(weatherData!=null){
			this.weatherData = weatherData;
			return;
		}

		System.out.println("ERRO");
		System.exit(-1);
	}

	public abstract void draw();
	
	public void update(){
		weatherData.update();
	}
}
