package fabricas;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Embaralhador.EmbaralharReverse;
import Embaralhador.EmbaralharShuffle;
import Interfaces.IEmbaralhador;

public class FabricaEmbaralhadores {
	private List<IEmbaralhador> ListaEmbaralhadores;

	public FabricaEmbaralhadores() {
		ListaEmbaralhadores = new ArrayList<IEmbaralhador>();
		ListaEmbaralhadores.add( new EmbaralharReverse());
		ListaEmbaralhadores.add( new EmbaralharShuffle());
	} 
	
	public IEmbaralhador RetornarUmEmbaralhadorAleatoriamente(){
		Random gerador = new Random();
		return ListaEmbaralhadores.get(gerador.nextInt(ListaEmbaralhadores.size()));
	}
	
}
