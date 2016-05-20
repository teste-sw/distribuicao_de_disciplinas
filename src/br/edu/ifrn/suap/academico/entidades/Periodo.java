package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;

public class Periodo {
	
	private PeriodoEstado estado;
	private String valor;

	private Collection<Distribuicao> distribuicoes;
	
	private Periodo()
	{
		super();
		this.estado = PeriodoEstado.AbertoParaDistribuicao;
	}

	public static Periodo abrirNovoPeriodo() {
		return new Periodo();
	}

	public boolean estaAbertoParaDistribuicao() {
		return (this.estado == PeriodoEstado.AbertoParaDistribuicao);
	}

	public void fecharPeriodoParaDistribuicao() {
		this.estado = PeriodoEstado.FechadoParaDistribuicao;
	}
}
