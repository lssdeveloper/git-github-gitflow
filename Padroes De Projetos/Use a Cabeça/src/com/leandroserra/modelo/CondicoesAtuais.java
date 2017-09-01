package com.leandroserra.modelo;

import com.leandroserra.interfaces.Display;
import com.leandroserra.interfaces.Observer;
import com.leandroserra.interfaces.Subject;

public class CondicoesAtuais implements Observer, Display {
	
	private float temperatura;
	private float umidade;
	private Subject dadosMeteorologicos;
	
	public CondicoesAtuais(Subject dadosMeteorologicos) {
		this.dadosMeteorologicos = dadosMeteorologicos;
		dadosMeteorologicos.registerObserver(this);
	}

	public void display() {
		System.out.println("Condições Atuais: " + this.temperatura 
				+ "F Graus e " + "umidade " + this.umidade);
	}

	public void update(float temp, float umidade, float pressao) {
		this.temperatura = temp;
		this.umidade = umidade;
		display();
	}

}
