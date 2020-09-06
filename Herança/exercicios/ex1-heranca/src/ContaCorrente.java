import java.math.BigDecimal;

public class ContaCorrente extends ContaBancaria{
	BigDecimal limite;
	
	public ContaCorrente(String cliente, String numeroDaConta, double limite) {
		super(cliente, numeroDaConta);
		
		this.limite = BigDecimal.valueOf(limite);
	}
	
	
	@Override
	public void sacar(BigDecimal valor) {
		if(this.limite.add(this.saldo.subtract(valor)).compareTo(BigDecimal.ZERO) == -1) {
			
			System.out.printf("Não foi possivel efetuar o saque de R$%.2f.%n"
					+ "Saldo da conta: R$%.2f.%n"
					+ "Limite: %.2f%n", valor, saldo, limite);
			return;
			
		}
		
		this.saldo = this.saldo.subtract(valor);
		System.out.printf("Saque de R$%.2f efetuado com sucesso.%n"
				+ "Novo saldo: %.2f.%n"
				+ "Limite: %.2f%n", valor, saldo, limite);
	
	}
}
