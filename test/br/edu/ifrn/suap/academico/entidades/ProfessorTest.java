package br.edu.ifrn.suap.academico.entidades;

import org.junit.Before;
import org.junit.Test;

import br.edu.ifrn.suap.academico.entidades.exceptions.CursoSemPeriodoException;
import br.edu.ifrn.suap.academico.entidades.exceptions.DisciplinaSemCursoException;
import br.edu.ifrn.suap.academico.entidades.exceptions.PeriodoFechadoParaDistribuicaoException;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

public class ProfessorTest {
	
	Professor professor;
	Periodo periodo;
	
	@Before
	public void setup(){
		professor = new Professor();
		periodo = Periodo.abrirNovoPeriodo();
	}
	
	@Test(expected = NullPointerException.class)
	public void testCalcularCHDistribuidaComParametrosNulos() throws PeriodoFechadoParaDistribuicaoException{
		
		professor.calcularCHDistribuida(null); // periodo
	}
	
	@Test
	public void testCalcularCHDistribuidaRetorno() throws CursoSemPeriodoException, DisciplinaSemCursoException{
		CargaHoraria CHComputada = professor.calcularCHDistribuida(periodo);
		CargaHoraria CHEsperada = new CargaHoraria(12);
		assertEquals(CHEsperada, CHComputada);
		Collection<Professor> professores = new ArrayList<Professor>();
		professores.add(this.professor);
		Curso curso = new Curso();
		// FIXME concluir o teste do retorno do método professor.calcularCHDistribuida
		Disciplina disciplina = new Disciplina("","",0);
//		disciplina.setCargaHoraria(14);
		Distribuicao distribuicao = Distribuicao.distribuir(periodo, curso, disciplina, professores);
		
	}
	
	
	
	
	
	
	
	

}
