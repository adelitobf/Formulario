package br.ufpb.aps.formulario01;

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

			aux = scanner.nextInt();

			String condicional = "C";
			while(condicional.equals("C")){

				switch(aux){

				case 1:
					campo = new Campo();

					System.out.println("---- Cadastro de Usuario ----");
					System.out.println("Nome:  ");
					dado = scanner.nextLine();
					campo.validarCampo(dado, new ValidadorTexto());
					campo.setDado(dado);
					
//					System.out.println("Email:  ");
//					dado = scanner.nextLine();
//					campo.validarCampo(dado, new ValidadorEmail());
//					campo.setDado(dado);
//					
//					System.out.println("Email:  ");
//					dado = scanner.nextLine();
//					campo.validarCampo(dado, new ValidadorIdade());
//					campo.setDado(dado);
					

					break;

				case 2:
					System.out.println("---- Listar cadastros ----");
					fachada.listarFormulario();
					System.out.println(">Fim");
					System.out.println("[C]ontinua ou [F]inaliza?");
					condicional = scanner.nextLine();
					break;
					

				}//fim switch

				System.out.println("[C]ontinua ou [F]inaliza?");
				condicional = scanner.next();
				System.out.println("Ate Logo!");


			}//fim while
		}//fim main
	}
}
