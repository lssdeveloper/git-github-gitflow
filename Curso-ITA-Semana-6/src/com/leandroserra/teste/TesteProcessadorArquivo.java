package com.leandroserra.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import org.junit.Test;

import com.leandroserra.complementar.LeituraArquivoException;
import com.leandroserra.complementar.ProcessadorArquivo;

public class TesteProcessadorArquivo {

	String arquivo;

	// @Ignore
	@Test
	public void testAbrirArquivoValido() {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoValido.txt";
		try {
			ProcessadorArquivo.getAbrirArquivo(arquivo);
		} catch (LeituraArquivoException e) {
			assertEquals("Erro ao abrir o arquivo!", e.getMessage());
		}

	}

	// @Ignore
	@Test
	public void testAbrirArquivoNaoEncontrado() {
		try {
			ProcessadorArquivo.getAbrirArquivo("");
		} catch (LeituraArquivoException e) {
			assertEquals("Erro ao abrir o arquivo!", e.getMessage());
		}

	}

	// @Ignore
	@Test
	public void testIsArquivoVazio() throws LeituraArquivoException {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoVazio.txt";
		try {
			ProcessadorArquivo.getAbrirArquivo(arquivo);
			assertTrue("Arquivo vazio!", ProcessadorArquivo.getIsArquivoVazio(arquivo));
		} catch (LeituraArquivoException e) {
			assertEquals("Arquivo vazio!", e.getMessage());
		}
	}

	// @Ignore
	@Test
	public void testSemArrow() {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoInValido3.txt";
		try {
			ProcessadorArquivo.getAbrirArquivo(arquivo);
			ProcessadorArquivo.getSemArrow(arquivo);
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido, sem seta.", e.getMessage());
		}

	}

	@Test
	public void testeProcessar() throws LeituraArquivoException {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoValido.txt";
		Map<String, String> map = ProcessadorArquivo.processar(arquivo);
		assertEquals(!map.isEmpty(), Boolean.TRUE);
	}

	@Test
	public void testeProcessarArquivoInvalido() {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoInValido.txt";
		try {
			Map<String, String> map = ProcessadorArquivo.processar(arquivo);
			assertEquals(map.isEmpty(), Boolean.TRUE);
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido, mais de uma seta ->->!", e.getMessage());
		}
	}

	@Test
	public void testeProcessarArquivoInvalido2() {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoInValido2.txt";
		try {
			Map<String, String> map = ProcessadorArquivo.processar(arquivo);
			assertEquals(map.isEmpty(), Boolean.TRUE);
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido, conteúdo inesperado!", e.getMessage());
		}
	}

	@Test
	public void testeProcessarArquivoInvalido3() {
		arquivo = "/home/leandro/workspace/Curso-ITA-Semana-6/arquivo/arquivoInValido3.txt";
		try {
			Map<String, String> map = ProcessadorArquivo.processar(arquivo);
			assertEquals(map.isEmpty(), Boolean.TRUE);
		} catch (LeituraArquivoException e) {
			assertEquals("Formato de arquivo inválido, sem seta.", e.getMessage());
		}
	}

}
