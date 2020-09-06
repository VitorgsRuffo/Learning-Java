import java.math.BigDecimal;

public class Professor extends Funcionario {
	public Professor() {
	}
	
	public Professor(String nome, String sobrenome, String matricula, BigDecimal salario) {
		super(nome, sobrenome, matricula, salario);
	}
	
	@Override
	public BigDecimal getSalarioPrimeiraParcela() {
		return this.getSalario();
	}
	
	@Override
	public BigDecimal getSalarioSegundaParcela() {
		return BigDecimal.ZERO;
	}
	
}
