import java.math.BigDecimal;
import java.util.ArrayList;

public class Banco {
	private String nome;
	private ArrayList<ContaCorrente> contas;
	
	Banco(String nome, String[] clientes){
		
		this.nome = nome;
		
		contas = new ArrayList<ContaCorrente>();
		
		for(int i = 0; i<10; i++) {
			contas.add(new ContaCorrente(i+100, clientes[i], BigDecimal.valueOf(10000)));
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public ArrayList<ContaCorrente> getContas(){
		return this.contas;
	}
	
	public BigDecimal calcularSaldoTotalNoBanco() {
		BigDecimal saldoTotal = BigDecimal.ZERO;
		
		for(int i = 0; i<10; i++) {
			saldoTotal = saldoTotal.add(contas.get(i).getSaldo());
		}
		
		return saldoTotal;
	}
	
	public void imprimirSaldoDosClientes() {
		System.out.println("Saldo dos clientes:");
		for(ContaCorrente conta : this.contas) {
			System.out.printf("Nome: %s - Conta: %d | Saldo: R$%.2f%n", conta.getNomeDoCliente(),
																		conta.getNumeroDaConta(),
																		conta.getSaldo());
		}
		System.out.println("");
	}
}