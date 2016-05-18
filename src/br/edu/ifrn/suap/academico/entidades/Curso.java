package br.edu.ifrn.suap.academico.entidades;

import java.util.Collection;

public class Curso {

	private String titulo;
	private String codigo;
	
	private Collection<Distribuicao> distribuicoes;
	
	// FIXME no novo modelo, periodo deverá sair daqui
	public Periodo periodo;

}
