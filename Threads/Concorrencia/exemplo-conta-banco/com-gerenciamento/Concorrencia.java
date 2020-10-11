//thread-safe: alguns tipos de colletions em java são thread-safe, ou seja, nao precisamos tratar o seu acesso por multiplas threads. Algum codigo interno ja faz isso. (e.g, Vector)
//not-thread-safe: ja esses colletions precisam de tratamento ao seu acesso por multiplas threads. (e.g, LinkedList, ArrayList, ...)

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