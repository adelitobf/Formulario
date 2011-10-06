package br.ufpb.aps.formulario01;

import java.util.LinkedList;
import java.util.List;


public class Formulario {

	private Validador validador;
	private List<Campo> listaCampos;
	
	public Formulario(){
		this.listaCampos = new LinkedList<Campo>();
		this.validador = new ValidadorTexto();
	}

	public void listarCampo(){
		for(Campo i: listaCampos)
			System.out.println(i.getDado());	
	}

	public void adicionarCampo(Campo campo){
		this.listaCampos.add(campo);
	}
}
