//Tratando ArithmeticExceptions e InputMismatchExceptions.

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    //Quando nao queremos tratar a ocorrencia de excecao dentro de um metodo podemos lançar essa excecao, caso ocorra, para o metodo chamador trata-la.
    
    //throws: dentro de quotient pode ocorrer uma ArithmeticException. 
    //Caso ocorra, a execucao sera interrompida na linha em que a excecao ocorreu, a excecao sera relançada para o chamador que tera o controle de volta para si e tera que lidar com essa excecao.
    //O chamador pode ter um try catch ou ter um throws para relançar essa excecao de novo para o seu proprio chamador. 
    //Se o chamador nao possuir nenhum dos dois teremos um erro de excecao nao tratada.
    public static int quotient(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator; 
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        boolean continueLoop = true;

        //Nesse trecho do programa é importante que o usuario entre com
        //valores inteiros para o numerador/denominador e que o denominador
        //nao seja zero. Isso deve ocorrer para que o programa funcione
        //corretamente. Caso uma dessas coisas nao aconteça exceções serão
        //lançadas, porém, nos estamos preparados para trata-las. Além disso, 
        //vamos fornecer para o usuario outra chance de digitar os valores 
        //corretos rodando esse mesmo trecho de codigo de novo (do...while).
        do {                                                                
            try { //o block "try" possui linhas de codigo sensiveis onde algumas delas possuem chance de gerar uma exceção.

                System.out.print("Please enter an integer numerator: ");    
                int numerator = scanner.nextInt();   //pode ocorrer exceção de input errado (InputMismatchException).                            
                System.out.print("Please enter an integer denominator: ");  
                int denominator = scanner.nextInt(); //pode ocorrer exceção de input errado (InputMismatchException).                           
                                                                            
                int result = quotient(numerator, denominator); //pode ocorrer exceção de divisao por zero dentro desse metodo (ArithmeticException). 

                System.out.printf("%nResult: %d / %d = %d%n", 
                                  numerator, denominator, result); 

                continueLoop = false; //Se o codigo chegou ate aqui entao significa que nao ocorreram exceções logo podemos sair do loop e continuar com o programa.
            }  

            //Quando uma exceção for lancada o block try sera interrompido na linha que ela ocorreu e os blocos catch entraram em ação.
            //Para tratar uma excecao X que possa ocorrer no block try é necessario ter um block catch que receba essa excecao X como parametro.
            //No nosso caso estamos preparado para lidar com uma InputMismatchException ou uma ArithmeticException. Caso ocorra uma exceção de outro tipo nao seremos capazes de trata-la.
           
            catch (InputMismatchException inputMismatchException) {        
                //Codigo de tratamento de uma InputMismatchException.
                System.err.printf("%nException: %s%n",                       
                inputMismatchException);                                  
                scanner.nextLine();
                System.out.printf("You must enter integers."
                    + "Please try again.%n%n");          
            }  

            catch (ArithmeticException arithmeticException) {
                //Codigo de tratamento de uma ArithmeticException.          
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf("Zero is an invalid denominator." 
                    + "Please try again.%n%n");   
            }  
            
            //Existe uma classe chamada Exception que é pai da todas as outras classes de excecoes.
            //Somos capazes de capturar qualquer sub-classe da classe que estamo capturando com um block catch.
            //Assim mesmo que a excecao nao seja de nenhum dos dois tipos acima ela ainda sera capturada por esse ultimo bloco pois ela sera filha de Exception. (Polimorfismo) 
            catch (Exception e){
                e.printStackTrace();
            }
            //Obs: vamos entrar no primeiro catch que trate a excecao, caso exista, e sairemos dessa estrutura de tratamento, mesmo que tenha outros blocos catch capazes de tratar essa excecao.

            //Modelo de terminação de tratamento de exceção: depois que uma exceção e tradada (ou nao) continuamos, caso o programa nao pare de rodar, com a execucao do programa em baixo (e nao na linha dentro do try onde ocorreu a excecao).
        } while (continueLoop);                                           
    } 
} 

//Obs: exceções sao objetos, de uma classe espefica de exceçoes, criados no momento que o erro ocorre e que encapsulam as informaçoes desse erro.


/* Obs:

• Exceções verificadas: devem ser capturadas ou
declaradas em uma cláusula throws. Caso uma linha possa gerar uma excecao verificada nos somos obrigados a fazer um tratamento, seja com try catch ou throws na assinatura do metodo.

• Exceções não-verificadas: exceções que não precisam
ser tratadas obrigatoriamente. Exemplo: IndexOutOfBoundsException; InputMismatchExection.

*/