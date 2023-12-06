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
		this.weatherData=weatherData;
	}

	public void update() {
		if(this.weatherData==null)return;
		
		this.draw();
		this.notifyDisplay();
	}
	public abstract void draw();
	

	public void notifyDisplay(){
		System.out.println("No Observer:"+id+" Atualizado o WeatherData \n");
		return ;
	}
	
	public int getId() {
		return this.getId();
	}
}
