package br.ufpb.aps.formulario01;

public class ValidadorTexto implements Validador{

	private int max;

	public ValidadorTexto(){
		this.max = 30;
	}

	@Override
	public boolean validar(String valor) throws ValorIncompativelException{

		if (valor.trim().length() > max){
			throw new ValorIncompativelException("O tamanho maximo do valor eh "+max+". Favor digitar novamente!");
		}
		for(int i=0; i < valor.length();i++){
			if(Character.isDigit(valor.charAt(i))){
				throw new ValorIncompativelException("O campo nao pode ter numero. Favor digitar novamente!");
			}
		}
		return true;
	}
}