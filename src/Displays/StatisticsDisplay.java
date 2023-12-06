package Displays;

import WeatherData.*;

public class StatisticsDisplay extends Display{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Valores da WeatherData:"+this.getWeatherData().getId());
		
		int tempMedia = 0;
		int umidMedia = 0;
		int presMedia = 0;
		
		for(WeatherStation i: this.getWeatherData().getWeatherStations()) {
			tempMedia+=i.getTemperatura();
			umidMedia+=i.getUmidade();
			presMedia+=i.getPressao();
		}
		
		tempMedia/=this.getWeatherData().getWeatherStations().size();
		umidMedia/=this.getWeatherData().getWeatherStations().size();
		presMedia/=this.getWeatherData().getWeatherStations().size();
		
		System.out.println("--------- MÉDIA ---------");
		System.out.println("Temperatura Média:"+tempMedia+"°C");
		System.out.println("Umidade Média:"+umidMedia);
		System.out.println("Pressão Média:"+presMedia);
		System.out.println("");
	}
}
