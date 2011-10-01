package br.ufpb.aps.formulario;

import java.util.Scanner;


public class Main {

	public static void main (String[] args){
		private FormularioFachada f;
		private int aux =0;
		private String condicional;
		private String valor; 
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("---- Sistema de cadastro ----");
		System.out.println(" [1] Cadastrar");
		System.out.println(" [2] Listar itens cadastrados");
		System.out.println(" [0] Sair");
		aux = scanner.nextInt();
				
		while (aux!=0){
			
			switch(aux){
			case 1:
			f.gerarFormulario(valor, valor);
			System.out.println("---- Cadastro de Usuario ----");
			System.out.println("Nome:  ");
			valor = scanner.nextLine();
			f.salvarValorCampo(valor);
			System.out.println("Email:  ");
			valor = scanner.nextLine();
			f.salvarValorCampo(valor);
			System.out.println("Idade:  ");
			valor = scanner.nextLine();
			f.salvarValorCampo(valor);
			System.out.println("[C]ontinua ou [F]inaliza?");
			condicional = scanner.next();
			if(condicional != "C"){
				break;
			}
			case 2:
				System.out.println("---- Listar cadastros ----");
				System.out.println(f.listarCadastro());
				System.out.println(">Fim");
				System.out.println("[C]ontinua ou [F]inaliza?");
				condicional = scanner.nextLine();
				if(condicional != "C"){
					break;
				}

			}//fim switch
			System.out.println("Ate Logo!");


		}//fim while
	}//fim main
}
