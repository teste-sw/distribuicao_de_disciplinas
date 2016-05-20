package br.edu.ifrn.suap.academico.entidades;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CargaHorariaTest.class, 
	CursoTest.class,
	DistribuicaoTest.class, 
	PeriodoTest.class, 
	ProfessorTest.class, 
	DisciplinaTest.class })
public class AllTests {

}
