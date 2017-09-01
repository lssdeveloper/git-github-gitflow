package com.leandroserra.observer.java;

import java.util.Observable;
import java.util.Observer;

import com.leandroserra.interfaces.Display;

public class CondicoesAtuaisII implements Observer, Display{
	
	Observable observable;
	private float temperaturaII;
	private float umidadeII;
	
	public CondicoesAtuaisII(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	public void display() {
		System.out.println("Condições Atuais: " + this.temperaturaII 
				+ "F Graus e " + "umidade " + this.umidadeII);
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof DadosMeteorologicosII) {
			DadosMeteorologicosII dadosMeteorologicosII = (DadosMeteorologicosII) obs;
			this.temperaturaII = dadosMeteorologicosII.getTemperaturaII();
			this.umidadeII = dadosMeteorologicosII.getUmidadeII();
			display();
		}
	}

}
