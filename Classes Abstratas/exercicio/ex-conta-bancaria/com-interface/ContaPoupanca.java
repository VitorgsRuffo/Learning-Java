import java.math.BigDecimal;

public class ContaPoupanca implements ContaBancaria {
	//Problema: todas as implementaçoes de conta bancaria têm esses 3 atributos.
	//Assim, vamos ter repetiçao de codigo. Solução: classes abstrata
	private final String cliente;
	private final String numeroDaConta;
	private BigDecimal saldo;
	
	ContaPoupanca(String cliente, String numeroDaConta) {	
		this.cliente = cliente;
		this.numeroDaConta = numeroDaConta;
		this.saldo = BigDecimal.ZERO;
	}
	
	//Problema: a implementaçao dos desses getters é igual para todas as implementaçoes de conta bancaria.
	//Assim, vamos ter repetiçao de codigo. Solução: classes abstratas.
	public String getCliente() {
		return this.cliente;
	}
	
	public String getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	//Implementacao para os metodos abstratos das interfaces:
	@Override
	public void sacar(BigDecimal valor) {
		if(this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) == -1) {
			System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
					+ "Não foi possivel efetuar o saque de R$%.2f.%n"
					+ "Saldo da conta: R$%.2f.%n", cliente, numeroDaConta, valor, saldo);
			return;
			
		}
		
		this.saldo = this.saldo.subtract(valor);
		System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
				+ "Saque de R$%.2f efetuado com sucesso.%n"
				+ "Novo saldo: %.2f.%n", cliente, numeroDaConta, valor, saldo);
	
	}
	
	
	@Override//Problema: a implementaçao do depositar é igual para todas as implementaçoes de conta bancaria.
			//Assim, vamos ter repetiçao de codigo. Solução: classes abstratas.
	public void depositar(BigDecimal valor) {
		if(valor.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("Não foi possivel efetuar o deposito.%nValor do deposito deve ser maior que zero.%n");
			return;
		}
		
		this.saldo = this.saldo.add(valor);
		System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
				+ "Deposito de R$%.2f efetuado com sucesso.%n"
				+ "Novo saldo: %.2f.%n%n", cliente, numeroDaConta, valor, saldo);
	}
	
	//Metodos especificos de contas poupanca:
	public void calcularNovoSaldo(BigDecimal taxaDeRendimento) {
		if(taxaDeRendimento.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("A taxa de rendimento deve ser maior que zero.%n");
			return;
		}
		
		BigDecimal rendimento = this.saldo.multiply(taxaDeRendimento);
		this.saldo = this.saldo.add(rendimento);
		
		System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
				+ "O rendimento de %.2f foi aplicado ao saldo.%n"
				+ "Novo saldo: %.2f.%n", cliente, numeroDaConta, taxaDeRendimento, saldo);
	}

}