/*
A linguagem java oferece uma classe e uma interface pré-definidas para dar suporte a concorrência: a java.lang.Thread e a java.lang.Runnable, respectivamente. Esses recursos nos permitem definir threads para os nossos programas, gerenciar o estado de execução dessas threads e controlar a colaboração entre elas.
A interface runnable oferece um método abstrato chamado run que representa o código a ser executado por um thread. Uma classe que implementa a Runnable deve fornecer o código para o método run. Esse metodo será executado quando uma thread, que seja criada a partir dessa classe, comece a rodar.
A classe Thread vai definir o tipo thread e nos fornecer métodos para sua manipulação como: executar ou interromper uma thread, agrupar threads, definir a prioridade de um thread, sincronização com outros threads. Basicamente, a diferença entre a classe Thread e a Interface Runnable é que Thread representa como um thread ira se comportar e Runnable define exatamente o que o thread executa, a sua atividade.	
*/

/*Situaçao que e conveniente o uso de threads: 
Imagine que o nosso programa gere um pdf. Alem disso ele deve mostrar uma barra de progresso 
de como esta o andamento da sintese desse pdf. Porém, se tivermos apenas uma thread principal no 
nosso programa primeiro teriamos que finalizar o metodo gerarPdf() para depois chegar na linha que chama
o metodo mostrarBarraDeProgresso(), pois so um comando é executado por vez. Obviamente, a nossa barra
de progresso perderia o sentido pois ela deveria atualizar conforme o processo de gerar o pdf progredia. Assim,
a solucao seria criar uma thread para cada uma dessas tarefas, para que elas possam progredir em sua execucao
ao mesmo tempo.
*/

//classe que define o codigo da tarefa de gerar o pdf:
public class GeradorDePDF implements Runnable {

    @Override
    public void run(){
        //codigo para gerar o PDF.
    }
}

//classe que define o codigo da tarefa de mostrar o progresso da sintese do PDF:
public class BarraDeProgresso implements Runnable {

    @Override
    public void run(){
        //codigo para mostrar a barra de progresso.
    }
}
//Obs: classes que implementam o Runnable vão ser obrigadas a implementar o metodo run() que define a tarefa de uma futura thread.

public class Main {
    public static void main(String[] args){
        //Obs: sempre teremos ao menos uma thread: a thread principal onde o metodo main roda.

        //Primeiro, criamos um objeto que possui a tarefa que queremos executar em outra thread.
        GeradorDePDF geradorPDF = new GeradorDePDF();

        //Segundo, instanciamos uma nova thread passando para o construtor um objeto com o tarefa a ser executada por essa thread.
        Thread threadGeradorPDF = new Thread(geradorPDF);
        
        //Por fim, chamamos o metodo start da thread que inicializa a execucao dessa thread chamar o metodo run do objeto passado para ela, e outras coisas...
        threadGeradorPDF.start();
    


        BarraDeProgresso barraDeProgresso = new BarraDeProgresso();
        Thread threadBarraDeProgresso = new Thread(barraDeProgresso);
        threadBarraDeProgresso.start();

    }
}


//Metodo Sleep: 
//faz a thread suspender sua execuçao por um certo tempo em milisegundos.

Thread.sleep(1000); //1000 milisegundos == 1 segundo