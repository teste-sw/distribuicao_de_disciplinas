package br.edu.ifrn.suap.academico.entidades;

public class Professor {


	// FIXME a função tem 2 objetivos: calcular e incrementar. Precisa de simplificação
	public void calcularCHDistribuido(Periodo periodo, Disciplina disciplina) throws PeriodoFechadoParaDistribuicaoException {
		if (periodo == null || disciplina == null) throw new NullPointerException();
		if(!periodo.estaAbertoParaDistribuicao()) throw new PeriodoFechadoParaDistribuicaoException(periodo);
	
	}


}
