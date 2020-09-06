import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<ContaPoupanca>();
		ArrayList<ContaCorrente> contasCorrente = new ArrayList<ContaCorrente>();

		int opcao;
		char tipoDeConta;
		ContaPoupanca contaP;
		ContaCorrente contaC;
		String nome;
		String numeroDaConta;
		int diaDeRendimento;
		double limite;
		double valorDoSaque;
		double taxaDeRendimento;
		double valorDoDeposito;
		
		do {
			System.out.println("-----------Menu----------");
			System.out.println("  1 - Cadastrar conta.   ");
			System.out.println("  2 - Sacar.             ");
			System.out.println("  3 - Atualizar poupanca.");
			System.out.println("  4 - Depositar.         ");
			System.out.println("  5 - Mostar saldo.      ");
			System.out.println("  6 - Sair.              ");
			System.out.println("-------------------------");
			
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					
					System.out.println("Nome do cliente:");
					nome = input.next();
					System.out.println("Numero da conta:");
					numeroDaConta = input.next();
					
					System.out.println("Indique o tipo da conta: Poupanca(P) ou Corrente(C)");
					tipoDeConta = input.next().toCharArray()[0];

					if(tipoDeConta == 'P') {
						
						System.out.println("Insira o dia de rendimento:");
						diaDeRendimento = input.nextInt();
						contasPoupanca.add(new ContaPoupanca(nome, numeroDaConta, diaDeRendimento));
						System.out.printf("A conta poupanca de %s foi cadastrada com sucesso.%n", nome);
					
					}else if(tipoDeConta == 'C') {
						
						System.out.println("Insira o limite:");
						limite = input.nextDouble();
						contasCorrente.add(new ContaCorrente(nome, numeroDaConta, limite));
						System.out.printf("A conta corrente de %s foi cadastrada com sucesso.%n", nome);
					
					}else {
						System.out.println("Tipo de conta invalido. Nao foi possivel efetuar o cadastro.");
					}
					break;
					
				case 2:
					
					System.out.println("Indique o tipo da conta: Poupanca(P) ou Corrente(C)");
					tipoDeConta = input.next().toCharArray()[0];
					
					System.out.println("Numero da conta:");
					numeroDaConta = input.next();
					System.out.println("Valor do saque:");
					valorDoSaque = input.nextDouble();
					
					if(tipoDeConta == 'P') {
						
						contaP = buscaDeContaPoupancaPeloSeuNumero(contasPoupanca, numeroDaConta);
						if(contaP == null) {
							System.out.printf("Conta (%s) nao encontrada. Nao foi possivel efetuar o saque.%n", numeroDaConta);
							break;
						}
						contaP.sacar(BigDecimal.valueOf(valorDoSaque));
						
					}else if(tipoDeConta == 'C') {
						
						contaC = buscaDeContaCorrentePeloSeuNumero(contasCorrente, numeroDaConta);
						if(contaC == null) {
							System.out.printf("Conta (%s) nao encontrada. Nao foi possivel efetuar o saque.%n", numeroDaConta);
							break;
						}
						contaC.sacar(BigDecimal.valueOf(valorDoSaque));
					
					}else {
						System.out.println("Tipo invalido de conta invalido. Nao foi possivel efetuar o saque.");
					}
					break;
					
				case 3:
					
					System.out.println("Numero da conta:");
					numeroDaConta = input.next();
					
					System.out.println("Taxa de rendimento:");
					taxaDeRendimento = input.nextDouble();
					
					contaP = buscaDeContaPoupancaPeloSeuNumero(contasPoupanca, numeroDaConta);
					if(contaP == null) {
						System.out.printf("Conta (%s) nao encontrada. Nao foi possivel calcular o rendimento.%n", numeroDaConta);
						break;
					}
					contaP.calcularNovoSaldo(BigDecimal.valueOf(taxaDeRendimento));
					break;
					
				case 4:
					
					System.out.println("Numero da conta:");
					numeroDaConta = input.next();
					System.out.println("Valor do deposito: ");
					valorDoDeposito = input.nextDouble();
					
					System.out.println("Indique o tipo da conta: Poupanca(P) ou Corrente(C)");
					tipoDeConta = input.next().toCharArray()[0];
					
					if(tipoDeConta == 'P') {
						
						contaP = buscaDeContaPoupancaPeloSeuNumero(contasPoupanca, numeroDaConta);
						if(contaP == null) {
							System.out.printf("Conta poupanca (%s) nao encontrada.", numeroDaConta);
							break;
						}
						contaP.depositar(BigDecimal.valueOf(valorDoDeposito));
						
					}else if(tipoDeConta == 'C') {
						
						contaC = buscaDeContaCorrentePeloSeuNumero(contasCorrente, numeroDaConta);
						if(contaC == null) {
							System.out.printf("Conta corrente (%s) nao encontrada.", numeroDaConta);
							break;
						}
						contaC.depositar(BigDecimal.valueOf(valorDoDeposito));
						
					}else 
						System.out.println("Tipo de conta invalido. Nao foi possivel efetuar o deposito.");
					
					break;
					
				case 5:
					
					System.out.println("Numero da conta:");
					numeroDaConta = input.next();
					
					System.out.println("Indique o tipo da conta: Poupanca(P) ou Corrente(C)");
					tipoDeConta = input.next().toCharArray()[0];
					
					if(tipoDeConta == 'P') {
						
						contaP = buscaDeContaPoupancaPeloSeuNumero(contasPoupanca, numeroDaConta);
						if(contaP == null) {
							System.out.printf("Conta poupanca (%s) nao encontrada.%n", numeroDaConta);
							break;
						}
						System.out.printf("Cliente: %s , Conta: %s.%n"
								+ "Saldo da conta: R$%s.%n", contaP.getCliente(), contaP.getNumeroDaConta(), contaP.getSaldo());
					
					}else if(tipoDeConta == 'C') {
						
						contaC = buscaDeContaCorrentePeloSeuNumero(contasCorrente, numeroDaConta);
						if(contaC == null) {
							System.out.printf("Conta corrente (%s) nao encontrada.%n", numeroDaConta);
							break;
						}
						System.out.printf("Cliente: %s , Conta: %s.%n"
								+ "Saldo da conta: R$%s.%n", contaC.getCliente(), contaC.getNumeroDaConta(), contaC.getSaldo());
						
					}else 
						System.out.println("Tipo de conta invalido. Nao foi possivel checar o saldo.");
					
					break;
					
				case 6:
					System.out.printf("%nSaindo..%n");
					break;
				default:
					System.out.printf("%nOpcao invalida.%n");
			}
		}while(opcao != 6);
		
	}
	
	public static ContaPoupanca buscaDeContaPoupancaPeloSeuNumero(ArrayList<ContaPoupanca> contasPoupanca, String numeroDaContaBuscada) {
		for(ContaPoupanca contaPoupanca : contasPoupanca) {
			if(contaPoupanca.getNumeroDaConta().equals(numeroDaContaBuscada)) {
				return contaPoupanca;
			}
		}
		return null;
	}
	
	public static ContaCorrente buscaDeContaCorrentePeloSeuNumero(ArrayList<ContaCorrente> contasCorrente, String numeroDaContaBuscada) {
		for(ContaCorrente contaCorrente : contasCorrente) {
			if(contaCorrente.getNumeroDaConta().equals(numeroDaContaBuscada)) {
				return contaCorrente;
			}
		}
		return null;
	}
	
}
