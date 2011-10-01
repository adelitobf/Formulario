package br.ufpb.aps.formulario;

import java.util.LinkedList;
import java.util.List;


public class Formulario {

	private String nome;
	private Campo campo;
	private List<Campo> listaCampos;

	public Formulario(){
		this.nome = "";
		this.listaCampos = new LinkedList<Campo>();
	}

	public void adcionarCampo(Campo campo){
		this.listaCampos.add(campo);
	}
	
	public Campo listarCampo(Campo campo){
		for(int i =0;i < listaCampos.length; i++ ){
			
		}
	}
}
