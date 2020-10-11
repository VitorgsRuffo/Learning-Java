import java.math.BigDecimal;

//Toda conta bancaria possuira os atributos nome do cliente, numero e saldo.
//Alem disso, nao podemos esquecer os metodos fundamentais de uma conta bancaria: saque e deposito.
public abstract class ContaBancaria {
    private String nomeDoCliente;
	private String numeroDaConta;
    private BigDecimal saldo = BigDecimal.ZERO;
    
    public String getNomeDoCliente() {
		return this.nomeDoCliente;
    }
    
    public void setNomeDoCliente(String nome){
        this.nomeDoCliente = nome;
    }
	
	public String getNumeroDaConta() {
		return this.numeroDaConta;
    }
    
    public void setNumeroDaConta(String numero){
        this.numeroDaConta = numero;
    }
	
	public BigDecimal getSaldo() {
		return this.saldo;
    }
    
    public void setSaldo(BigDecimal novoSaldo){
        this.saldo = novoSaldo;
    }


    public void depositar(BigDecimal valor) {
		if(valor.compareTo(BigDecimal.ZERO) <= 0) {
			System.out.printf("Não foi possivel efetuar o deposito.%nValor do deposito deve ser maior que zero.%n");
			return;
		}
		
		this.saldo = this.saldo.add(valor);
		System.out.printf("Cliente: %s , Conta: %s. (Corrente)%n"
				        + "Deposito de R$%.2f efetuado com sucesso.%n"
                        + "Novo saldo: %.2f.%n%n",  nomeDoCliente, 
                                                    numeroDaConta, 
                                                    valor, 
                                                    saldo);
    }
    
    public abstract void sacar(BigDecimal valor);

}