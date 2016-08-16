/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.suap.academico.entidades;

import org.testng.annotations.Test;

import static org.testng.Assert.*;



/**
 *
 * @author joab
 */
@Test
public class DistribuicaoNGTest {
	
	
	public void testPeriodoValido() throws PeriodoFechadoException {
		
		//Criar periodos validos (Presente/Futuro)
		String semestre_presente = "2016.1";
		Periodo periodo_presente;
		periodo_presente = new Periodo(semestre_presente, EstadoPeriodo.Presente);
		
		String semestre_futuro = "2016.2";
		Periodo periodo_futuro;
		periodo_futuro = new Periodo(semestre_futuro, EstadoPeriodo.Futuro);
		
		
		Distribuicao distribuicao;
		distribuicao = new Distribuicao();
	
		//Testar buscar por semestre com presente
		Distribuicao distribuicao_presente = Distribuicao.buscarPorSemestreAberto(periodo_presente);
		assertTrue(distribuicao_presente.periodo.valor.equals(semestre_presente));
		assertTrue(distribuicao_presente.periodo.estado.equals(EstadoPeriodo.Presente));
		
		//Testar buscar por semestre com futuro
		Distribuicao distribuicao_futuro = Distribuicao.buscarPorSemestreAberto(periodo_futuro);
		assertTrue(distribuicao_futuro.periodo.valor.equals(semestre_futuro));
		assertTrue(distribuicao_futuro.periodo.estado.equals(EstadoPeriodo.Futuro));
		
	}
	
	@Test(expectedExceptions = PeriodoFechadoException.class)
	public void testPeriodoFechado() throws PeriodoFechadoException {
		
		//Criar periodo invalido (Passado)
		Periodo periodo_passado;
		periodo_passado = new Periodo("2015.2", EstadoPeriodo.Passado);
		
		Distribuicao.buscarPorSemestreAberto(periodo_passado);
	}
	
}
