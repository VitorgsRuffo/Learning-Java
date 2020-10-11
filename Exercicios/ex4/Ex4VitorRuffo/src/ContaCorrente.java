import java.math.BigDecimal;

public class ContaCorrente {
	private int numeroDaConta;
	private String nomeDoCliente;
	private BigDecimal saldo;
	
	ContaCorrente(int numeroDaConta, String nomeDoCliente, BigDecimal saldoInicial){
		this.numeroDaConta = numeroDaConta;
		this.nomeDoCliente = nomeDoCliente;
		this.saldo = saldoInicial;
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public String getNomeDoCliente() {
		return this.nomeDoCliente;
	}
	
	
	public BigDecimal getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public void efetuarTransferencia(ContaCorrente contaDestino, BigDecimal valor){
		if(this.saldo.subtract(valor).compareTo(BigDecimal.ZERO) == -1) { //saldo - valor < 0
			System.out.printf("Cliente: %s , Conta: %s.%n"
					+ "Não foi possivel efetuar a transferencia de R$%.2f para a conta (%d).%n"
					+ "Saldo da conta: R$%.2f.%n%n", nomeDoCliente, 
												   numeroDaConta, 
												   valor, 
												   contaDestino.getNumeroDaConta(), 
												   saldo);
			return;
			
		}
		
		this.saldo = this.saldo.subtract(valor);
		contaDestino.setSaldo(contaDestino.getSaldo().add(valor));
		
		System.out.printf("Cliente: %s , Conta: %s.%n"
				+ "A transferencia de R$%.2f. para a conta (%d) foi efetuada com sucesso.%n"
				+ "Saldo da conta: R$%.2f.%n%n", nomeDoCliente, 
											   numeroDaConta, 
											   valor, 
											   contaDestino.getNumeroDaConta(), 
											   saldo);
		
	}
}