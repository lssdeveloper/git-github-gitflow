package com.leandroserra.observer.java;

import java.util.Observable;
import java.util.Observer;

import com.leandroserra.interfaces.Display;

public class ExibeEstatisticasII implements Observer, Display {

	private float maxTempII = 0.0f;
	private float minTempII = 200;
	private float tempSomaII = 0.0f;
	private int numLeiturasII;

	public ExibeEstatisticasII(Observable observable) {
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("Avg/Max/Min temperatura = " + (tempSomaII / numLeiturasII)
				+ "/" + maxTempII + "/" + minTempII);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof DadosMeteorologicosII) {
			DadosMeteorologicosII dm = (DadosMeteorologicosII) obs;
			float temp = dm.getTemperaturaII();
			tempSomaII += temp;
			numLeiturasII++;

			if (temp > maxTempII) {
				maxTempII = temp;
			}

			if (temp < minTempII) {
				minTempII = temp;
			}
			display();
		}
	}

}
