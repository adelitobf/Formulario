package br.ufpb.aps.formulario;

import java.util.LinkedList;
import  java.util.List;

public class FormularioFachada {
	private Campo campo;
	private List<Formulario> listarFormulario;
	private List<String> listaCampo;


	public FormularioFachada(){
		this.listarFormulario = new LinkedList<Formulario>();
		this.listaCampo = new LinkedList<String>();
	}

	public void gerarFormulario(){
		Formulario formulario = new Formulario();
		formulario.gerar();
	}

	public void listarCadastro() {
		Formulario formulario = new Formulario();
		formulario.listarCampo(campo);
	}

	public void salvarValorCampo(String valor){
		Formulario formulario = new Formulario();
		formulario.adcionarCampo(valor);
	}

}