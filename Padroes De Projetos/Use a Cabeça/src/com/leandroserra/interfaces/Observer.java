package com.leandroserra.interfaces;

public interface Observer {
	//estes são os valores de estado que recebem do Sujeito 
	public void update(float temp, float umidade, float pressao);
}
