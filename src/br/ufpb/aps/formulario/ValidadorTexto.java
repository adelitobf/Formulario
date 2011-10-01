package br.ufpb.aps.formulario;

import br.ufpb.aps.formulario.Validador;

public class ValidadorTexto implements Validador{

	private int max;

	public ValidadorTexto(){
		this.max = 30;
	}

	@Override
	public void validar(String valor) throws ValorIncompativelException{

		if (valor.length() > max)
			throw new ValorIncompativelException("O tamanho maximo do valor eh "+max);

	}
}
