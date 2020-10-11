
//Declaração de uma classe: 
    public class HelloWorld { 
        public static void main(String[] args){ // o método main é unico e é o ponto de partida de um programa java.
            System.out.println("Hello World!"); // System.out: Objeto pré-definido que representa a saida padrao do sistema. println() é seu metodo que imprime uma string nesta saida.
        }
    } 

    //Obs: o arquivo de uma classe deve ter o seu nome e a extensão .java


//Compilando e executando uma programa de um unico arquivo:

    javac path/to/file/HelloWorld.java   //obs: sera criado um arquivo HelloWorld.class
  
    java HelloWorld