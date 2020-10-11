import java.math.BigDecimal;

//Uma conta poupanca é uma conta rendimento e portanto ela vai herdar os atributos e metodos que toda conta rendimento tem.

//Além disso, ja que ela é uma conta rendimento, ela DEVERA dar sua implementacao particular para o metodo calcular tributo, 
//uma vez que a maneira com que o calculo de tributo ocorre varia entre os diferentes tipos de conta rendimento, e, toda conta rendimento DEVE possuir um metodo calcular tributo. 
//Obs: o banco nao calcula tributos sobre contas poupanca!

public class ContaPoupanca extends ContaRendimento {
    
    ContaPoupanca(String nomeDoCliente, String numeroDaConta){
        this.setNomeDoCliente(nomeDoCliente);
        this.setNumeroDaConta(numeroDaConta);
    }

    @Override
	public BigDecimal calcularTributo(BigDecimal taxaRendimento) {
		
		return BigDecimal.ZERO;
	}
}