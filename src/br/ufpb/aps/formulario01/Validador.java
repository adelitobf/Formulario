package br.ufpb.aps.formulario01;

public interface Validador {

	public boolean  validar(String valor) throws ValorIncompativelException;
	
}
