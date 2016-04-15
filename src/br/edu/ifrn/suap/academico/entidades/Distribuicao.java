package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;
import java.util.Iterator;

public class Distribuicao {

	public static Distribuicao distribuir(Periodo periodo, Curso curso,
			Disciplina disciplina, Collection<Professor> professores) {
		if (periodo == null || 
				curso == null ||
				disciplina == null ||
				professores == null ||
				professores.isEmpty()) { 
			throw new NullPointerException("Objetos não podem ser nulos");
		}
		return null;
	}

}
