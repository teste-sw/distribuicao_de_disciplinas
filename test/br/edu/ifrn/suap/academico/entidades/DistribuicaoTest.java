package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class DistribuicaoTest {

	Periodo periodo;
	Curso curso;
	Disciplina disciplina;
	Collection<Professor> professores;


	@Before
	public void setup() {
		periodo = Periodo.abrirNovoPeriodo();
		curso = new Curso();
		disciplina = new Disciplina();
		professores = new ArrayList<Professor>();
		professores.add(new Professor());

	}

	@Test
	public void testDistribuir() throws CursoSemPeriodoException, DisciplinaSemCursoException {
		try {
			Distribuicao.distribuir(null, null, null, null);
			fail("Erro no teste de período = nulo");
		} catch (NullPointerException ex) {
		}
		try {
			Distribuicao.distribuir(periodo, null, null, null);
			fail("Erro no teste de curso = nulo");
		} catch (NullPointerException ex) {
		}
		try {
			Distribuicao.distribuir(periodo, curso, null, null);
			fail("Erro no teste de disciplina = nulo");
		} catch (NullPointerException ex) {
		}
		try {
			Distribuicao.distribuir(periodo, curso, disciplina, null);
			fail("Erro no teste de professores = nulo");
		} catch (NullPointerException ex) {
		}

		try {
			Distribuicao.distribuir(periodo, curso, disciplina, new ArrayList<Professor>());
			fail("Erro no teste de professores.isEmpty");
		} catch (NullPointerException ex) {
		}
		try {
			Distribuicao.distribuir(null, null, null, new ArrayList<Professor>());
			fail("...");
		} catch (NullPointerException ex) {
		}
		try {
			Distribuicao.distribuir(null, null, disciplina, new ArrayList<Professor>());
			fail("...");
		} catch (NullPointerException ex) {
		}
	}

	@Test(expected=CursoSemPeriodoException.class)
	public void testDistribuirCursoRelacionamentoPeriodo() throws CursoSemPeriodoException, DisciplinaSemCursoException {
		Distribuicao.distribuir(periodo, curso, disciplina, professores);
	}

	@Test(expected=DisciplinaSemCursoException.class)
	public void testDistribuirDisciplinaRelacionamentoCurso() throws DisciplinaSemCursoException, CursoSemPeriodoException {
		curso.periodo = periodo;
		Distribuicao.distribuir(periodo, curso, disciplina, professores);
	}

	@Test
	public void testInstanciaDistribuir() throws CursoSemPeriodoException, DisciplinaSemCursoException{
		professores.add(new Professor());
		curso.periodo = periodo;
		disciplina.curso = curso;

		Distribuicao resultado = Distribuicao.distribuir(periodo, curso, disciplina, professores);

		assertEquals(periodo, resultado.periodo);
		assertEquals(curso, resultado.curso);
		assertEquals(disciplina, resultado.disciplina);
		assertEquals(professores, resultado.professores);
	}


}
