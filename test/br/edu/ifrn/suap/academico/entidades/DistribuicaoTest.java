package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Test;

public class DistribuicaoTest {

	@Test(expected=NullPointerException.class)
	public void testDistribuir() {
		Periodo periodo = new Periodo();
		Curso curso = null;
		Disciplina disciplina = null;
		Collection<Professor> professores = new ArrayList<Professor>();
		
		Distribuicao.distribuir(periodo, curso, disciplina, professores);
	}

}
