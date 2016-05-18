package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;

public class Periodo {
	
	private PeriodoEstado estado;
	private String valor;

	private Collection<Distribuicao> distribuicoes;
	
	// FIXME estaAberto deve ser mudado para estado
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
