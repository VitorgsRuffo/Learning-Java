import java.util.List;
import java.util.Arrays;
import java.util.Collections;

//sort: é um metodo estatico da classe Collections. Ele aceita uma instancia de uma implementaçao de List. Ele ordena os elementos dessa instancia em ordem crescente.

public class Sort1 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List<String> list = Arrays.asList(suits); 

        System.out.printf("Unsorted array elements: %s%n", list);
        Collections.sort(list);
        System.out.printf("Sorted array elements: %s%n", list);
    } 
} 
