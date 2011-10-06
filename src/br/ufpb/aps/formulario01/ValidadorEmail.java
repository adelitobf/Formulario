package br.ufpb.aps.formulario01;

public class ValidadorEmail implements Validador {

	private String arroba;
	
	public ValidadorEmail(){
		this.arroba = "@";
	}
	
	@Override
	public boolean validar(String valorValidar) throws ValorIncompativelException {
		//Verifica se existe o caracter "@" na String passada
		
		//lembrar de valaidar para numeros tb
		if(!valorValidar.contains(arroba)){
			throw new ValorIncompativelException("Email invalido");
		}
		return true;
	}
}
