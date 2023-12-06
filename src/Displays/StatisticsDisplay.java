package Displays;

import WeatherData.*;

public class StatisticsDisplay extends Display{

	public StatisticsDisplay(WeatherData wd) {
		super(wd);
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		int tempMedia = 0;
		int umidMedia = 0;
		
		for(WeatherStation i: this.getWeatherData().getWeatherStations()) {
			tempMedia+=i.getTemperatura();
			umidMedia+=i.getUmidade();
		}
		
		tempMedia/=getWeatherData().getWeatherStations().size();
		umidMedia/=getWeatherData().getWeatherStations().size();
		
		System.out.println("--------- MÉDIA ---------");
		System.out.println("Temperatura Média:"+tempMedia+"°C");
		System.out.println("Umidade Média:"+umidMedia);
	}
}
