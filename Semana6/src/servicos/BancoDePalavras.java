package servicos;
import java.io.IOException;
import java.util.List;
import java.util.Random;

import Interfaces.IBancoDePalavras;
import utils.LerArquivo;

public class BancoDePalavras implements IBancoDePalavras {
	private List<String> ListaDePalavras;	
	
	public BancoDePalavras(){
		try {
			ListaDePalavras = LerArquivo.RetornarLinhasDoArquivo("listapalavras.txt");
		} catch (java.nio.file.NoSuchFileException e) {
			System.out.println("Arquivo não encontrado.");
		} catch(IOException e){
			
		}

	}
	
	@Override
	public String ObterPalavraAleatorioDaLista() {
		int index = new Random().nextInt(ListaDePalavras.size());
		String palavra = ListaDePalavras.get(index);
		ListaDePalavras.remove(index);
		return palavra;
	}

}
