package br.edu.ifrn.suap.academico.entidades;

import org.w3c.dom.ranges.RangeException;

public class CargaHoraria {
	private int unidade;
	
	public CargaHoraria incrementar(CargaHoraria cargaHoraria2) {
		if (cargaHoraria2.unidade < 0)
			throw new RangeException((short) 0, "Carga horária menor que zero.");
		return new CargaHoraria(this.unidade+cargaHoraria2.unidade);
	}

	public CargaHoraria(int u){
		this.unidade = u;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof CargaHoraria)
			return ((CargaHoraria)obj).unidade == this.unidade;
		return super.equals(obj);
	}
}
