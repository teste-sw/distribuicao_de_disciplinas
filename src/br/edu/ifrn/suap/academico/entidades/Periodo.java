package br.edu.ifrn.suap.academico.entidades;

public class Periodo {
	
	private boolean estaAberto; 
	
	private Periodo()
	{
		super();
		this.estaAberto = true;
	}

	public static Periodo abrirNovoPeriodo() {
		return new Periodo();
	}

	public boolean estaAbertoParaDistribuicao() {
		return this.estaAberto;
	}

	public void fecharPeriodoParaDistribuicao() {
		this.estaAberto = false;
	}
}
