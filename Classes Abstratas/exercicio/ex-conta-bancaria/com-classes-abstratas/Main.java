import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {

		Scanner input = 
				new Scanner(System.in);
		
		int opcao;
		
		
		ArrayList<ContaBancaria> contas =
				new ArrayList<ContaBancaria>();
		
		
		do {
			imprimirMenu();
			opcao = input.nextInt();
			
			switch(opcao) {
				case 1:
					cadastrarConta(input, contas);
					break;
				case 2:
					sacar(input, contas);
					break;
				case 3:
					atualizarPoupanca(input, contas);
					break;
				case 4:
					depositar(input, contas);
					break;
				case 5:
					mostrarSaldo(input, contas);
					break;
				case 6:
					calcularTributo(input, contas);
					break;
				case 7:
					calcularTaxaDeAdministracao(input, contas);
					break;
				case 8:
					System.out.printf("%nSaindo..%n");
					break;
				default:
					System.out.printf("%nOpcao invalida.%n");
			}
			
		}while (opcao != 8);
		
	}
	
	private static void imprimirMenu() {
		System.out.println("-----------Menu----------");
		System.out.println("  1 - Cadastrar conta.   ");
		System.out.println("  2 - Sacar.             ");
		System.out.println("  3 - Atualizar poupanca.");
		System.out.println("  4 - Depositar.         ");
		System.out.println("  5 - Mostar saldo.      ");
		System.out.println("  6 - Calcular tributos. ");
		System.out.println("  7 - Calcular taxa adm. ");
		System.out.println("  8 - Sair.              ");
		System.out.println("-------------------------");
	}
	
	private static void cadastrarConta(Scanner input, ArrayList<ContaBancaria> contas) {
		char tipoDeConta;
		String nome;
		String numeroDaConta;
		
		double limite;
		
		System.out.println("Tipo da conta - Conta Corrente (c), "
				+ "Conta Poupanca (p), "
				+ "Conta Investimento (i):");
		
		tipoDeConta = input.next().toCharArray()[0];
		
		System.out.println("Nome do cliente:");
		nome = input.next();
		
		System.out.println("Numero da conta:");
		numeroDaConta = input.next();

		if(tipoDeConta == 'c') {

			System.out.println("Limite da conta:");
			limite = input.nextDouble();

			contas.add(new ContaCorrente(nome, numeroDaConta, BigDecimal.valueOf(limite)));
		
		}else if(tipoDeConta == 'p') {
			
			contas.add(new ContaPoupanca(nome, numeroDaConta));

		}else if(tipoDeConta == 'i') {
			
			contas.add(new ContaInvestimento(nome, numeroDaConta));
		
		}else {
			System.out.println("Tipo de conta invalido. Nao foi possivel efetuar o cadastro.");
			return;
		}
		
		System.out.printf("A conta poupanca de %s foi cadastrada com sucesso.%n", nome);					
	}
	
	private static void sacar(Scanner input, ArrayList<ContaBancaria> contas) {
		System.out.println("Numero da conta:");
		String numeroDaConta = input.next();
		
		System.out.println("Valor do saque:");
		double valorDoSaque = input.nextDouble();
		
		ContaBancaria conta = buscarContaBancariaPorNumero(contas, numeroDaConta);
		if(conta == null) {
			
			System.out.printf("Conta (%s) nao encontrada. "
					+ "Nao foi possivel efetuar o saque.%n", numeroDaConta);
			
			return;
		}
		
		conta.sacar(BigDecimal.valueOf(valorDoSaque));
	}
	
	private static void atualizarPoupanca(Scanner input, ArrayList<ContaBancaria> contas) {
		System.out.println("Numero da conta:");
		String numeroDaConta = input.next();
		
		System.out.println("Taxa de rendimento:");
		double taxaDeRendimento = input.nextDouble();
		
		ContaBancaria conta = buscarContaBancariaPorNumero(contas, numeroDaConta);
		if(conta == null || !(conta instanceof ContaPoupanca)) {
			
			System.out.printf("Conta poupanca (%s) nao encontrada. "
					+ "Nao foi possivel calcular o novo saldo.%n", numeroDaConta);
			
			return;
		}
		
		//Para acessar metodos que nao estao previstos na interface (metodos especificos de uma implementacao da interface) precisamos fazer o casting do objeto, do tipo da interface para a sua implementaçao.
		((ContaPoupanca)conta).calcularNovoSaldo(BigDecimal.valueOf(taxaDeRendimento));
	}
	
	private static void depositar(Scanner input, ArrayList<ContaBancaria> contas) {
		System.out.println("Numero da conta:");
		String numeroDaConta = input.next();
		
		System.out.println("Valor do deposito: ");
		double valorDoDeposito = input.nextDouble();
		
		ContaBancaria conta = buscarContaBancariaPorNumero(contas, numeroDaConta);
		if(conta == null) {
			
			System.out.printf("Conta (%s) nao encontrada. "
					+ "Nao foi possivel efetuar o deposito.%n", numeroDaConta);
			
			return;
		}
		
		//Como qualquer conta bancaria deve implementar o metodo depositar nao precisamos castar o objeto. (O java vai verificar de qual implementacao da interface o objeto foi instanciado pra ver qual implementacao do metodo depositar ele deve chamar.)
		conta.depositar(BigDecimal.valueOf(valorDoDeposito));
	}
	
	private static void mostrarSaldo(Scanner input, ArrayList<ContaBancaria> contas) {
		System.out.println("Numero da conta:");
		String numeroDaConta = input.next();
		
		ContaBancaria conta = buscarContaBancariaPorNumero(contas, numeroDaConta);
		if(conta == null) {
			
			System.out.printf("Conta (%s) nao encontrada.%n", numeroDaConta);
			
			return;
		}
		
		//Aqui observamos um grande problema: os getters nao estao previstos na interface.
		//Cada implementacao da interface tem a necessidade de ter getters para seus atributos.
		//Assim, quando precimos chama-los devemos identificar a classe da qual o objeto é uma instancia
		//para entao podermos casta-lo e chamar os getters. (solução: classes abstratas, ou colocar ou getters na interface)
		if(conta instanceof ContaPoupanca)
			System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
				+ "Saldo da conta: R$%s.%n", ((ContaPoupanca)conta).getNomeDoCliente(), 
											 ((ContaPoupanca)conta).getNumeroDaConta(), 
											 ((ContaPoupanca)conta).getSaldo());
	
		else if(conta instanceof ContaCorrente)
			System.out.printf("Cliente: %s , Conta: %s. (Corrente)%n"
					+ "Saldo da conta: R$%s.%n", ((ContaCorrente)conta).getNomeDoCliente(), 
												 ((ContaCorrente)conta).getNumeroDaConta(), 
												 ((ContaCorrente)conta).getSaldo());
		
		else if(conta instanceof ContaInvestimento)
			System.out.printf("Cliente: %s , Conta: %s. (Investimento)%n"
					+ "Saldo da conta: R$%s.%n", ((ContaInvestimento)conta).getNomeDoCliente(), 
												 ((ContaInvestimento)conta).getNumeroDaConta(), 
												 ((ContaInvestimento)conta).getSaldo());
		
	}

	private static void calcularTributo(Scanner input, ArrayList<ContaBancaria> contas) {
		System.out.println("Numero da conta:");
		String numeroDaConta = input.next();
		
		System.out.println("Taxa de rendimento:");
		double taxaDeRendimento = input.nextDouble();
		
		ContaBancaria conta = buscarContaBancariaPorNumero(contas, numeroDaConta);
		if(conta == null || !(conta instanceof ContaInvestimento)) {
			
			System.out.printf("Conta investimento (%s) nao encontrada. "
					+ "Nao foi possivel calcular os tributos.%n", numeroDaConta);
			
			return;
		}
		
		BigDecimal tributos = 
				((ContaInvestimento)conta).calcularTributo(BigDecimal.valueOf(taxaDeRendimento));
		
		System.out.printf("Tributos da conta (%s): R$%.2f.%n", numeroDaConta, tributos);
	}
	
	private static void calcularTaxaDeAdministracao(Scanner input, ArrayList<ContaBancaria> contas) {
		System.out.println("Numero da conta:");
		String numeroDaConta = input.next();
		
		System.out.println("Taxa de rendimento:");
		double taxaDeRendimento = input.nextDouble();
		
		ContaBancaria conta = buscarContaBancariaPorNumero(contas, numeroDaConta);
		if(conta == null || !(conta instanceof ContaInvestimento)) {
			
			System.out.printf("Conta investimento (%s) nao encontrada. "
					+ "Nao foi possivel calcular as taxas de administracao.%n", numeroDaConta);
			
			return;
		}
		
		BigDecimal taxaAdministracao = 
				((ContaInvestimento)conta).calcularTaxaAdministracao(BigDecimal.valueOf(taxaDeRendimento));
		
		System.out.printf("Taxa de administracao da conta (%s): R$%.2f.%n", numeroDaConta, taxaAdministracao);
	}
		
	private static ContaBancaria buscarContaBancariaPorNumero(ArrayList<ContaBancaria> contas, String numeroDaContaBuscada) {
		for(ContaBancaria conta : contas) {
			
			//Aqui observamos um grande problema: os getters nao estao previstos na interface.
			//Cada implementacao da interface tem a necessidade de ter getters para seus atributos.
			//Assim, quando precimos chama-los devemos identificar a classe da qual o objeto é uma instancia
			//para entao podermos casta-lo e chamar os getters. (solução: classes abstratas, ou colocar ou getters na interface)
			if( conta instanceof ContaPoupanca && 
			    ((ContaPoupanca)conta).getNumeroDaConta().equals(numeroDaContaBuscada)) {
				
				return conta;
				
			}else if( conta instanceof ContaCorrente && 
				      ((ContaCorrente)conta).getNumeroDaConta().equals(numeroDaContaBuscada)) {
				
				return conta;
				
			}else if( conta instanceof ContaInvestimento && 
				      ((ContaInvestimento)conta).getNumeroDaConta().equals(numeroDaContaBuscada)) {
				
				return conta;
			}
			
		}
		
		return null;
	}

}