package br.ufpb.aps.formulario01;

import java.util.LinkedList;
import java.util.Scanner;


public class Main {

	public static void main (String[] args){

		FormularioFachada fachada = new FormularioFachada();
		int aux =-1;

		String dado; 
		Scanner scanner = new Scanner(System.in); 
		Campo campo ;

		while (aux!=0){

			System.out.println("---- Sistema de cadastro ----");
			System.out.println(" [1] Cadastrar");
			System.out.println(" [2] Listar itens cadastrados");
			System.out.println(" [0] Sair");
			System.out.println();

			aux = Integer.parseInt(scanner.nextLine());

			String condicional = "C";
			while(condicional.toUpperCase().equals("C")){

				switch(aux){

				case 1:
					campo = new Campo();
					try{
						System.out.println("---- Cadastro de Usuario ----");
						System.out.println("Nome:  ");
						dado = scanner.nextLine();
						campo.validarCampo(dado, new ValidadorTexto());
						campo.setDado(dado);
						fachada.salvarDadoCampo(campo);

						campo = new Campo();
						System.out.println("Email:  ");
						dado = scanner.nextLine();
						campo.validarCampo(dado, new ValidadorEmail());
						campo.setDado(dado);
						fachada.salvarDadoCampo(campo);

						campo = new Campo();
						System.out.println("Idade:  ");
						dado = scanner.nextLine();
						campo.validarCampo(dado, new ValidadorIdade());
						campo.setDado(dado);
						fachada.salvarDadoCampo(campo);
					}catch(ValorIncompativelException e){
						System.out.println(e.getMessage());
					}
					break;

				case 2:

					System.out.println("---- Listar cadastros ----");
					fachada.listarFormulario();
					System.out.println(">Fim");
					break;


				}//fim switch

				System.out.println("[C]ontinua ou [F]inaliza?");
				condicional = scanner.nextLine();

			}//fim while	
			System.out.println("Ate Logo!");
		}//fim main
	}
}
