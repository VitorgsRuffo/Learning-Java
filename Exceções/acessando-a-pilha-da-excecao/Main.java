
public class Main {
   public static void main(String[] args) {
      try { 
         method1();
      } 
      catch (Exception exception) {  //tratando a excecao vinda de method1.
         System.err.printf("%s%n%n", exception.getMessage()); //getMessage retorna a mensagem de erro associdada a excecao
         
         exception.printStackTrace(); //imprimindo a pilha com as informaçoes da excecao que ocorreu de maneira formatada.

         //obtendo as informaçoes da pilha da excecao
         StackTraceElement[] traceElements = exception.getStackTrace();
         
         //Imprimindo a pilha de maneira alternativa: (obtendo os detalhes do erro separadamente)
         System.out.printf("%nStack trace from getStackTrace:%n");
         System.out.println("Class\t\tFile\t\t\tLine\tMethod");

         for (StackTraceElement element : traceElements) {
            System.out.printf("%s\t", element.getClassName());
            System.out.printf("%s\t", element.getFileName());
            System.out.printf("%s\t", element.getLineNumber());
            System.out.printf("%s%n", element.getMethodName());
         } 
      }
   } 
 
    // chama o metodo method2; relança a excecao vinda do method2 de volta para o seu chamador, o main.
   public static void method1() throws Exception {
      method2();
   }
 
   // chama o metodo method3; relança a excecao vinda do method3 de volta para o seu chamador, o method1.
   public static void method2() throws Exception {
      method3();
   } 

   // lança excecao para o metodo method2 tratar
   public static void method3() throws Exception {
      throw new Exception("Exception thrown in method3");
      //Obs: quando criamos e lançamos uma excecao nova podemos relaciona-la a uma mensagem de erro, basta passar essa mensagem para o construtor dela.
   } 
} 