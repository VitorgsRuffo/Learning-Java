
//Suponha que ocorreu uma atualização na biblioteca que usamos e a classe
//de controle de ponto dos funcionarios atualizou. Usaremos o padrao adapter
//para adaptar a nossa classe principal (consumidora desses serviços) as 
//mudanças da maneira mais facil possivel.

//Obs: a classe antiga continua existindo mas devemos usar a sua nova versao.
public class Principal {

	public static void main(String[] args) throws InterruptedException {
		
		ControleDePonto controleDePonto = 
				new ControleDePonto();

		Funcionario funcionario = 
				new Funcionario("Joao de Souza");
		

		controleDePonto.registrarEntrada(funcionario);

		Thread.sleep(3000);	

		controleDePonto.registrarSaida(funcionario);
		
	}
}