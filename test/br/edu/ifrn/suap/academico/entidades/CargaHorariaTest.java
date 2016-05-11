package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.w3c.dom.ranges.RangeException;

public class CargaHorariaTest {
	@Test
	public void testIncrementar() {
		CargaHoraria cargaHoraria = new CargaHoraria(1);
		CargaHoraria cargaHoraria2 = new CargaHoraria(2);
		
		CargaHoraria cargaHorariaComputado = cargaHoraria.incrementar(cargaHoraria2);
		CargaHoraria cargaHorariaEsperada = new CargaHoraria(3);
		
		assertEquals(cargaHorariaEsperada, cargaHorariaComputado);
	}
	
	@Test(expected=NullPointerException.class)
	public void testCargaHoraria2Invalida()
	{
		CargaHoraria ch = new CargaHoraria(1);
		ch.incrementar(null);
	}
	
	@Test(expected=RangeException.class)
	public void testCargaHoraria2MenorQueZero()
	{
		CargaHoraria ch = new CargaHoraria(1);
		CargaHoraria ch2 = new CargaHoraria(-1);
		ch.incrementar(ch2);
	}
}
