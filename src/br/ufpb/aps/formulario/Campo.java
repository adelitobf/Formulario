package br.ufpb.aps.formulario;

public class Campo {
	private Validador validador;
	private String label;
	private String valor;
	private String id;
	
	
	public Campo(String label, String id){
		this.label = label;
		this.id = id;
	}
	
	
	public boolean validar() throws ValorIncompativelException{
		try{
			validador.validar(this.valor);
			return true;
		}catch(ValorIncompativelException erro){
			throw new ValorIncompativelException(erro.getMessage());
		}
	}

}
