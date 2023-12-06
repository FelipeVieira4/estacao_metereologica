package WeatherData;

import java.util.Random;

public class WeatherStation {
	private int temperatura;
	private int umidade;
	private int pressao;
	
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

	public int getPressao() {
		return pressao;
	}

	public void setPressao(int pressao) {
		this.pressao = pressao;
	}
	
	public void update() {
		this.temperatura = new Random().nextInt(60);
		this.umidade = new Random().nextInt(60);
		this.pressao = new Random().nextInt(60);
	}
}
