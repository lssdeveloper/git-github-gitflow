package logica;

import Interfaces.IBancoDePalavras;
import Interfaces.IEmbaralhador;
import Interfaces.IMecanicaDoJogo;
import fabricas.FabricaEmbaralhadores;
import servicos.BancoDePalavras;

public abstract class MecanicaDoJogo implements IMecanicaDoJogo {
	protected IEmbaralhador _embaralhador =null;
	private IBancoDePalavras _bancoDePalavras = null;
	protected String _palavraAtual = "";
	
	protected boolean _jogoAcabou = false;
	protected boolean _podeTentarNovamente = false;
	protected boolean _acertou = false;
	
	private double _pontos = 0;
	
	
	//Regras
	private int _quantidadeDePalavras = 10;
	private int _contadorDePalavras = 0;
	//
	
	public MecanicaDoJogo (){
		_embaralhador = new FabricaEmbaralhadores().RetornarUmEmbaralhadorAleatoriamente();
		_bancoDePalavras = new BancoDePalavras();
	}
	
	public int RegraQuantidadeDePalavras(){
		return this._quantidadeDePalavras;
	}
	
	@Override
	public boolean JogoAcabou() {
		return !_jogoAcabou;
	}
	
	@Override
	public boolean UsuarioAcertouPalavra(String Resposta) {
		if(_palavraAtual.equalsIgnoreCase(Resposta)){ 
			this.AdicionarPontuacao();
			this._acertou = true;
			this.AumentarContadorDePalavras();
		}
		else{
			this._acertou = false;
		}
		this.AtualizarJogoAcabou();
		return this._acertou;
	}
	
	@Override
	public double ObterPontuacaoFinal() {
		return this._pontos;
	}
	
	@Override
	public boolean PodeTentarNovamente() {
		return this._podeTentarNovamente;
	}
	
	@Override
	public String RetornarPalavraEmbaralhada(){
		this.RezetarInformacoesPorPalavras();
		_palavraAtual = _bancoDePalavras.ObterPalavraAleatorioDaLista();
		return _embaralhador.EmbaralharPalavra(_palavraAtual);		
	}
	
	@Override
	public void RezetarInformacoesPorPalavras(){
		this._acertou = false;
	}
	
	@Override
	public String Regras() {
		
		return "";
	}
	
	public void AumentarContadorDePalavras(){
		this._contadorDePalavras++;
	}
	
	public void AdicionarPontuacao(){
		_pontos += this._embaralhador.ObterDificuldade() * 100;
	}
	
	public int ObterContadorDePalavras(){
		return this._contadorDePalavras;
	}
	
	public void AtualizarJogoAcabou(){
		if (this.ObterContadorDePalavras() >= this.RegraQuantidadeDePalavras())
			this._jogoAcabou = true;
		else
			this._jogoAcabou = false;
	}
	
}
