package WeatherData;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData {
	
	private ArrayList<WeatherStation> weatherStations = new ArrayList<WeatherStation>();

	//Gerar um id único
	private long id = new Random(System.currentTimeMillis()).nextLong();

	public void add(WeatherStation a) {
		this.weatherStations.add(a);
	}
	
	public void remove(int i) {
		if(weatherStations.size()-1 > 0 || i < weatherStations.size()) {
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
		System.out.println("Atualizando WeatherStations:"+this.id);
	}
	
	public void update() {
		notifyUpdate();
		for(WeatherStation i : weatherStations) {
			i.update();
		}
	}

	public Long getId(){
		return this.id;
	}
}
