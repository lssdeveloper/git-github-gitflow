package com.leandroserra.main;

import com.leandroserra.modelo.CondicoesAtuais;
import com.leandroserra.modelo.DadosMeteorologicos;
import com.leandroserra.modelo.ExibeEstatisticas;
import com.leandroserra.modelo.ExibePrevisao;
import com.leandroserra.modelo.IndiceDeAquecimento;
import com.leandroserra.observer.java.CondicoesAtuaisII;
import com.leandroserra.observer.java.DadosMeteorologicosII;
import com.leandroserra.observer.java.ExibeEstatisticasII;
import com.leandroserra.observer.java.ExibePrevisaoII;
import com.leandroserra.observer.java.IndiceDeAquecimentoII;

public class EstacaoMeteorologica {

	public static void main(String[] args) {
		DadosMeteorologicos dm = new DadosMeteorologicos();
		
		CondicoesAtuais ca = new CondicoesAtuais(dm);
		ExibeEstatisticas ee = new ExibeEstatisticas(dm);
		ExibePrevisao ep = new ExibePrevisao(dm);
		IndiceDeAquecimento ia = new IndiceDeAquecimento(dm);
		
		dm.setMedicoes(80, 65, 30.4f);
		dm.setMedicoes(82, 70, 29.2f);
		dm.setMedicoes(78, 90, 29.2f);
		
		System.out.println("//****************************************************//");
		DadosMeteorologicosII dm2 = new DadosMeteorologicosII();
		
		CondicoesAtuaisII ca2 = new CondicoesAtuaisII(dm2);
		ExibeEstatisticasII ee2 = new ExibeEstatisticasII(dm2);
		ExibePrevisaoII ep2 = new ExibePrevisaoII(dm2);
		IndiceDeAquecimentoII ia2 = new IndiceDeAquecimentoII(dm2);
		
		dm2.setMedicoesII(80, 65, 30.4f);
		dm2.setMedicoesII(82, 70, 29.2f);
		dm2.setMedicoesII(78, 90, 29.2f);
	}

}
