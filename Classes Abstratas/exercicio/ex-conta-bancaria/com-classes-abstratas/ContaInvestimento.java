import java.math.BigDecimal;

//Uma conta investimento é uma conta rendimento e portanto ela vai herdar os atributos e metodos que toda conta rendimento tem.

//Além disso, ja que ela é uma conta rendimento, ela DEVERA dar sua implementacao particular para o metodo calcular tributo, 
//uma vez que a maneira com que o calculo de tributo ocorre varia entre os diferentes tipos de conta rendimento, e, toda conta rendimento DEVE possuir um metodo calcular tributo. 

//Contas investimento tambem possuem operacoes extras que as definem como:
//calcular a taxa de administracao da conta que o banco cobra.

public class ContaInvestimento extends ContaRendimento {
    
    ContaInvestimento(String nomeDoCliente, String numeroDaConta){
        this.setNomeDoCliente(nomeDoCliente);
        this.setNumeroDaConta(numeroDaConta);
    }

    @Override
	public BigDecimal calcularTributo(BigDecimal taxaDeRendimento) {
		if(taxaDeRendimento.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("A taxa de rendimento deve ser maior que zero.%n");
			return BigDecimal.ZERO;
		}
		
		BigDecimal rendimento = this.getSaldo().multiply(taxaDeRendimento);
		BigDecimal tributo = rendimento.multiply(BigDecimal.valueOf(0.005));
		
		return tributo;
	}

    public BigDecimal calcularTaxaAdministracao(BigDecimal taxaDeRendimento) {
		if(taxaDeRendimento.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("A taxa de rendimento deve ser maior que zero.%n");
			return BigDecimal.ZERO;
		}
		
		BigDecimal rendimento = this.getSaldo().multiply(taxaDeRendimento);
		BigDecimal taxaAdministracao = rendimento.multiply(BigDecimal.valueOf(0.01));
		
		return taxaAdministracao;
	}
    
}