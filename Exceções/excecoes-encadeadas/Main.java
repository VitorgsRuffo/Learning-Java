
public class Main {
    public static void main(String[] args) {
        try {
           method1(); 
        } 
        catch (Exception exception) { // excecoes lançadas pelo metodo method1
           exception.printStackTrace();
        } 
    } 
  
    // chama o metodo method2; lança uma nova exececao, que é uma composicao entre a excecao anterior e essa nova, para o seu metodo chamador main.
    public static void method1() throws Exception {
        try {
            method2(); 
        } 
        catch (Exception exception) { 
            throw new Exception("Exception thrown in method1", exception);
        } 
    }

    // chama o metodo method3; lança uma nova exececao, que é uma composicao entre a excecao anterior e essa nova, para o seu metodo chamador method2.
    public static void method2() throws Exception {
        try {
            method3();
        } 
        catch (Exception exception) { 
            throw new Exception("Exception thrown in method2", exception);
        }
    } 

    // lança uma nova excecao para o seu metodo chamador method2
    public static void method3() throws Exception {
        throw new Exception("Exception thrown in method3");
    }   
}

//ao fazer isso (instanciar uma nova excecao passando uma outra excecao) vamos ir juntando as excecoes em uma so de modo que no final, la na main, nos tenhamos um stack-trace completo de todas as excecoes que ocorreram.
//se nao fizermos isso vamos perder esse historico em pilha das excecoes, mantendo o historico apenas da ultima excecao (lançada pelo metodo method1).