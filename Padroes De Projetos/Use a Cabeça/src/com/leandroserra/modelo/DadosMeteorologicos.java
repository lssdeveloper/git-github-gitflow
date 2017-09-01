package com.leandroserra.modelo;

import java.util.ArrayList;
import java.util.List;

import com.leandroserra.interfaces.Observer;
import com.leandroserra.interfaces.Subject;

public class DadosMeteorologicos implements Subject {
	
	private List<Observer> observers;
	private float temperatura;
	private float umidade;
	private float pressao;
	
	public DadosMeteorologicos() {
		observers = new ArrayList<>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) 
			observers.remove(o);
	}

	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperatura, umidade, pressao);
		}
	}
	public void medicoesAtualizadas(){
		notifyObserver();
	}
	public float getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public float getUmidade() {
		return umidade;
	}

	public void setUmidade(float umidade) {
		this.umidade = umidade;
	}

	public float getPressao() {
		return pressao;
	}

	public void setPressao(float pressao) {
		this.pressao = pressao;
	}
	//aqui seria legal criar um mock para simular um dispositivo
	public void setMedicoes(float temp, float umidade, float pressao){
		this.temperatura = temp;
		this.umidade = umidade;
		this.pressao = pressao;
		medicoesAtualizadas();
	}

}
