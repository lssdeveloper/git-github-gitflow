package com.leandroserra.modelo;

import com.leandroserra.interfaces.Display;
import com.leandroserra.interfaces.Observer;

public class ExibePrevisao implements Observer, Display {

	private DadosMeteorologicos dadosMeteorologicos;
	private float pressaoAtual = 29.92f;
	private float ultimaPressao;

	public ExibePrevisao(DadosMeteorologicos dadosMeteorologicos) {
		this.dadosMeteorologicos = dadosMeteorologicos;
		dadosMeteorologicos.registerObserver(this);
	}

	public void display() {
		System.out.println("Previsão: ");
		if (pressaoAtual > ultimaPressao)
			System.out.println("Melhorando o tempo no caminho!");
		else if (pressaoAtual == ultimaPressao)
			System.out.println("Continua a mesma coisa.");
		else if (pressaoAtual > ultimaPressao)
			System.out.println("Cuidado com o clima frio e chuvoso!");

	}

	public void update(float temp, float umidade, float pressao) {
		ultimaPressao = pressaoAtual;
		pressaoAtual = pressao;
		display();
	}

}
