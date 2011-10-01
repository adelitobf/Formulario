package br.ufpb.aps.formulario;

public class Campo {
	private Validador validador;
	private String label;
	private String valor;

	
	
	public Campo(String label, String id){
		this.label = label;
		this.valor = "";
		
	}
		
	public boolean validar() throws ValorIncompativelException{
		try{
			if (this.label == "Nome"){
				validador = new ValidadorTexto();
				validar();
			}
			if(this.label =="Email"){
				validador = new ValidadorEmail();
				validar();
			}else{
				validador = new ValidadorNumero();
				validar();
			}
		}catch(ValorIncompativelException erro){
			throw new ValorIncompativelException(erro.getMessage());
		}
		return false;
	}
}
