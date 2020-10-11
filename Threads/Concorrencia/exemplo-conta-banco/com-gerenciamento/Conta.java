//syncronized(this): como ja vimos vamos ter um problema caso multiplas threads tentem alterar o estado de um objeto paralelamente.
//                   Portanto, devemos envolver os codigos dentro dos metodos do objeto, que efetivamente alteram o estado do objeto, com blocos syncronized.
//                   Deste modo, apenas uma thread por vez pode acessar o objeto e com isso um dos blocos syncronized. Assim, vamos evitar que mais de uma thread altere o estado do objeto ao mesmo tempo.

public class Conta {
    private int id;
    private double saldo;
 
    Conta(int id){
       this.id = id;
       this.saldo = 100.00;
    }
 
    public int getId(){
       return this.id;
    }
 
    public double getSaldo(){
       return this.saldo;
    }

    public void aplicarTaxaDeRendimento(double taxa){
        synchronized(this){ //usa-se entao o syncronized para permitir que apenas um thread por vez tenha acesso ao objeto (no caso, this) e, portanto, execute a linha que acesse/altere o estado do objeto.
        //exemplo1: se a thread1 tentar aplicar a taxa de rendimento (alterar o estado do objeto this) ela precisa esperar outras threads que estejam, ou executando dentro desse mesmo bloco syncronized, ou executando dentro do bloco syncronized do deposito (ou, qualquer outro bloco existente na classe.), pois, esses blocos acessam/alteram o estado do objeto this.
            double saldoAtualizado = this.saldo * (1 + taxa);
            this.saldo = saldoAtualizado;
        }
    }

    public void depositar(double valor){
        synchronized(this){ 
            double novoSaldo = this.saldo + valor;
            this.saldo = novoSaldo;
        }
    }

}

//Solução: devemos controlar o acesso a recursos compartilhados (estruturas de dados, variaveis,...) quando temos multiplas threads ativas que podem acessa-las em seu codigo.
