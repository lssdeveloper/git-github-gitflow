package Interfaces;

public interface IMecanicaDoJogo {
	boolean JogoAcabou();
	boolean UsuarioAcertouPalavra(String Resposta);
	double ObterPontuacaoFinal();
	boolean PodeTentarNovamente();
	String RetornarPalavraEmbaralhada();
	String Regras();
	void RezetarInformacoesPorPalavras();
	void AdicionarPontuacao();
}
