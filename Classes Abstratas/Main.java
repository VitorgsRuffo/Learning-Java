//Classe Abstrata: funciona quase como uma interface, pois, podemos com ela ter metodos com implementaçao (que são iguais para todas as classes filhas) e sem implementaçao (que vao ser diferentes para cada classe filha).
//                 Assim, as suas classes filhas herdam os metodos implementados e sao obrigados a implementar os metodos abstratos.
//
//Obs: nao e possivel instanciar uma classe abstrata.

import java.math.BigDecimal;

//exemplo:
public abstract class ContaBancaria {
    
    //atributos:
    private BigDecimal saldo;

    //metodos concretos (todas as sub-classes os herdam se forem public)
    public BigDecimal getSaldo(){
        return this.saldo;
    }

    public void setSaldo(BigDecimal saldo){
        this.saldo = saldo;
    }

    public void depositar(BigDecimal valor){
        this.saldo = this.saldo.add(valor);
    }

    //metodos abstratos (todas as sub-classes devem implementar)
    public abstract void sacar(BigDecimal valor);

} 

public class ContaPoupanca extends ContaBancaria {
    
    //Atributos
    //...

    //A implementacao de sacar e obrigatoria para qualquer sub-classe de ContaBancaria
    @Override
    public void sacar(BigDecimal valor) {
		if(this.getSaldo().subtract(valor).compareTo(BigDecimal.ZERO) == -1) {
			System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
					+ "Não foi possivel efetuar o saque de R$%.2f.%n"
					+ "Saldo da conta: R$%.2f.%n", cliente, numeroDaConta, valor, this.getSaldo());
			return;
			
		}
		
		this.setSaldo(this.getSaldo().subtract(valor));
		System.out.printf("Cliente: %s , Conta: %s. (Poupanca)%n"
				+ "Saque de R$%.2f efetuado com sucesso.%n"
				+ "Novo saldo: %.2f.%n", cliente, numeroDaConta, valor, this.getSaldo());
	
    }
    
    //Outros metodos
}


public class Main {
    public static void main(String[] args){
         
        //Utilizando a sub-classe:
        //Podemos declarar o objeto como sendo do tipo da classe abstrata e com a implementaçao da sub-classe ContaPoupanca.
        //Deste modo indicamos ao java quais são as implementaçoes dos metodos abstratos da classe ContaBancaria vamos utilizar.
        ContaBancaria conta1 = new ContaPoupanca();

        conta1.depositar(BigDecimal.valueOf(1000));
        conta1.sacar(BigDecimal.valueOf(500);
    }
}