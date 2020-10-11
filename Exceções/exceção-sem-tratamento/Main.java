// Divisao de inteiros sem tratamento de exceções

import java.util.Scanner;

public class Main {

    //Uma exceção sera lançada caso uma divisao por zero ocorra. (ArithmeticException)
    public static int quotient(int numerator, int denominator) {
      return numerator / denominator; //é possivel que essa linha gere uma exceção
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.print("Please enter an integer numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Please enter an integer denominator: ");
        int denominator = scanner.nextInt();

        int result = quotient(numerator, denominator);
        System.out.printf("%nResult: %d / %d = %d%n", 
            numerator, denominator, result);
    } 
}

/* Rastreamento de pilha: abaixo encontra-se informações que o java fornece caso ocorra uma exceção na linha 7 acima. Esse rastreamento de pilha indica exatamente onde os erros foram ocorrendo.

  Exception in thread "main" java.lang.ArithmeticException: / by zero
	  at Main.quotient(Main.java:9)    //linha onde o erro realmente ocorreu
    at Main.main(Main.java:20)       //linha que chamou o metodo que contem a linha em que ocorreu o erro.
    
*/