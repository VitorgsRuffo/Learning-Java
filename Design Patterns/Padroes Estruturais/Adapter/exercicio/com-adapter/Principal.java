package br.uel.adapter;

public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		//Devemos, então, mudar apenas o instanciamento do objeto para
		//ser do tipo da classe adapter sem precisar mudar os lugares
		//do codigo que invocam metodos desse objeto.
		ControleDePonto controleDePonto = 
				new ControleDePontoAdapter();
		
		Funcionario funcionario = 
				new Funcionario("Joao de Souza");
		
		
		//Não precisa mudar...
		controleDePonto.registrarEntrada(funcionario);
		
		Thread.sleep(3000);
		
		//Não precisa mudar...
		controleDePonto.registrarSaida(funcionario);
		
	}
}