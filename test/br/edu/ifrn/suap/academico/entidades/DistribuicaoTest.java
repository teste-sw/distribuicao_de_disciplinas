package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class DistribuicaoTest {

	@Test
	public void testDistribuir() {
		Object periodo = null;
		Object curso = null;
		Object disciplina = null;
		Object professores = null;
		
		Distribuicao.distribuir(periodo, curso, disciplina, professores);
		fail("Not yet implemented");
	}

}
