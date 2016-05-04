package br.edu.ifrn.suap.academico.entidades;

import org.junit.Before;
import org.junit.Test;

public class ProfessorTest {
	
	Professor professor;
	Periodo periodo;
	Disciplina disciplina;
	
	@Before
	public void setup(){
		professor = new Professor();
		periodo = Periodo.abrirNovoPeriodo();
		disciplina = new Disciplina();
	}
	
	@Test(expected = NullPointerException.class)
	public void testCalcularCHDistribuidaComParametrosNulos() throws PeriodoFechadoParaDistribuicaoException{
		
		professor.calcularCHDistribuido(null, null); // periodo, disciplina
	}
	
	@Test(expected = NullPointerException.class)
	public void testCalcularCHDistribuidaComParamatroPeriodoNulo() throws PeriodoFechadoParaDistribuicaoException{
		professor.calcularCHDistribuido(null, disciplina); // periodo, disciplina
	}
	
	@Test(expected = NullPointerException.class)
	public void testCalcularCHDistribuidaComParamatroDisciplinaNulo() throws PeriodoFechadoParaDistribuicaoException {
		professor.calcularCHDistribuido(periodo, null); // periodo, disciplina
	}
	
	@Test(expected = PeriodoFechadoParaDistribuicaoException.class)
	public void testCalcularChDistribuidaComPeriodoFechado() throws PeriodoFechadoParaDistribuicaoException
	{
		periodo.fecharPeriodoParaDistribuicao();
		professor.calcularCHDistribuido(periodo, disciplina); // periodo, disciplina
	}
	
	@Test
	public void testCalcularCHDistribuidaComDisciplinaIgualaZero() {
		// TODO implementar o teste para a pré-condição de disciplina válida
	}
	
	
	
	
	
	
	
	

}
