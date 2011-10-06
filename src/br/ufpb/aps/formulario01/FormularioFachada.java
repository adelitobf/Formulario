package br.ufpb.aps.formulario01;

import java.util.LinkedList;
import  java.util.List;

public class FormularioFachada {
	
	private Formulario formulario;


	public void listarFormulario() {
		this.formulario.listarCampo();
	}

	public void salvarValorCampo(Campo campo){
		this.formulario.adicionarCampo(campo);
	}

}