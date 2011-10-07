package br.ufpb.aps.formulario01;

public class ValidadorIdade  implements Validador{

	private int min;
	private int max;

	public ValidadorIdade(){
		this.min = 0;
		this.max = 150;
	}

	@Override
	public boolean validar(String dado) throws ValorIncompativelException {

		try{
			int dadoValidar = Integer.parseInt(dado);

			if(dadoValidar < min){
				throw new ValorIncompativelException ("Valor menor que "+min+". Favor digitar novamente!");

			}if(dadoValidar > max){
				throw new ValorIncompativelException ("Valor maior que "+max+". Favor digitar novamente!");
			}
		}catch(NumberFormatException e){
			throw new ValorIncompativelException ("Valor nao eh um inteiro. Favor digitar novamente!");
		}
		return true;
	}
}

