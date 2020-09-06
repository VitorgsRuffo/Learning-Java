//Para ler entradas do teclado usaremos uma Classe pré-definida chamada Scanner. (Devemos dar um "import" nela para poder usa-la)
import java.util.Scanner; 

public class Input {
   public static void main(String[] args){

      //Instanciamos um novo objeto Scanner passando a entrada padrão do sistema para o construtor. System.in: objeto pré-definido que representa a entrada padrão do sistema.
      Scanner input = new Scanner(System.in); 
      
      int number1; 
      int number2; 
      int sum; 

      System.out.print("Forneca um inteiro: "); 
      number1 = input.nextInt(); //Lendo um inteiro da entrada padrao.

      System.out.print("Forneca outro inteiro: ");
      number2 = input.nextInt();

      sum = number1 + number2; 

      System.out.printf("Sum is %d%n", sum); 
   } 
}

/**************************************************************************
 * (C) Copyright 1992-2014 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/