package com.lssdeveloper.tdd;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.lssdeveloper.pojo.Aluno;
import com.lssdeveloper.pojo.AlunoVetor;

public class TesteEstruturaDeDados {
	
	private Aluno[] alunos = new Aluno[100];
	
	private Aluno a1;
	private Aluno a2;
	private Aluno a3;
	private Aluno a4;
	private Aluno a5;
	private AlunoVetor av;
	
	@Before
	public void inicializaAlunoVetor(){
		a1 = new Aluno("Leandro");
		a2 = new Aluno("Astolfo");
		a3 = new Aluno("Abelardo");
		a4 = new Aluno("Constancio");
		a5 = new Aluno("Clementino");
		av = new AlunoVetor();
		
		for (int i = 0; i < alunos.length; i++) {
			av.adiciona(alunos[i]);
			
			
		}
	}
	@Test
	public void testeAdiciona(){
		av.adiciona(a1);
		av.adiciona(a2);
		av.adiciona(a3);
		for (int i = 0; i < 50; i++) {
			av.adiciona(alunos[i]);
		}
		assertEquals(av.tamanho(),153);
	}
	@Test
	public void testeTamanho(){
		assertEquals(av.tamanho(), 100);
		
	}
	@Test
	public void testeTamanhoVetor(){
		assertEquals(av.tamanhoVetor(), 100);
	}
	@Test
	public void testeRetornaAluno(){
		assertEquals(alunos[5], av.retornaAluno(5));
	}
	

}
