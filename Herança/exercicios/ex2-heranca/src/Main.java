import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Mario", "Lopes");
		Funcionario pessoa2 = new Funcionario("Lucas", "Mendes", "123", BigDecimal.valueOf(2000.00));
		Professor pessoa3 = new Professor("Rafael", "Lira", "456", BigDecimal.valueOf(500.00));
		
		System.out.printf("Nome completo da pessoa 1: %s.%n", pessoa1.getNomeCompleto());
		System.out.printf("Nome completo da pessoa 2: %s.%n", pessoa2.getNomeCompleto());
		System.out.printf("Nome completo da pessoa 3: %s.%n", pessoa3.getNomeCompleto());
		
		System.out.printf("Primeira parcela do salario da pessoa 2: R$%.2f.%n", pessoa2.getSalarioPrimeiraParcela());
		System.out.printf("Segunda parcela do salario da pessoa 2: R$%.2f.%n", pessoa2.getSalarioSegundaParcela());

		System.out.printf("Primeira parcela do salario da pessoa 3: R$%.2f.%n", pessoa3.getSalarioPrimeiraParcela());
		System.out.printf("Segunda parcela do salario da pessoa 3: R$%.2f.%n", pessoa3.getSalarioSegundaParcela());
	}
}
