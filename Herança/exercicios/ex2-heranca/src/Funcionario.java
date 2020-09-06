import java.math.BigDecimal;

public class Funcionario extends Pessoa {
	private String matricula;
	private BigDecimal salario;
	
	public Funcionario() {
		this.matricula = "";
		this.salario = BigDecimal.ZERO;
	}
	
	public Funcionario(String nome, String sobrenome, String matricula, BigDecimal salario) {
		super(nome, sobrenome);
		
		this.matricula = matricula;
		
		if(salario.compareTo(BigDecimal.ZERO) == -1) {
			System.out.println("O salario de um funcionario nao pode ser negativo.");
			this.salario = BigDecimal.ZERO;
		}else {
			this.salario = salario;
		}
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public BigDecimal getSalario() {
		return this.salario;
	}
	
	public void setSalario(BigDecimal salario) {
		if(salario.compareTo(BigDecimal.ZERO) == -1) {
			System.out.println("O salario de um funcionario nao pode ser negativo.");
			return;
		}
		
		this.salario = salario;
	}	
	
	
	public BigDecimal getSalarioPrimeiraParcela() {
		return BigDecimal.valueOf(0.6).multiply(this.salario);
	}
	
	public BigDecimal getSalarioSegundaParcela() {
		return BigDecimal.valueOf(0.4).multiply(this.salario);
	}
	
}
