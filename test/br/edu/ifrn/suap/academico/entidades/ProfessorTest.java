package br.edu.ifrn.suap.academico.entidades;

import org.junit.Test;

public class ProfessorTest {
	
	@Test(expected = NullPointerException.class)
	public void testParametrosNullsCargaHoraria(){
		Professor prof = new Professor();
		prof.getCargaHoraria(null, null);
	}
	
	

}
