package WeatherData;

import java.util.ArrayList;

public class WeatherData {
	
	private ArrayList<WeatherStation> weatherStations = new ArrayList<WeatherStation>();
	
	public void add(WeatherStation a) {
		this.weatherStations.add(a);
	}
	
	public void remove(int i) {
		if(weatherStations.size()-1 > 0) {
			return;
		}
		weatherStations.remove(i);
		
	}
	
	public ArrayList<WeatherStation> getWeatherStations(){
		return this.weatherStations;
	}
	
	public WeatherStation getWeatherStation(int i){
		return this.weatherStations.get(i);
	}
	
	public void notifyUpdate() {
		System.out.println("Atualizando os WeatherStations");
	}
	
	public void update() {
		notifyUpdate();
		for(WeatherStation i : weatherStations) {
			i.update();
		}
	}
}
