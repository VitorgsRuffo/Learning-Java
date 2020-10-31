import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

	public static void main(String[] args) {

		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		for(int i = 0; i<10; i++) {
			numbers.add(i);
		}
		
		System.out.println("Lista numerica:");
		
		ListIterator<Integer> iterator = numbers.listIterator();
		
	    while (iterator.hasNext()) 
	         System.out.printf("%d ", iterator.next());
	    
	
	    
		LinkedList<Integer> numbersReversed = new LinkedList<Integer>();
	
	    iterator = numbers.listIterator(numbers.size());
	    
	    while (iterator.hasPrevious()) 
	         numbersReversed.add(iterator.previous());
	    
	    
	    System.out.printf("\n\nLista numerica na ordem inversa:\n");
	    iterator = numbersReversed.listIterator();
	    
	    while (iterator.hasNext()) 
	         System.out.printf("%d ", iterator.next());
	    
		
	}
}