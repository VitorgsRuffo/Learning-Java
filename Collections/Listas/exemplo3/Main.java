import java.util.LinkedList;
import java.util.Arrays;

//Convertendo de array para lista e de lista para array.

public class Main {
    public static void main(String[] args) {
        String[] colors = {"black", "blue", "yellow"};

        //Array.asList: instancia uma lista cujos elementos são os elementos do array passado. Por fim retona o endereço dessa lista.
        LinkedList<String> links = new LinkedList<String>(Arrays.asList(colors));

        links.addLast("red"); // add as last item   
        links.add("pink"); // add to the end        
        links.add(3, "green"); // add at 3rd index  
        links.addFirst("cyan"); // add as first item

        //toArray: converte a lista na qual esse metodo foi chamado para um array cujas especificações (new Type[size]) são passadas por parametro.        
        colors = links.toArray(new String[links.size()]);

        System.out.println("colors: ");

        for (String color : colors) {
            System.out.println(color);
        }
    }  
} 