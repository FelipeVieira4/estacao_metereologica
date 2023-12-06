package WeatherData;

import java.util.ArrayList;

import Displays.Display;
import Displays.DisplayFactory;


public class WeatherDataCentral {

	private static WeatherData weatherData = new WeatherData();
	private static WeatherData weatherData2 = new WeatherData();
	
	private static ArrayList<Display> displays = new ArrayList<>();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weatherData.addWeatherStation(new WeatherStation());
		weatherData.addWeatherStation(new WeatherStation());
		weatherData.addWeatherStation(new WeatherStation());
		
		weatherData2.addWeatherStation(new WeatherStation());

		displays.add(new DisplayFactory().criarConditionsDisplay());
		displays.add(new DisplayFactory().criarConditionsDisplay());
		displays.add(new DisplayFactory().criarStatisticsDisplay());
		

		weatherData.subscribe(displays.get(0));
		weatherData2.subscribe(displays.get(1));
		weatherData2.subscribe(displays.get(2));

		
		int x = 0;
		for(;;) {
			x++;
			
			if(x%2==0)weatherData.notifyUpdate();
			else weatherData2.notifyUpdate();
			
			
			for(Display i : displays) {
				i.draw();
			}
			
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(x > 100) x = 0;
		}
	}

}
