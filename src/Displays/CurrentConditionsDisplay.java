package Displays;

import WeatherData.*;

public class CurrentConditionsDisplay extends Display{
	
	public CurrentConditionsDisplay(WeatherData wd) {
		super(wd);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("--------- DADOS ---------");
		for(WeatherStation i: getWeatherData().getWeatherStations()) {
			count++;
			System.out.println("Regis:"+count+" Temp:"+i.getTemperatura()+" °C | Umid:"+i.getUmidade());
		}
	}

}
