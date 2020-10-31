import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String[] colors = {"red", "white", "blue", "black", "yellow", 
            "purple", "tan", "pink"};
        List<String> list = new ArrayList<>(Arrays.asList(colors));

        Collections.sort(list); // sort the ArrayList
        System.out.printf("Sorted ArrayList: %s%n", list);

        // search list for various values
        printSearchResults(list, "black"); 
        printSearchResults(list, "red"); 
        printSearchResults(list, "pink"); 
        printSearchResults(list, "aqua"); // below lowest
        printSearchResults(list, "gray"); // does not exist
        printSearchResults(list, "teal"); // does not exist
    }      

    // perform search and display result
    private static void printSearchResults(
        List<String> list, String key) {

        //BinarySearch: busca na lista especificada pelo objeto especificado usando o algoritmo binary search.
        //  - Key: é o objeto que estamos procurando dentro da lista (ele deve ser do mesmo tipo da lista, e.g, lista List<String> e objeto String) 
        //  - Comparator: como o java sabe comparar Strings não é necessario passarmos um Comparator. Caso fosse uma lista de objetos Carro, por exemplo, devemos passar uma Comparator que define um metodo de comparacao de Carros.
        //  - Retorno: é retornado o indice do elemento, se encontrado, se não retorna um valor negativo.
        //
        //  Obs: a lista deve estar ordenada em ordem crescente (usando o mesmo Comparator que foi passado para o BinarySearch) antes de chamarmos esse metodo.
        System.out.printf("%nSearching for: %s%n", key);
        int result = Collections.binarySearch(list, key);
        
        if (result >= 0) {
            System.out.printf("Found at index %d%n", result);
        } 
        else {
            System.out.printf("Not Found (%d)%n",result);
        } 
    } 
}