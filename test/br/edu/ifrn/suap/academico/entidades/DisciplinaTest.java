package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import org.junit.Test;

public class DisciplinaTest {

	@Test
	public void testConstrutor() {
		new Disciplina("XXX-0000", "", 30);
	}
	
	@Test
	public void testConstrutorRetorno(){
		String codigo = "123";
		String titulo = "teste";
		int iCH = 30;
		CargaHoraria ch = new CargaHoraria(iCH);
		
		Disciplina disciplina = new Disciplina(codigo, titulo, iCH);
		
		assertEquals(codigo, disciplina.codigo);
		assertEquals(titulo, disciplina.titulo);
		assertEquals(ch, disciplina.ch);
	}

	// FIXME Testar construtor com parametros invalidos (nulos, strings vazias, carga horaria invalida)  
	
	// FIXME implementar construtor que receba String, String, CargaHoraria
}






