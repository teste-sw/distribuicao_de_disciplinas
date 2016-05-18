package br.edu.ifrn.suap.academico.entidades;

import org.w3c.dom.ranges.RangeException;

public class CargaHoraria {
	private int horaRelogio;
	private int horaAula;
	private int horaSemana;
	private int credito;
	
	public CargaHoraria incrementar(CargaHoraria ch) {
		if (ch.horaRelogio < 0)
			throw new RangeException((short) 0, "Carga horária menor que zero.");
		return new CargaHoraria(this.horaRelogio + ch.horaRelogio);
	}

	public CargaHoraria(int horaRelogio){
		this.horaRelogio = horaRelogio;
	}
	
	@Override
	public boolean equals(Object objeto) {
		if(objeto instanceof CargaHoraria)
			return ((CargaHoraria)objeto).horaRelogio == this.horaRelogio;
		return super.equals(objeto);
	}
}
