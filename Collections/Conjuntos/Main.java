//Interface Set: coleção onde não temos elementos repetidos.
//Exemplos de implementações: HashSet e TreeSet.

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class Main {
   public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "green", "gray", 
            "orange", "tan", "white", "cyan", "peach", "gray", "orange"};

        List<String> list = Arrays.asList(colors);

        //As cores white, gray e orange se repetem na lista:
        System.out.printf("List: %s%n", list);

        printNonDuplicates(list);
    }  

    private static void printNonDuplicates(Collection<String> values) {

        //Podemos criar uma Collection HashSet passando os valores de uma outra Collection (a lista de cores) para o seu construtor.
        //Como um Set não pode conter elementos duplicados as segundas instancias de white, gray e orange não vão ser inseridas no Set. 
        //O construtor vai percorrer a Collection passada, e, antes de inserir o elemento atual no Set ele checa se um elemento igual aquele
        //ja foi inserido no Set, se sim, ele nao insere o elemento atual.
        
        //Essa comparação que o construtor faz antes de inserir um elemento no Set ocorre com a ajuda de dois metodos:
        //  - equals: caso seja nos que criamos a classe do objeto da Collection, devemos sobrescrever o equals herdado do Objeto pai de todos
        //            para que quando criarmos um Set, por exemplo, as comparações sejam feitas da maneira que desejamos.
        //
        //  - hashCode: cria um numero inteiro unico para representar um objeto da classe, de modo que, dois objetos serao
        //              considerados iguais caso tenham o mesmo hashcode. Tabém devemos dar uma implementacao adequada a esse
        //              metodo caso sejamos nos os criadores da classe do objeto da Collection.
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        
        for (String value : set) { //"For each string value in set, do:"
            System.out.printf("%s ", value);
        }

        System.out.println();
    } 
}