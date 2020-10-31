import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;


public class Main {
      public static void main(String[] args) {

         String[] colors = {"black", "yellow", "green", "blue", "violet", "silver"};
         
         List<String> list1 = new LinkedList<String>(); 

         for (String color : colors) {
            list1.add(color);
         }


         String[] colors2 = {"gold", "white", "brown", "blue", "gray", "silver"};
         
         List<String> list2 = new LinkedList<>();

         for (String color : colors2) {
            list2.add(color);
         }


         //Concatena as duas listas: list1 + list2
         list1.addAll(list2);

         //Fazemos list2 parar de apontar para a lista 2.
         list2 = null;
         
         //Convertendo os elementos da lista (strings) para maiusculo;
         printList(list1); 
         convertToUppercaseStrings(list1); 
         printList(list1); 

         //removendo uma sublista da list1.
         System.out.printf("%nDeleting elements 4 to 6...");
         removeItems(list1, 4, 7); // remove itens 4-6 da list1
         printList(list1); 

         //Imprime a lista de tras para a frente
         printReversedList(list1);
      }                                     

      private static void printList(List<String> list) {
         System.out.printf("%nlist:%n");
      
         for (String color : list) {
            System.out.printf("%s ", color);
         }

         System.out.println();
      }                                                    

      private static void convertToUppercaseStrings(List<String> list) {

         //Iterador especifico para listas. Ele permite fazermos coisas extras ja que estamos iterando especificamente sobre listas.
         ListIterator<String> iterator = list.listIterator();

         while (iterator.hasNext()) {
            String color = iterator.next(); //pegar o proximo item da lista (string).              
            iterator.set(color.toUpperCase()); //settando o item atual da iteração (o ultimo retornado pelo metodo next())
         } 
      } 

      private static void removeItems(List<String> list, int start, int end) {
         list.subList(start, end).clear(); 
      } 


      private static void printReversedList(List<String> list) {
         
         //O parametro do listIterator indica em qual posicao dentro da lista o nosso iterador deve começar.
         ListIterator<String> iterator = list.listIterator(list.size());

         System.out.printf("%nReversed List:%n");

         while (iterator.hasPrevious()) {
            System.out.printf("%s ", iterator.previous()); //podemos iterar de tras pra frente quando estivermos trabalhando especificamente com listas.
         }
      } 
}