package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;
import java.util.HashMap;

public class Curso {


	public Curso(String codigo, String titulo, CursoNivel graduacao) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.graduacao = graduacao;
		this.disciplinas = new HashMap<Disciplina, Integer>();
	}

	public final String titulo;
	public final String codigo;
	public final CursoNivel graduacao;
	
	private HashMap<Disciplina, Integer> disciplinas;

	private Collection<Distribuicao> distribuicoes;
	
	// FIXME no novo modelo, periodo deverá sair daqui
//	public Periodo periodo;

	public boolean temDisciplina(Disciplina disciplina) {
		return this.disciplinas.containsKey(disciplina);
	}

	public boolean adicionaDisciplina(int periodo, Disciplina disciplina) {
//		if (this.disciplinas.containsKey(disciplina)) return false;
		return this.disciplinas.put(disciplina, periodo) == null;
	}

}
