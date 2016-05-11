package br.edu.ifrn.suap.academico.entidades;

public class Disciplina {

	public Disciplina(String codigo, String titulo, int ch) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.ch = new CargaHoraria(ch);
	}

	public Object curso;
	
	public final String codigo;
	public final String titulo;
	public final CargaHoraria ch;

}
