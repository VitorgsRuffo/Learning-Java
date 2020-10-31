import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        //Criar e imprime uma lista de caracteres
        Character[] letters = {'P', 'C', 'M'};
        List<Character> list = Arrays.asList(letters); 
        System.out.println("list contains: ");
        output(list);

        //reverse: inverte a ordem dos elementos de list:
        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse, list contains:%n");
        output(list);

        //copy(destination, source): Copiando os elementos de uma lista (source) para outra (destination):
        Character[] lettersCopy = new Character[3]; 
        List<Character> copyList = Arrays.asList(lettersCopy); 

        Collections.copy(copyList, list); 
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);

        //fill: setta todos os elementos (objetos) da lista especificada como sendo o objeto passado
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    } 

    // output List information
    private static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for (Character element : listRef) {
            System.out.printf("%s ", element);
        }

        //Max e Min retornam o maior e menor objeto da colletion passada, respectivamente, de acordo com a ordem natural desses elementos.
        //Se formos nos que criarmos esses elementos, então, devemos passar um Comparator para mostrar para as funçoes Max/Min como a comparação
        //entre esses elementos deve ser feita.
        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf("  Min: %s%n", Collections.min(listRef));
    } 
} 