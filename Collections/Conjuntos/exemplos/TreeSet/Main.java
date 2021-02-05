//A diferença entre as interfaces Set e SortedSet é: implementações de SortedSet sao iguais as do Set so que com um ponto extra, elas são conjuntos ordenados.
//Sempre que inserimos um elemento novo na estrutura ele é posicionado na ordem correta (de acordo com a ordenaçao natural dos elementos ou com a ordenaçao atraves de um Comparator criado para os elementos).

//TreeSet é uma implementação da interface SortedSet:

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        String[] colors = {"yellow", "green", "black", "tan", "grey",
            "white", "orange", "red", "green"};
        
        //SortedSet é uma extensão de Set, logo, ele vai funcionar da mesma maneira so que com alguns pontos a mais.
        //Ao criar um novo TreeSet (implementação de SortedSet) passando uma Collection por parametro para o construtor
        //nao vamos adicionar elementos repetidos e ja vamos posicionar os elementos ordenadamente.
        //Para isso acontecer vão ocorrer comparações, é claro. Como o java ja tem definido um Comparator para Strings 
        //nao nos preocupamos com isso, neste caso. Caso essa estrutura fosse um SortedSet de objetos cuja classe foi 
        //criada pelo programador deveriamos passar um Comparator para o contructor poder criar o SortedSet corretamente.
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colors));

        System.out.print("sorted set: ");
        printSet(tree); 

        System.out.print("headSet (\"orange\"):  ");
        //Retorna um SortedSet com todos os elementos que estao antes do elemento passado como argumento (exclusive).
        printSet(tree.headSet("orange"));

        System.out.print("tailSet (\"orange\"):  ");
        //Retorna um SortedSet com todos os elementos que estao apos do elemento passado como argumento. (inclusive)
        printSet(tree.tailSet("orange"));

        // get first and last elements
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last : %s%n", tree.last());
    } 

    // output SortedSet using enhanced for statement
    private static void printSet(SortedSet<String> set) {
        for (String s : set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    } 
} 