package Displays;

import WeatherData.*;

public class StatisticsDisplay extends Display{

	@Override
	public void draw(int index) {
		// TODO Auto-generated method stub
		int tempMedia = 0;
		int umidMedia = 0;
		
		WeatherData weatherData = this.getWeatherDataList().get(index);

		for(WeatherStation i: weatherData.getWeatherStations()) {
			tempMedia+=i.getTemperatura();
			umidMedia+=i.getUmidade();
		}
		
		tempMedia/=weatherData.getWeatherStations().size();
		umidMedia/=weatherData.getWeatherStations().size();
		
		System.out.println("--------- MÉDIA ---------");
		System.out.println("Temperatura Média:"+tempMedia+"°C");
		System.out.println("Umidade Média:"+umidMedia);
	}
}
