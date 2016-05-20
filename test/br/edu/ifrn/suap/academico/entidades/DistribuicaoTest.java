package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

import br.edu.ifrn.suap.academico.entidades.exceptions.CursoSemPeriodoException;
import br.edu.ifrn.suap.academico.entidades.exceptions.DisciplinaSemCursoException;

public class DistribuicaoTest {

	Periodo periodo;
	Curso curso;
	Disciplina disciplina;
	Collection<Professor> professores;


	@Before
	public void setup() {
		this.periodo = Periodo.abrirNovoPeriodo();
		this.curso = new Curso("01404", 
				"Tecnologia em Análise e Desenvolvimento de Sistemas", 
				CursoNivel.Graduacao);
		this.disciplina = new Disciplina("TEC.0030", "Teste de Software", 60);
		this.professores = new ArrayList<Professor>();
		this.professores.add(new Professor());

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
		this.professores.add(new Professor());
		this.curso.periodo = this.periodo;
		this.curso.adicionaDisciplina(5, this.disciplina);

		Distribuicao resultado = Distribuicao.distribuir(this.periodo, this.curso, this.disciplina, this.professores);

		assertEquals(this.periodo, resultado.periodo);
		assertEquals(this.curso, resultado.curso);
		assertEquals(this.disciplina, resultado.disciplina);
		assertEquals(this.professores, resultado.professores);
	}


}
