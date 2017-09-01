package com.lssdeveloper.pojo;

import java.util.ArrayList;
import java.util.List;

public class Vetor {

	private Object[] objetos = new Object[100];
	private int totalDeObjetos = 0;
	private List<Object> lstObj = new ArrayList<Object>();
	
	public Object[] getObjetos() {
		return objetos;
	}
	public List<Object> getLstObj() {
		return lstObj;
	}
	public int getTotalDeObjetos() {
		return totalDeObjetos;
	}
	public void setTotalDeObjetos(int totalDeObjetos) {
		this.totalDeObjetos = totalDeObjetos;
	}
	
	public void garantaEspaco(){
		
		if (this.totalDeObjetos == this.objetos.length) {
			Object[] novoArray = new Object[this.objetos.length*2];
			for (int i = 0; i < objetos.length; i++) {
				novoArray[i] = this.objetos[1];
			}
			this.objetos = novoArray;
		}		
	}
	public void adiciona(Object obj){
		this.garantaEspaco();
		this.objetos[this.totalDeObjetos] = obj;
		this.totalDeObjetos++;
	}
}
