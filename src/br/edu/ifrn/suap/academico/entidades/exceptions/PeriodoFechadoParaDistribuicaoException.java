package br.edu.ifrn.suap.academico.entidades.exceptions;

import br.edu.ifrn.suap.academico.entidades.Periodo;

public class PeriodoFechadoParaDistribuicaoException extends Exception {

	private Periodo periodo;

	public PeriodoFechadoParaDistribuicaoException(Periodo periodo) {
		super("O período está fechado para distribuição (" + periodo + ")");
		this.periodo = periodo;
	}
}
