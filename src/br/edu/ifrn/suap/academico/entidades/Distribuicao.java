package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;

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
		if (parametrosNaoNulos(periodo, curso, disciplina, professores)) { 
			throw new NullPointerException("Objetos não podem ser nulos");
		}
		if (associacaoValidaEntrePeriodoECurso(periodo, curso))
			throw new CursoSemPeriodoException("O curso não tem relacionamento com o periodo.");
		
		if (associacaoValidaEntreCursoEDisciplina(curso, disciplina))
			throw new DisciplinaSemCursoException("A disciplina não tem relacionamento com o curso.");

		return new Distribuicao(periodo, curso, disciplina, professores);
	}

	private static boolean associacaoValidaEntreCursoEDisciplina(Curso curso, Disciplina disciplina) {
		return disciplina.curso == null || !disciplina.curso.equals(curso);
	}

	private static boolean parametrosNaoNulos(Periodo periodo, Curso curso, Disciplina disciplina, Collection<Professor> professores) {
		return periodo == null || 
				curso == null ||
				disciplina == null ||
				professores == null ||
				professores.isEmpty();
	}
	
	private static boolean associacaoValidaEntrePeriodoECurso(Periodo periodo, Curso curso) {
		return curso.periodo == null || !curso.periodo.equals(periodo);
	}
	
}
