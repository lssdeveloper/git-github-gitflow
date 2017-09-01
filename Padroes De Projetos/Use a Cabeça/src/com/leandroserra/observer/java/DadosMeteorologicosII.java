package com.leandroserra.observer.java;

import java.util.Observable;

public class DadosMeteorologicosII extends Observable{
	private float temperaturaII;
	private float umidadeII;
	private float pressaoII;
	
	public DadosMeteorologicosII() {
	
	}
	
	//aqui seria legal criar um mock para simular um dispositivo
	public void setMedicoesII(float temp, float umidade, float pressao){
		this.temperaturaII = temp;
		this.umidadeII = umidade;
		this.pressaoII = pressao;
		medicoesAtualizadasII();
	}

	private void medicoesAtualizadasII() {
		setChanged();
		notifyObservers();
		
	}
	public float getTemperaturaII() {
		return temperaturaII;
	}
	public float getUmidadeII() {
		return umidadeII;
	}
	public float getPressaoII() {
		return pressaoII;
	}
}
