package br.edu.ifrn.suap.academico.entidades;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CursoTest {

	private Curso curso;
	private Disciplina discTesteSW;
	private Disciplina discArquiteturaSW;
	
	@Before
	public void antesDaExecucaoDeCadaTeste() {
		this.discTesteSW = new Disciplina("TEC.0030",	"Teste de software", 60);
		this.discArquiteturaSW = new Disciplina("TEC.0025", "Arquitetura de software", 60);

		this.curso = new Curso("01404", "Tecnologia em análise e desenvolvimento de sistemas", CursoNivel.Graduacao);
		this.curso.adicionaDisciplina(5, discTesteSW);
	}
	
	@Test
	public void testTemDisciplina() {		
		assertFalse(this.curso.temDisciplina(this.discArquiteturaSW));
		assertTrue(this.curso.temDisciplina(this.discTesteSW));
	}
	
	@Test
	public void testAdicionaDisciplina() {
		assertFalse(this.curso.adicionaDisciplina(5, this.discTesteSW));
		
		assertTrue(curso.adicionaDisciplina(4, discArquiteturaSW));
		assertFalse(curso.adicionaDisciplina(4, discArquiteturaSW));
	}

	// FIXME Implementar public void testAdicionaDisciplinaComPeriodoInvalido()
	
	// FIXME Implementar public void testAdicionaDisciplinaComDisciplinaInvalida()
}
