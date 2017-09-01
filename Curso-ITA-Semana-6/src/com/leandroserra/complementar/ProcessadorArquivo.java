package com.leandroserra.complementar;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	private static Map<String, String> mapa;
	private static Scanner sc;
	private static String[] conteudo;
	private static String linha;

	public static Map<String, String> processar(String arquivo) throws LeituraArquivoException {

		abrirArquivo(arquivo);
		if (isArquivoVazio(arquivo))
			throw new LeituraArquivoException("Arquivo vazio!");
		mapa = new HashMap<>();

		while (sc.hasNextLine()) {

			linha = sc.nextLine();
			if (isSemArrow(linha))
				throw new LeituraArquivoException("Formato de arquivo inválido, sem seta.");
			if (isSomenteUmArrow(linha))
				throw new LeituraArquivoException("Formato de arquivo inválido, mais de uma seta ->->!");

			conteudo = linha.split("->");

			if (isConteudoErrado(conteudo))
				throw new LeituraArquivoException("Formato de arquivo inválido, conteúdo inesperado!");

			mapa.put(conteudo[0], conteudo[1]);
		}
		sc.close();
		return mapa;
	}

	private static boolean isConteudoErrado(String[] conteudo2) {
		return (conteudo2.length > 2);
	}

	private static void abrirArquivo(String arquivo) throws LeituraArquivoException {
		try {
			File file = new File(arquivo);
			try {
				sc = new Scanner(file);
			} catch (FileNotFoundException e) {
				throw new LeituraArquivoException("Arquivo ou diretório não encontrado!");
			}
		} catch (LeituraArquivoException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo!");

		}
	}

	private static boolean isArquivoVazio(String arquivo) {

		return !sc.hasNextLine() == true;
	}

	private static boolean isSemArrow(String linha) throws LeituraArquivoException {
		return (!linha.contains("->") == true);
	}

	private static boolean isSomenteUmArrow(String linha) throws LeituraArquivoException {

		return linha.contains("->->") == true;

	}

	public static void imprimir(Map<String, String> mapa) {
		for (String k : mapa.keySet()) {
			String v = mapa.get(k);
			System.out.println(k + " = " + v);
		}
	}

	public static void getAbrirArquivo(String arquivo) throws LeituraArquivoException {
		abrirArquivo(arquivo);
	}

	public static boolean getIsArquivoVazio(String arquivo) throws LeituraArquivoException {
		return isArquivoVazio(arquivo);
	}

	public static boolean getSemArrow(String linha) throws LeituraArquivoException {
		return isSemArrow(linha);
	}

	public static boolean getSomenteUmArrow(String linha) throws LeituraArquivoException {
		return isSomenteUmArrow(linha);
	}
}
