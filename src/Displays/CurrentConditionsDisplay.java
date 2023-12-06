package Displays;

import WeatherData.*;

public class CurrentConditionsDisplay extends Display{
	

	@Override
	public void draw() {
		int count = 0;

		System.out.println("Valores da WeatherData:"+this.getWeatherData().getId());
		System.out.println("--------- DADOS ---------");
		for(WeatherStation i: this.getWeatherData().getWeatherStations()) {
			count++;
			System.out.println("Regis:"+count+" Temp:"+i.getTemperatura()+" °C | Umid:"+i.getUmidade()+ " | Pres:"+i.getPressao());
		}
		System.out.println("");
	}

}
