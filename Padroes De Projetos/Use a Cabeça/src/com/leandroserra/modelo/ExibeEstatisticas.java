package com.leandroserra.modelo;

import com.leandroserra.interfaces.Display;
import com.leandroserra.interfaces.Observer;

public class ExibeEstatisticas implements Observer, Display {
	
	private DadosMeteorologicos dadosMeteorologicos; 
	private float maxTemp = 0.0f;
	private float minTemp = 200;
	private int numLeituras;
	private float tempSoma = 0.0f;
	
	public ExibeEstatisticas(DadosMeteorologicos dadosMeteorologicos) {
		this.dadosMeteorologicos = dadosMeteorologicos;
		dadosMeteorologicos.registerObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperatura = " + (tempSoma / numLeituras)
				+ "/" + maxTemp + "/" + minTemp);

	}


	public void update(float temp, float umidade, float pressao) {
		tempSoma += temp;
		numLeituras++;

		if (temp > maxTemp) {
			maxTemp = temp;
		}
 
		if (temp < minTemp) {
			minTemp = temp;
		}

		display();

	}

}
