package br.edu.ifrn.suap.academico.entidades;

public class PeriodoFechadoParaDistribuicaoException extends Exception {

	private Periodo periodo;

	public PeriodoFechadoParaDistribuicaoException(Periodo periodo) {
		super("O período está fechado para distribuição (" + periodo + ")");
		this.periodo = periodo;
	}
}
