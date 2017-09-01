package com.lssdeveloper.pojo;

public class AlunoVetor {
	
	//declarando e inicializando um array de aluno com capacidade 100.
	
	private Aluno[] alunos = new Aluno[100];
	
	private int totalAlunos = 0;
	
	public void adiciona(Aluno aluno){
		//Este não é um bom exemplo pois percorre todo o array para achar a posição vazia 
//		for (int i = 0; i < alunos.length; i++) {
//			if (alunos[i] == null) {
//				alunos[i] = aluno;
//				break;
//			}
//		}
		//se precisar redimensionar
		redimensionar();
		
		this.alunos[this.totalAlunos] = aluno;
		this.totalAlunos ++;
		
	}
	public void adicionaNaPosicaoX(int posicao, Aluno aluno){
		//se precisar redimensionar
		redimensionar();		
		
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = this.totalAlunos-1; i >= posicao; i-=1) {
			this.alunos[i+1] = this.alunos[i];
		}
		this.alunos[posicao] = aluno;
		this.totalAlunos++;
		
	}
	private void redimensionar(){
		if (this.totalAlunos == this.alunos.length) {
			Aluno[] novoArray = new Aluno[this.alunos.length * 2];
			
			for (int i = 0; i < this.alunos.length; i++) {
				novoArray[i] = this.alunos[i];
			}
			this.alunos = novoArray;
		}
	}
	
	public Aluno retornaAluno(int posicao){
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		
		return alunos[posicao];
	}
	public void remove(int posicao){
		if (!this.posicaoOcupada(posicao)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		for (int i = posicao; i <= totalAlunos -1; i++) {
				this.alunos[i] = this.alunos[i + 1];
		}
		this.totalAlunos--;
	}
	public boolean contem(Aluno aluno){
		for (int i = 0; i < totalAlunos; i++) {
			if (aluno == alunos[i]) {
				return true;
			}
		}
		
		return false;
	}
	private boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.totalAlunos -1;
	}
	public int tamanho(){
		return this.totalAlunos;
	}
	public String toString(){
		
		if (this.totalAlunos == 0) {
			return "[]";
		}
		
		StringBuilder builder = new StringBuilder();
		builder.append("[");
		
		for (int i = 0; i < totalAlunos; i++) {
			builder.append(this.alunos[i]);
			builder.append(",");
		}
		builder.append(this.alunos[totalAlunos]);
		builder.append("]");
		
		return builder.toString();
	}
	public int tamanhoVetor(){
		return this.alunos.length;
	}

}
