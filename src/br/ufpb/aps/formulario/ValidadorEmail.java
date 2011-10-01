package br.ufpb.aps.formulario;

public class ValidadorEmail implements Validador {

	private String arroba;
	
	public ValidadorEmail(){
		this.arroba = "@";
	}
	
	@Override
	public void validar(String valorValidar) throws ValorIncompativelException {
		//Verifica se existe o caracter "@" na String passada
		if(valorValidar.contains(arroba) != true){
			throw new ValorIncompativelException("Email invalido");
		}
	}
}
