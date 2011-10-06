package br.ufpb.aps.formulario01;

import br.ufpb.aps.formulario01.Validador;

public class ValidadorTexto implements Validador{

	private int max;

	public ValidadorTexto(){
		this.max = 30;
	}

	@Override
	public boolean validar(String valor) throws ValorIncompativelException{
	
			if (valor.length() > max){
				throw new ValorIncompativelException("O tamanho maximo do valor eh "+max);
			}
			return true;
	}
}
