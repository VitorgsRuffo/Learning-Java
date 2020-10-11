import java.math.BigDecimal;

//Uma conta corrente é uma conta bancaria e portanto ela vai herdar os atributos e metodos que toda conta bancaria tem.

//Além disso, ja que ela é uma conta bancaria, ela DEVERA dar sua implementacao particular para o metodo sacar, 
//uma vez que a maneira que o metodo de saque ocorre varia entre os diferentes tipos de conta bancaria, e, toda conta bancaria DEVE possuir um metodo sacar. 

public class ContaCorrente extends ContaBancaria {
    
    //Os atributos de ContaBancaria sao herdados porem eles sao privados. Assim,
    //somente metodos dentro da classe pai ContaBancaria conseguem acessa-lo.
    //Os getters e setters de ContaBancaria sao public, portanto, sao herdados e
    //nos possibilitam a manipulacao dos atributos herdados.
    BigDecimal limite;

    ContaCorrente(String nomeDoCliente, String numeroDaConta, BigDecimal limite){
        this.setNomeDoCliente(nomeDoCliente);
        this.setNumeroDaConta(numeroDaConta);
        this.limite = limite;
    }

    @Override
    public void sacar(BigDecimal valor){
        if(limite.add(this.getSaldo().subtract(valor)).compareTo(BigDecimal.ZERO) == -1) {
			
			System.out.printf("Cliente: %s , Conta: %s. (Corrente)%n"
                            + "Não foi possivel efetuar o saque de R$%.2f.%n"
                            + "Saldo da conta: R$%.2f.%n"
                            + "Limite: %.2f%n", this.getNomeDoCliente(), 
                                                this.getNumeroDaConta(), 
                                                valor, 
                                                this.getSaldo(), 
                                                limite);
			return;
			
		}
		
        this.setSaldo(this.getSaldo().subtract(valor));
        
		System.out.printf("Cliente: %s , Conta: %s. (Corrente)%n"
				        + "Saque de R$%.2f efetuado com sucesso.%n"
				        + "Novo saldo: %.2f.%n"
                        + "Limite: %.2f%n", this.getNomeDoCliente(),
                                            this.getNumeroDaConta(), 
                                            valor, 
                                            this.getSaldo(), 
                                            limite);
    }

}