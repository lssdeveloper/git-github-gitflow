package Embaralhador;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import Interfaces.IEmbaralhador;

public class EmbaralharShuffle implements IEmbaralhador {

	@Override
	public String EmbaralharPalavra(String palavra) {
		List<String> lista = Arrays.asList(palavra.trim().split(""));
		Collections.shuffle(lista);
		StringBuilder sb = new StringBuilder();
		for(String s : lista) sb.append(s);
		return sb.toString();
	}

	@Override
	public int ObterDificuldade() {
		return 10;
	}

}
