import java.math.BigDecimal;

public class ContaBancaria {
	private final String cliente;
	private final String numeroDaConta;
	protected BigDecimal saldo;
	
	public ContaBancaria(String cliente, String numeroDaConta) {	
		this.cliente = cliente;
		this.numeroDaConta= numeroDaConta;
		this.saldo = BigDecimal.ZERO;
	}
	
	
	public String getCliente() {
		return this.cliente;
	}

	public String getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	
	public void sacar(BigDecimal valor) {
		if(this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) == -1) {
			System.out.printf("Cliente: %s , Conta: %s.%n"
					+ "Não foi possivel efetuar o saque de R$%.2f.%n"
					+ "Saldo da conta: R$%.2f.%n", cliente, numeroDaConta, valor, saldo);
			return;
			
		}
		
		this.saldo = this.saldo.subtract(valor);
		System.out.printf("Cliente: %s , Conta: %s.%n"
				+ "Saque de R$%.2f efetuado com sucesso.%n"
				+ "Novo saldo: %.2f.%n", cliente, numeroDaConta, valor, saldo);
	
	}
	
	public void depositar(BigDecimal valor) {
		if(valor.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("Não foi possivel efetuar o deposito.%nValor do deposito deve ser maior que zero.%n");
			return;
		}
		
		this.saldo = this.saldo.add(valor);
		System.out.printf("Cliente: %s , Conta: %s.%n"
				+ "Deposito de R$%.2f efetuado com sucesso.%n"
				+ "Novo saldo: %.2f.%n%n", cliente, numeroDaConta, valor, saldo);
	}
}
