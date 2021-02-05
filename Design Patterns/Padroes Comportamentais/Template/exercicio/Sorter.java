import java.util.Collection;

public abstract class Sorter {

	public void sort(Collection c) { //gnome sort algorithm
		Object[] collection = c.toArray();
		c.clear();
		
		int i = 0, compareResult;
		while(i < collection.length) {
			if(i == 0)
				i++;
			
			
			compareResult = compare(collection[i], collection[i-1]);

			if(compareResult >= 0) // if (collection[i] >= collection[i-1])	
				i++;
			
			else {
				swap(collection, i, (i-1));	
				i--;
			}
		}
		
		
		for(Object o : collection) 
			c.add(o);
		
	}
	
	abstract public int compare(Object o1, Object o2);
	
	private void swap(Object[] collection, int i, int j) {
		Object auxObject = collection[i];
		collection[i] = collection[j];
		collection[j] = auxObject;
	}
}