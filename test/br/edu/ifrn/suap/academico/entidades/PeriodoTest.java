package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class PeriodoTest {

	@Test
	public void testCriarPeriodoAberto() {
		Periodo periodo = Periodo.abrirNovoPeriodo();
		assertNotNull(periodo);
		assertTrue(periodo.estaAbertoParaDistribuicao());
	}
	
	@Test
	public void testFecharPeriodoParaDistribuicao() {
		Periodo periodo = Periodo.abrirNovoPeriodo();
		periodo.fecharPeriodoParaDistribuicao();
		assertFalse(periodo.estaAbertoParaDistribuicao());
	}

	@Test
	public void testAdicionarCurso() {
		Periodo periodo = Periodo.abrirNovoPeriodo();
		Curso curso = new Curso("01404", "TADS", CursoNivel.Graduacao);

		Curso resultado = periodo.adicionarCurso(curso); 
		assertEquals(curso, resultado);

	}
	
	@Test
	public void testTemCurso() {
		Periodo periodo = Periodo.abrirNovoPeriodo();
		Curso curso = new Curso("01404", "TADS", CursoNivel.Graduacao);

		assertFalse(periodo.temCurso(curso));

		periodo.adicionarCurso(curso);		
		assertTrue(periodo.temCurso(curso));
	}
}
