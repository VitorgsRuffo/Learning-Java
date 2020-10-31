import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort2 {
    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        List<String> list = Arrays.asList(suits); 

        
        System.out.printf("Unsorted array elements: %s%n", list);
        //Neste caso o sort vai ordenar em ordem decrescente, pois, estamos
        //passando um Comparator para ele que muda a maneira na qual o sort 
        //compara elementos para poder ordena-los.
        Collections.sort(list, Collections.reverseOrder());
        System.out.printf("Sorted list elements: %s%n", list);
    } 
} 