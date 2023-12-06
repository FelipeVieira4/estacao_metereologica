package WeatherData;

import java.util.Random;

public class WeatherStation {
	int temperatura;
	int umidade;
	
	public WeatherStation() {
		// TODO Auto-generated constructor stub
		this.temperatura = new Random().nextInt(60);
		this.umidade = new Random().nextInt(60);
	}

	public int getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(int temperatura) {
		this.temperatura = temperatura;
	}

	
	public int getUmidade() {
		return umidade;
	}

	public void setUmidade(int umidade) {
		this.umidade = umidade;
	}

	public void update() {
		this.temperatura = new Random().nextInt(60);
		this.umidade = new Random().nextInt(60);
	}
}
