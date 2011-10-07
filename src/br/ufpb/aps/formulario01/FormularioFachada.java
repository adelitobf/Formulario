package br.ufpb.aps.formulario01;

import java.util.LinkedList;
import  java.util.List;

public class FormularioFachada {

	private Formulario formulario;

	public FormularioFachada(){
		this.formulario = new Formulario();
	}

	public void listarFormulario() {
		this.formulario.listarCampo();
	}

	public void salvarDadoCampo(Campo campo){
		this.formulario.adicionarCampo(campo);
	}

}