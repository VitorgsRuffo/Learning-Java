//Para ler entradas do teclado usaremos uma Classe pré-definida chamada Scanner. (Devemos dar um "import" nela para poder usa-la)
import java.util.Scanner; 

public class Input {
   public static void main(String[] args){

      int a;
      float b;
      String c;

      //Instanciamos um novo objeto Scanner passando a entrada padrão do sistema para o construtor. System.in: objeto pré-definido que representa a entrada padrão do sistema.
      Scanner input = new Scanner(System.in); 

      System.out.println("Inteiro:");
      a = input.nextInt(); //Lendo um inteiro da entrada padrao.

      System.out.println("Float:");
      b = input.nextFloat(); //Lendo um float.

      System.out.println("String:");
      c = input.next(); //Lendo uma String.

      System.out.println("Mostrando inputs:");

      System.out.println("\tInteiro: " + a);
      System.out.println("\tFloat: " + b);
      System.out.println("\tString: " + c);
   } 
}