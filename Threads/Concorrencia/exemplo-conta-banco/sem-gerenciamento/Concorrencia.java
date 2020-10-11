//Concorrencia:
    //Iniciamos a execucao de varios programas em nosso computador. E, na maioria das vezes, esses programas possuem inumeras threads.
    //Nos temos, e claro, um numero limitado de nucleos no nosso processador tornando impossivel paralelisar todas essas tarefas (threads) de uma vez.
    //Apesar disso, temos uma tecnica que nos permite criar uma ilusao desse paralelismo: a concorrencia.
    //Com ela basicamente as threads ativas no nosso sistema concorrerão pelos recursos computacionais, principalmente os nucleos.
    //Assim, o escalonador (sub-sistema do SO) é responsavel por ceder um pouquinho do processador para cada uma das threads. Ele vai decidir quando uma thread perde ou recebe um nucleo de processamento (troca de contexto).
    //O processador ira executar uma thread por um curto periodo de tempo e entao vai deixar e executa-la e vai passar a executar outra.
    //Deste modo todas as threads vao progredir em sua execucao ao mesmo tempo dando a ilusao que estao sendo executadas ao mesmo tempo. 
    //(Com isso temos a ilusao que o nosso sistema de 4 nucleos, por exemplo, consegue executar 16 threads, por exemplo, ao mesmo tempo, quando na verdade ele vai trocando entre elas executando um pouquinho de cada uma de cada vez.) 
      
import java.util.ArrayList;    

public class Concorrencia {
    public static void main(String[] args){
        ArrayList<Conta> contas =
            new ArrayList<Conta>();
        
        Conta c1 = new Conta(1);
        Conta c2 = new Conta(2);
        Conta c3 = new Conta(3);

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        //Situação: três clientes vao depositar dinheiro em suas contas ao mesmo tempo. Nosso programa vai iniciar diferentes threads para cuidar dessas tarefas "ao mesmo tempo".
        //          Além disso, nesta mesma hora o banco deseja aplicar a taxa de rendimento nas contas. (Tambem abriremos outra thread para essa tarefa).
        
        
        Deposito dep1 = new Deposito(c1, 1000.00);
        Thread t1 = new Thread(dep1);
        t1.start();

        Deposito dep2 = new Deposito(c2, 500.00);
        Thread t2 = new Thread(dep2);
        t2.start();

        Rendimento rend = new Rendimento(contas, 0.10);
        Thread t3 = new Thread(rend);
        t3.start();

        Deposito dep4 = new Deposito(c3, 100.00);
        Thread t4 = new Thread(dep4);
        t4.start();

        //Resultado:
        for(Conta conta : contas){
            System.out.printf("Conta: %d - Saldo: %.2f%n", conta.getId(), conta.getSaldo());
        }

    }
}