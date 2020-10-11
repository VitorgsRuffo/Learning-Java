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
      /*1*/ double saldoAtualizado = this.saldo * (1 + taxa);
      /*2*/ this.saldo = saldoAtualizado;
   }

   public void depositar(double valor){
      /*3*/ double novoSaldo = this.saldo + valor;
      /*4*/ this.saldo = novoSaldo;
   }
}

//Problemas que a concorrencia pode gerar:
    //Situação: Imagine um sistema de banco: temos um ArrayList onde cada posicao representa uma conta bancaria de um cliente.
    //          Uma thread sera responsavel pelas operacoes que um cliente queira efetuar na sua conta (e.g, deposito, saque, ...)
    //          Uma outra thread de acesso exclusivo do banco sera responvel por percorrer o ArrayList e aplicar a taxa de rendimento 
    //          sobre o saldo da conta, todo mes em um dia especifico.
          

    //(suponha que a conta tenha um saldo de 100,00)
    //Imagine o seguinte: a thread de aplicar a taxa começa e executa a linha (1).
    //                    Ela é suspendida e a thread do cliente começa e executa as linhas (3) e (4) (suponha que o valor seja 900).
    //                    Como a thread da taxa ainda nao alterou o saldo ele ainda é 100, assim,
    //                    depois da execucao de (3) e (4) o saldo passa a ser 1000.
    //                    Então, a thread do cliente termina sua execuçao e, portanto, é suspendida e voltamos a executar a thread da taxa.
    //                    A thread da taxa volta de onde ela tinha parado e executa a linha 4.
    //                    Agora vem a questao: quando threads sao suspendidas o seu contexto e salvo 
    //                    para que elas, posteriormente, possam voltar de onde pararam. 
    //                    quando a thread da taxa voltou o valor do saldoAtualizado era de 105, pois, essa atualizacao tinha sido calculada antes do deposito ocorrer(alterar o saldo).
    //                    , assim, quando executarmos a linha (2) vamos sobrescrever o valor de 1000 do saldo com o valor 105.
    //                    Isso é um problema grava pois o nosso sistema nao vai ter guardado o deposito do cliente.
    //