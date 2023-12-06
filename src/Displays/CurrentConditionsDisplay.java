package Displays;

import WeatherData.*;

public class CurrentConditionsDisplay extends Display{
	

	@Override
	public void draw(int index) {
		int count = 0;
		WeatherData weatherData = this.getWeatherDataList().get(index);

		System.out.println("--------- DADOS ---------");
		for(WeatherStation i: weatherData.getWeatherStations()) {
			count++;
			System.out.println("Regis:"+count+" Temp:"+i.getTemperatura()+" °C | Umid:"+i.getUmidade());
		}
	}

}
