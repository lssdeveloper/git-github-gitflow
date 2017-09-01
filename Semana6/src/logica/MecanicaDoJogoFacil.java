package logica;

public class MecanicaDoJogoFacil extends MecanicaDoJogo{
		
	@Override
	public String Regras() {
		String regras = "Regras\n";
		regras+="Quantidade de palavras: "+this.RegraQuantidadeDePalavras();
		regras+=" - Se errar vai para próxima palavra.";
		regras+=" - Dificuldade: "+this._embaralhador.ObterDificuldade();
		return regras;
	}

}
