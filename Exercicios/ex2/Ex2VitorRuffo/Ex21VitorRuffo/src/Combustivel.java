import java.math.BigDecimal;

public class Combustivel {
	private String nome;
	private BigDecimal precoPorLitro;
	
	public Combustivel(String nome, double precoPorLitro) {
		if(precoPorLitro <= 0) {
			System.out.println("O preco deve ser maior que zero.");
		}else {
			this.nome = nome;
			this.precoPorLitro = BigDecimal.valueOf(precoPorLitro);
		}
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getPrecoPorLitro() {
		return precoPorLitro;
	}
	
	public void setPrecoPorLitro(double precoPorLitro) {
		if(precoPorLitro <= 0) {
			System.out.println("O preco deve ser maior que zero.");
		}else {
			this.precoPorLitro = BigDecimal.valueOf(precoPorLitro);
		}
	}
}
