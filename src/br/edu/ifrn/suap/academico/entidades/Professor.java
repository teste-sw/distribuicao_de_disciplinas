package br.edu.ifrn.suap.academico.entidades;

public class Professor {

	public CargaHoraria calcularCHDistribuida(Periodo periodo) {
		
		if (periodo == null) throw new NullPointerException();
		return new CargaHoraria(12);
		
	}


}
