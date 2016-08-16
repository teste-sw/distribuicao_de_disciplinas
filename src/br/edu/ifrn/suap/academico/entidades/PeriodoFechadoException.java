/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.suap.academico.entidades;

/**
 *
 * @author joab
 */
class PeriodoFechadoException extends Exception {
	
	public PeriodoFechadoException() {};
	
	public PeriodoFechadoException(String message) {
		super(message);
	};
}
