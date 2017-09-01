package com.lssdeveloper.tdd;


import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import com.lssdeveloper.pojo.Vetor;

public class TesteVetor {
	
	private Object[] objetos;
	private int totalDeObjetos;
	private Vetor v;
	
	@Before
	public void inicializaVetor(){
		objetos = new Object[100];
		totalDeObjetos = 0;
		v = new Vetor();
	}
	
	@Test
	public void tamanhoVetor(){
		assertEquals(objetos.length, 100);
		assertEquals(v.getObjetos().length, 100);
	}
	@Test
	public void tamanho(){
		assertEquals(totalDeObjetos, 0);
		assertEquals(v.getTotalDeObjetos(), 0);
	}
	@Test
	public void garantaEspaco(){
		v.setTotalDeObjetos(100);
		v.garantaEspaco();
		assertEquals(v.getObjetos().length, 200);
	}
	@Test
	public void adiciona(){
		v.adiciona("Leandro");
		assertEquals(v.getTotalDeObjetos(), 1);

	}
	

}
