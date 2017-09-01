package main;
import java.io.IOException;
import java.util.Scanner;

import Interfaces.IMecanicaDoJogo;
import fabricas.FabricaMecanicaDoJogo;

public class Principal {

	public static void main(String[] args) throws java.nio.file.NoSuchFileException, IOException {
		FabricaMecanicaDoJogo fabricaMecanicaDoJogo = new  FabricaMecanicaDoJogo();
		IMecanicaDoJogo MecanicaDoJogo = fabricaMecanicaDoJogo.RetornarUmEmbaralhadorAleatoriamente();
		Scanner s = new Scanner(System.in);
		System.out.println("Jogo Da Palavra");
		System.out.println(MecanicaDoJogo.Regras());
		do{
			System.out.println("Sua pontuação atual: "+ MecanicaDoJogo.ObterPontuacaoFinal());
			String palavra = MecanicaDoJogo.RetornarPalavraEmbaralhada();
			System.out.println("Acerte a palavra: " + palavra+"\n");
			do{
				if(MecanicaDoJogo.UsuarioAcertouPalavra(s.nextLine())){
					System.out.println("Parabéns acertou\n");
				}else{
					System.out.println("Errou\n");
				}
			}while(MecanicaDoJogo.PodeTentarNovamente());
		}while(MecanicaDoJogo.JogoAcabou());
		System.out.println("Pontuação Final: "+MecanicaDoJogo.ObterPontuacaoFinal());
		s.close();
	}

}
