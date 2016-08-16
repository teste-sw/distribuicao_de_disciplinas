package br.edu.ifrn.suap.academico.entidades;

import java.util.Set;

public class Distribuicao {
    public Periodo periodo;
    public EstadoDistribuicao estado;
    public Set<Curso> cursos;
    public Set<DisciplinaDistribuida> disciplinas;
    public Set<Professor> professores;
    public Set<VersionamentoDeInconformidades> verificacoes;
	
	
	public static Distribuicao buscarPorSemestreAberto(Periodo periodo) throws PeriodoFechadoException{
		if(periodo.estado == EstadoPeriodo.Passado){
			throw new PeriodoFechadoException("Periodo "+periodo.valor+"está fechado");
		}
		
		return new Distribuicao();
	};
	
	
}
