package logica;

public class MecanicaDoJogoDificil extends MecanicaDoJogo {
	//Regras
	private int _quantidadeDeErrorPorPalavra = 1;
	private int _contadorQuantidadeDeErrorPorPalavra = 0;
	private int _quantidadeDeErrosPermitidos = 3;
	private int _contadorQuantidadeDeErrorsPermitidos = 0;
	//
	
	@Override
	public boolean UsuarioAcertouPalavra(String Resposta) {
		if(_palavraAtual.equalsIgnoreCase(Resposta)){ 
			this.AdicionarPontuacao();
			this._acertou = true;
			this.AumentarContadorDePalavras();
		}
		else{
			this.AumentarContadorQuantidadeDeErrorPorPalavra();
			this.AumentarContadorQuantidadeDeErrorsPermitidos();
			this._acertou = false;
		}
		this.AtualizarPodeTentarNovamente();
		this.AtualizarJogoAcabou();
		return this._acertou;
	}

	
	public void AtualizarPodeTentarNovamente(){
		if( this.ObterContadorQuantidadeDeErrorPorPalavra()<= this.RegraQuantidadeDeErrorPorPalavra() 
			&& this.ObterContadorQuantidadeDeErrorsPermitidos() <= this.RegraQuantidadeDeErrosPermitidos()	
			&& !this._acertou	)
			
			this._podeTentarNovamente = true;
		else
			this._podeTentarNovamente = false;
	}
	@Override
	public void AtualizarJogoAcabou(){
		if (this.ObterContadorDePalavras() >= this.RegraQuantidadeDePalavras()
			|| this.ObterContadorQuantidadeDeErrorsPermitidos() >= this.RegraQuantidadeDeErrosPermitidos()	
				)
			this._jogoAcabou = true;
		else
			this._jogoAcabou = false;
	}
	

	@Override
	public String Regras() {
		String regras = "Regras\n";
		regras+="Quantidade de palavras: "+this.RegraQuantidadeDePalavras();
		regras+=" - Quantidade de erros permitidos: "+this.RegraQuantidadeDeErrosPermitidos();
		regras+=" - Quantidade de erros por palavras: "+this.RegraQuantidadeDeErrorPorPalavra();
		regras+=" - Dificuldade: "+this._embaralhador.ObterDificuldade();
		return regras;
	}
	
	@Override
	public void RezetarInformacoesPorPalavras(){
		this._acertou = false;
		this._contadorQuantidadeDeErrorPorPalavra = 0;
		this._podeTentarNovamente = true;
	}
		
	public void AumentarContadorQuantidadeDeErrorPorPalavra(){
		this._contadorQuantidadeDeErrorPorPalavra++;
	}
	
	public void AumentarContadorQuantidadeDeErrorsPermitidos(){
		this._contadorQuantidadeDeErrorsPermitidos++;
	}
		
	public int ObterContadorQuantidadeDeErrorPorPalavra(){
		return this._contadorQuantidadeDeErrorPorPalavra;
	}
	
	public int ObterContadorQuantidadeDeErrorsPermitidos(){
		return this._contadorQuantidadeDeErrorsPermitidos;
	}
	

	public int RegraQuantidadeDeErrorPorPalavra(){
		return this._quantidadeDeErrorPorPalavra;
	}
	
	public int RegraQuantidadeDeErrosPermitidos(){
		return this._quantidadeDeErrosPermitidos;
	}
	

}
