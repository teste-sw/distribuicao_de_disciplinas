package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;
import java.util.Iterator;

public class Distribuicao {
	
	public Periodo periodo;
	public Curso curso;
	public Disciplina disciplina;
	public Collection<Professor> professores;
	
	private Distribuicao(Periodo periodo, Curso curso, Disciplina disciplina, Collection<Professor> professores){
		this.periodo = periodo;
		this.curso = curso;
		this.disciplina = disciplina;
		this.professores = professores;
	}

	public static Distribuicao distribuir(Periodo periodo, Curso curso,
			Disciplina disciplina, Collection<Professor> professores) throws CursoSemPeriodoException, DisciplinaSemCursoException {
		if (periodo == null || 
				curso == null ||
				disciplina == null ||
				professores == null ||
				professores.isEmpty()) { 
			throw new NullPointerException("Objetos não podem ser nulos");
		}
		if (curso.periodo == null || !curso.periodo.equals(periodo))
			throw new CursoSemPeriodoException("O curso não tem relacionamento com o periodo.");
		
		if (disciplina.curso == null || !disciplina.curso.equals(curso))
			throw new DisciplinaSemCursoException("A disciplina não tem relacionamento com o curso.");

		return new Distribuicao(periodo, curso, disciplina, professores);
	}

}
