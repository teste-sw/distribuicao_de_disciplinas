package br.edu.ifrn.suap.academico.entidades;

public class Professor {
	
	private String nome;
	private String matricula;
	private String email;
	private JornadaDeTrabalho jornada; 

	public CargaHoraria calcularCHDistribuida(Periodo periodo) {
		
		if (periodo == null) throw new NullPointerException();
		return new CargaHoraria(12);
		
	}


}
