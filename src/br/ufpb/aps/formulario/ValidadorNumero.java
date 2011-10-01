package br.ufpb.aps.formulario;

public class ValidadorNumero  implements Validador{

	private int min;
	private int max;

	public ValidadorNumero(){
		this.min = 0;
		this.max = 150;
	}

	@Override
	public void validar(String valor) throws ValorIncompativelException {

		try{
			int valorValidar = Integer.parseInt(valor);

			if(valorValidar < min){
				throw new ValorIncompativelException ("valor menor que "+min);

			}if(valorValidar> max){
				throw new ValorIncompativelException ("valor maior que "+max);
			}
		}catch(NumberFormatException e){
			throw new ValorIncompativelException ("valor nao eh um inteiro");
		}
	}
}

