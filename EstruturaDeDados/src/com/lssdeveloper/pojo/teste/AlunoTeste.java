package com.lssdeveloper.pojo.teste;

import com.lssdeveloper.pojo.Aluno;
import com.lssdeveloper.pojo.AlunoVetor;

public class AlunoTeste {
	

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("Leandro");
		Aluno aluno2 = new Aluno("Regina");
		Aluno aluno3 = new Aluno("Gustavo");
		Aluno aluno4 = new Aluno("Silvia");
		Aluno aluno5 = new Aluno("Adriana");
		Aluno aluno6 = new Aluno("Vera");	
		Aluno aluno9 = new Aluno("Leana");	
		Aluno aluno8 = new Aluno("João");			
		

		AlunoVetor lista = new AlunoVetor();
		
		lista.adiciona(aluno1);
		lista.adiciona(aluno2);
		lista.adiciona(aluno3);
		lista.adiciona(aluno4);
		lista.adiciona(aluno5);
		lista.adiciona(aluno6);	
		
		System.out.println("Lista com 6 poisções: " + lista.toString());
		
		Aluno aluno7 = new Aluno("Felipe");	
		lista.adicionaNaPosicaoX(3, aluno7);
		System.out.println("Adicionado o aluno Felipe na poisção 3 ");		
		
		if (lista.contem(aluno1)) {
			System.out.println("Lista contém o " + aluno1 );	
		} 
		
		System.out.println("Retorna o " + lista.retornaAluno(0));
				

		System.out.println("Tamanho da lista => .tamanho() " + lista.tamanho());
		System.out.println("Tamanho do vetor => .tamanhoVetor() "+ lista.tamanhoVetor());
		System.out.println("----------------------Redimensiona a lista----------------------");
		lista.adiciona(aluno8);
		lista.adiciona(aluno9);
		System.out.println("Tamanho da lista => .tamanho() " + lista.tamanho());
		System.out.println("Tamanho do vetor => .tamanhoVetor() "+ lista.tamanhoVetor());				
		System.out.println("----------------------Lista de alunos----------------------");
		System.out.println(lista.toString());		
		System.out.println("Eliminando o aluno na posição 2 (Regina)");
		lista.remove(2);
		System.out.println(lista.toString());	
		

	}

}