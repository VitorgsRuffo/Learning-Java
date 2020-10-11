import java.math.BigDecimal;

//Uma conta rendimento é uma conta bancaria e portanto ela vai herdar os atributos e metodos que toda conta bancaria tem.

//Além disso, ja que ela é uma conta bancaria, ela DEVERA dar sua implementacao particular para o metodo sacar, 
//uma vez que a maneira que o metodo de saque ocorre varia entre os diferentes tipos de conta bancaria, e, toda conta bancaria DEVE possuir um metodo sacar. 

//Contas rendimento tambem possuem operacoes extras que as definem como:
//Um metodo para calcular o rendimento sobre o saldo atual, e,
//outro para calcular o tributo cobrado pelo banco tambem em cima do saldo.
//(Obs: a implementaçao do ultimo vai difere entre os diferentes tipos de conta rendimento.)

public abstract class ContaRendimento extends ContaBancaria {

    @Override
	public void sacar(BigDecimal valor) {
		if(this.getSaldo().subtract(valor).compareTo(BigDecimal.ZERO) == -1) {
			System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
					        + "Não foi possivel efetuar o saque de R$%.2f.%n"
                            + "Saldo da conta: R$%.2f.%n",  this.getNomeDoCliente(), 
                                                            this.getNumeroDaConta(), 
                                                            valor, 
                                                            this.getSaldo());
			return;
			
		}
		
        this.setSaldo(this.getSaldo().subtract(valor));

		System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
				        + "Saque de R$%.2f efetuado com sucesso.%n"
                        + "Novo saldo: %.2f.%n",  this.getNomeDoCliente(), 
                                                  this.getNumeroDaConta(), 
                                                  valor, 
                                                  this.getSaldo());
	
    }
    
    public void calcularNovoSaldo(BigDecimal taxaDeRendimento) {
		if(taxaDeRendimento.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("A taxa de rendimento deve ser maior que zero.%n");
			return;
		}
		
        BigDecimal rendimento = this.getSaldo().multiply(taxaDeRendimento);
        this.setSaldo(this.getSaldo().add(rendimento));
		
		System.out.printf("Cliente: %s , Conta: %s.%n"
				        + "O rendimento de %.2f foi aplicado ao saldo.%n"
				        + "Novo saldo: %.2f.%n",  this.getNomeDoCliente(), 
                                                  this.getNumeroDaConta(), 
                                                  taxaDeRendimento, 
                                                  this.getSaldo());
    }
    
    public abstract BigDecimal calcularTributo(BigDecimal taxaRendimento);
    
}