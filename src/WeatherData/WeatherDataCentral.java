package WeatherData;

import Displays.Display;
import Displays.DisplayFactory;


public class WeatherDataCentral {

	private static WeatherData weatherData = new WeatherData();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		weatherData.add(new WeatherStation());
		weatherData.add(new WeatherStation());
		weatherData.add(new WeatherStation());
		
		Display ccd = new DisplayFactory().criarConditionsDisplay();
		Display sd = new DisplayFactory().criarStatisticsDisplay();


		for(;;) {

			ccd.update();
			ccd.draw();
			sd.draw();

			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
