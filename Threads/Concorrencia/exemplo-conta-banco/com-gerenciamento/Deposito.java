//Codigo para uma thread que executara uma tarefa de deposito em conta de banco.
public class Deposito implements Runnable {
    private Conta conta;
    private double valor;

    Deposito(Conta conta, double valor){
        this.conta = conta;
        this.valor = valor;
    }

    @Override
    public void run(){
        this.conta.depositar(this.valor);
    }
}
