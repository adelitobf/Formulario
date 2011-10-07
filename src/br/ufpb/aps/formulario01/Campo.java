package br.ufpb.aps.formulario01;

public class Campo {
	
	private String dado;

	public boolean validarCampo(String dadoEntrada, Validador validador) throws ValorIncompativelException{
		return validador.validar(dadoEntrada);
	}
	
	
	public String getDado() {
		return this.dado;
	}


	public void setDado(String dado) {
		this.dado = dado;
		
	}
}
