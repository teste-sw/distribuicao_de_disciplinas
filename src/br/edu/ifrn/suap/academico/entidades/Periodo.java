package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Periodo {
	
	private PeriodoEstado estado;
	private String valor;

	private Collection<Distribuicao> distribuicoes;
	private Set<Curso> cursos;
	
	private Periodo()
	{
		super();
		this.estado = PeriodoEstado.AbertoParaDistribuicao;
		this.cursos = new HashSet<Curso>();
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

	public Curso adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		return curso;
	}

	public boolean temCurso(Curso curso) {
		return this.cursos.contains(curso);
	}
}
