import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        String[] colors = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};
        List<String> colorsList = new ArrayList<String>();
        for (String color : colors) {
            colorsList.add(color); //adicionando as strings do array colors no fim da lista colorsList. 
        }

        String[] removeColors = {"RED", "WHITE", "BLUE"};
        List<String> removeList = new ArrayList<String>();
        for (String color : removeColors) {
            removeList.add(color); //adicionando as strings a serem removidas no fim da lista removeColors.
        }

        System.out.println("colorsList: ");
        for (int i = 0; i < colorsList.size(); i++) {
            System.out.printf("%s ", colorsList.get(i));
        }

        // removendo da colorsList as strings que estao na lista removeColors:
        removeColors(colorsList, removeList);


        System.out.printf("%n%ncolorsList depois de chamar removeColors:%n");
        for (String color : colorsList) {
            System.out.printf("%s ", color);
        }
    } 

    // remove as strings especificadas na collection2 da collection1
    private static void removeColors(Collection<String> collection1, Collection<String> collection2) {

        //Collection e Set implementam a interface iterable, que define metodos para iterarmos sobre coleções/conjuntos de elementos.
        Iterator<String> iterator = collection1.iterator(); 

        while (iterator.hasNext()) {
            if (collection2.contains(iterator.next())) {   
                iterator.remove(); 
            }                                              
        } 
    } 
}