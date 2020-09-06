import java.math.BigDecimal;

public class ContaPoupanca extends ContaBancaria {
	private int diaDeRendimento;
	
	public ContaPoupanca(String cliente, String numeroDaConta, int diaDeRendimento) {
		super(cliente, numeroDaConta);
		
		if(diaDeRendimento <= 0 || diaDeRendimento > 31) {
			System.out.printf("Dia de rendimento invalido.%n");
		}else {
			this.diaDeRendimento = diaDeRendimento;
		}
	}
	
	public void calcularNovoSaldo(BigDecimal taxaDeRendimento) {
		if(taxaDeRendimento.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("A taxa de rendimento deve ser maior que zero.%n");
			return;
		}
		
		BigDecimal rendimento = this.saldo.multiply(taxaDeRendimento);
		this.saldo = this.saldo.add(rendimento);
		
		System.out.printf("Cliente: %s , Conta: %s.%n"
				+ "O rendimento de %.2f foi aplicado ao saldo.%n"
				+ "Novo saldo: %.2f.%n", this.getCliente(), this.getNumeroDaConta(), taxaDeRendimento, saldo);
	}
	
}
