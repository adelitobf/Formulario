package br.ufpb.aps.formulario01;

public class ValidadorEmail implements Validador {

	private String arroba;
	
	public ValidadorEmail(){
		this.arroba = "@";
	}
	
	@Override
	public boolean validar(String dadoValidar) throws ValorIncompativelException {
		if(!dadoValidar.contains(arroba)){
			throw new ValorIncompativelException("Email invalido. Favor digitar novamente!");
		}
		return true;
	}
}
