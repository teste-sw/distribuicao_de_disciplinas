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

}
