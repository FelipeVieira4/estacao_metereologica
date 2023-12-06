package Displays;

import java.util.Random;

import WeatherData.WeatherData;

public abstract class Display {

	private WeatherData weatherData;
	private int id;

	public Display(WeatherData wt){
		this.weatherData = wt;
	}
	public Display(){
		Random rn = new Random();
		id = rn.nextInt(1000);
	}

	public WeatherData getWeatherData() {
		return weatherData;
	}

	public void setWeatherData(WeatherData weatherData) {
		if(weatherData!=null){
			this.weatherData=weatherData;
			return;
		}

		System.out.println("ERRO");
		System.exit(-1);
	}

	public abstract void draw();
	

	public void notifyDisplay(){
		System.out.println("No Observer:"+id+" Atualizado o WeatherData \n\n");
		return ;
	}
	
	public int getId() {
		return this.getId();
	}
}
