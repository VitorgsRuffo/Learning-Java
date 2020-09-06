//Array: lista estatica de elementos do mesmo tipo (primitivo, ou de classe) dispostos sequencialmente na memoria. 
//Arrays são objetos, portanto, possuem atributos e metodos.

import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        //Declaraçao: tipo[] nomeDoArray = new tipo[tamanho]
            int[] array1 = new int[3];
            String[] array2 = new String[3];
            //Obs: um array sera inicializado com zeros (tipo primitivo numerico), false (tipo primitivo booleano) ou null (tipos de referencia - instancia de classe)
            //Obs: um array sempre sera uma instancia da classe pré-definida Array, logo, ao declararmos um array estamos instanciando essa classe e retornando a referencia para o objeto criado.

        //Declarando e inicializando:
            double[] array3 = {1.4, 2.3, 3.3, 4.5};
            int[] array4 = {1,2,3,4,5};
            
        //Atributo constante length: retorna o comprimento do array.
            array1.length //5
            array2.length //3
            array3.length //4

        //Acessando um array:
            array1[0] = 10;
            array2[1] = 15;
            array3[2] = array1[0] + array1[1];

        //Instrucao for especifica para arrays: a cada iteraçao é guardado um elemento do array na variavel elementoDoArray.
            /*
                for(tipo elementoDoArray : array){
                    //codigo
                }
            */

            for(double arrayElement : array3){
                System.out.println(arrayElement); // 1.4
            }                                     // 2.3
                                                  // 3.3
                                                  // 4.5

        //Passando arrays para metodos:

            //Passando o array inteiro: passando o endereço(referencia) do array para o metodo. (Se voce modificar o array la dentro, essas mudanças serao notadas aqui fora, pois, como ja dito, passamos uma referencia para esta array aqui de fora)
                int[] array4 = {1,2,3};
                modificarArray(array4);
                for(double arrayElement : array3){
                    System.out.println(array4); // 2  
                                                // 4
                                                // 6
                } 

            //Passando um elemento do array: passando uma copia do valor de um elemento do array para o metodo. (Mudanças nesse elemento nao se aplicaram aqui fora, pois, como ja dito, foi passado uma copia do valor real para a funcao).
                int[] array5 = {8,10,15};
                modificarElemento(array5[1]);
                System.out.println(array5[1]); // 10  

        
        //Lista de argumentos variaveis: é possivel criar metodos com um numero de parametros não fixo.

            double nota1 = 7.7;
            double nota2 = 8.1;
            double nota3 = 9.0;
            double nota4 = 5.0;
            
            System.out.printf("Media das notas 1 e 2: %.2f\n", calcularMedia(nota1, nota2));
            System.out.printf("Media das notas 1, 2 e 3: %.2f\n", calcularMedia(nota1, nota2, nota3));
            System.out.printf("Media das notas 1, 2, 3 e 4: %.2f\n", calcularMedia(nota1, nota2, nota3, nota4));


        //Classe Arrays: classe pré-definida com varios metodos estaticos que implementam rotinas uteis na manipulaçao de arrays

            //Ordenando um array em ordem crescente:
                int[] array6 = {3,4,6,1,4,2,6,10};
                imprimirArrayDeInteiros(array6, "Array6 antes de ser ordenado:");
                Arrays.sort(array6);
                imprimirArrayDeInteiros(array6, "Array6 depois de ser ordenado:");
            
            //Preencher um array com um valor:
                int[] array7 = new int[10];
                Arrays.fill(arra7, 2);
                imprimirArrayDeInteiros(array6, "Array7 apos ser preenchido completamento com o valor 2:");

            //Criar uma copia de um array:
                int[] array8 = {1,2,3,4,5};
                int[] array8Copia = new int[array8.lenght];
                System.arraycopy(array8, 0, array8Copia, 0, array8.lenght);
                imprimirArrayDeInteiros(array8, "Array8 original:");
                imprimirArrayDeInteiros(array8Copia, "Copia do array8:");

            //Comparando dois arrays:
                boolean isArraysEqual = Arrays.equals(array8, array8Copia);
                System.out.printf("Array8 %s Array8Copia\n", (isArraysEqual? "==" : "!="));

            //Procurar por um valor dentro de um array:
                int localizacao = Arrays.binarySearch(array8, 4);
                if(localizacao >= 0){
                    System.out.printf("O elemento 4 foi encontrado no indice %d no array array8\n", localizacao);
                }else{
                    System.out.printf("O elemento 4 nao foi encontrado no array array8\n");
                }
    }

    public static void modificarArray(int[] array){
        for(int i = 0; i<array.length; i++){
            array[i] *= 2;
        }
    }

    public static void modificarElemento(int elemento){
        elemento *= 2;
        System.out.println(elemento); // 20  

    }

    public static double calcularMedia(double... notas){ // Os '...' indicam que estamos passando um valor indeterminado de literais double que serao guardados em um array chamado 'notas'.
        double total = 0.0;                              //Obs: so podemos usar os '...' uma vez em uma lista de parametros, e, caso usemos eles dever estar no ultimo parametro da lista.
        for(double nota : notas){
            total += nota;
        }
        double media = total / notas.lenght;
        return media;
    }

    public static void imprimirArrayDeInteiros(int[] array, String descricao){
        System.out.printf("%s\n");
        for(int elemento : array){
            System.out.printf("%d ", elemento);
        }
        System.out.println("");
    }
}