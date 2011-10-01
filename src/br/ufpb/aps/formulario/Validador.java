package br.ufpb.aps.formulario;

public interface Validador {

	public void  validar(String valor) throws ValorIncompativelException;
	
}
