package br.edu.ifrn.suap.academico.entidades;

import java.util.Set;

public class Distribuicao {
    public Periodo periodo;
    public EstadoDistribuicao estado;
    public Set<Curso> cursos;
    public Set<DisciplinaDistribuida> disciplinas;
    public Set<Professor> professores;
    public Set<VersionamentoDeInconformidades> verificacoes;
	
	
	public Distribuicao(){}
	
	public Distribuicao(Periodo periodo){
		this.periodo = periodo;
		//Esta instância de distibuição deve fazer a distribuição
		//dos professores ao ser construída.
		//As inconformidades/verificações dever ser instanciadas.
		
	}
	
	public static Distribuicao buscarPorSemestreAberto(Periodo periodo) throws PeriodoFechadoException{
		if(periodo.estado == EstadoPeriodo.Passado){
			throw new PeriodoFechadoException("Periodo "+periodo.valor+"está fechado");
		}
		
		//A instância retornada deve ter a distribuição de disciplinas para professores feita.
		return new Distribuicao(periodo);
	};
	
	
}
