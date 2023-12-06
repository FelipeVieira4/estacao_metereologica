package WeatherData;

import java.util.ArrayList;
import java.util.Random;

import Displays.Display;

public class WeatherData {
	
	private ArrayList<WeatherStation> weatherStations = new ArrayList<WeatherStation>();

	private ArrayList<Display> observersList = new ArrayList<Display>();
	
	//Gerar um id único
	private int id;
	
	public WeatherData() {
		Random rn = new Random();
		id = rn.nextInt(1000);
	}

	public void addWeatherStation(WeatherStation a) {
		this.weatherStations.add(a);	
	}
	
	public void removeWeatherStation(int i) {
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
	
	public void subscribe(Display a) {
		this.observersList.add(a);
		a.setWeatherData(this);
	}
	
	public void unsubscribe(int i) {
		if(observersList.size()-1 > 0 || i < observersList.size()) {
			return;
		}
		observersList.remove(i);
		
	}
	
	public void notifyUpdate() {
		System.out.println("Atualizando WeatherData:"+this.id);
		
		for(WeatherStation i : weatherStations) {
			i.update();
		}
		for(Display i:observersList) {
			i.notifyDisplay();
		}
		
	}

	public int getId(){
		return this.id;
	}
}
