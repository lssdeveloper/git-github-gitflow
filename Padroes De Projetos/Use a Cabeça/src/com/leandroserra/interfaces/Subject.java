package com.leandroserra.interfaces;

public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	//notifica todos os observadores qdo o estado do sujeito for alterado
	public void notifyObserver();

}
