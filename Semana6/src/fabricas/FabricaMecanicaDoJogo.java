package fabricas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Interfaces.IMecanicaDoJogo;
import logica.MecanicaDoJogoDificil;
import logica.MecanicaDoJogoFacil;

public class FabricaMecanicaDoJogo {
	private List<IMecanicaDoJogo> ListaMecanicaDoJogo;

	public FabricaMecanicaDoJogo() {
		ListaMecanicaDoJogo = new ArrayList<IMecanicaDoJogo>();
		ListaMecanicaDoJogo.add( new MecanicaDoJogoDificil());
		ListaMecanicaDoJogo.add( new MecanicaDoJogoFacil());

	} 
	public IMecanicaDoJogo RetornarUmEmbaralhadorAleatoriamente(){
		Random gerador = new Random();

		return ListaMecanicaDoJogo.get(gerador.nextInt(ListaMecanicaDoJogo.size()));
	}
	
}
