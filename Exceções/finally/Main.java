//bloco finally logo depois de um try...catch

public class Main {
    public static void main(String[] args) {
       try {
          throwException(); 
       } 
       catch (Exception exception) { // exception thrown by method throwException
          System.err.println("Exception handled in main");
       } 
 
       doesNotThrowException();
    }
 
    public static void throwException() throws Exception {
        try {
            System.out.println("Method throwException");
            throw new Exception(); // lançando uma nova excecao generica (instanciando um objeto excecao) com a ajuda da palavra "throw" e da palavra "new"
        } 

        catch (Exception exception) { // capturando a excecao lançada pelo block try acima
            System.err.println("Exception handled in method throwException");
            throw exception; //relançando a excecao: o catch ao inves de tratar a excecao resolveu lança-la para o metodo chamador (Isso so e possivel graças ao throws na assinatura do metodo throwException)
 
            //codigo que nao e executado
        } 

        //esse bloco sempre e executado, idependente do que ocorra no try catch
        finally { //geralmente é usado para liberar recursos em caso de erros que impessam a continuacao da execucao normalmente.
            System.err.println("Finally executed in throwException");  
        }                                                             
 
        //codigo que nao e executado
    } 
 
    //try...catch...finally quando nao ocorre excecao:
    public static void doesNotThrowException() {
       try { 
          System.out.println("Method doesNotThrowException");
       } 
       catch (Exception exception) { 
          System.err.println(exception);
       }
       finally {    
          System.err.println("Finally executed in doesNotThrowException");
       }                                                                  
  
       System.out.println("End of method doesNotThrowException");
    } 
 } 