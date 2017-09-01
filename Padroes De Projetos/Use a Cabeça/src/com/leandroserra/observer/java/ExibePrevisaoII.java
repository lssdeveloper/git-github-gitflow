package com.leandroserra.observer.java;

import java.util.Observable;
import java.util.Observer;

import com.leandroserra.interfaces.Display;

public class ExibePrevisaoII implements Observer, Display {

	private float pressaoAtualII = 29.92f;
	private float ultimaPressaoII;
	
	public ExibePrevisaoII(Observable obs) {
	  obs.addObserver(this);
	}
	
	public void display() {
		System.out.println("Previsão: ");
		if (pressaoAtualII > ultimaPressaoII)
			System.out.println("Melhorando o tempo no caminho!");
		else if (pressaoAtualII == ultimaPressaoII)
			System.out.println("Continua a mesma coisa.");
		else if (pressaoAtualII > ultimaPressaoII)
			System.out.println("Cuidado com o clima frio e chuvoso!");

	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof DadosMeteorologicosII) {
			DadosMeteorologicosII dm = (DadosMeteorologicosII) obs;
			ultimaPressaoII = dm.getPressaoII();
			display();
		}
	}

}
