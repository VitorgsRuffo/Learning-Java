import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        String[] colors = {"red", "white", "yellow", "blue"};
        List<String> list1 = Arrays.asList(colors);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("black"); // add "black" to the end of list2
        list2.add("red"); // add "red" to the end of list2
        list2.add("green"); // add "green" to the end of list2

        System.out.print("Before addAll, list2 contains: ");
        // display elements in list2
        for (String s : list2) {
            System.out.printf("%s ", s);
        }

        //addAll: adiciona os elementos especificados (individualmente ou em um array) no final da lista especificada.
        Collections.addAll(list2, colors);

        System.out.printf("%nAfter addAll, list2 contains: ");
        for (String s : list2) {
            System.out.printf("%s ", s);
        }

        //frequency: retorna o numero de elementos (objetos) na coleção que são iguais ao objeto passado.
        //Obs: a comparação entre o objeto passado e os elementos e feito atraves do metodo equals do objeto.
        //Caso for nos que criamos a classe desse objeto e importante dar uma implementacao adequada para o metodo equals.
        int frequency = Collections.frequency(list2, "red");
        System.out.printf("%nFrequency of red in list2: %d%n", frequency);


        //disjoint: retorna true se as duas coleções nao tem nenhum elemento em comum.
        boolean disjoint = Collections.disjoint(list1, list2);  
        System.out.printf("list1 and list2 %s elements in common%n", 
            (disjoint ? "do not have" : "have"));
    } 
} 