import java.util.Queue;
import java.util.LinkedList;

public class DataQueue {
	
	private Queue<Item> queue;
	 
	DataQueue(){
		this.queue = new LinkedList<Item>();
	}
 
	public void putItem(Item i) {
		this.queue.add(i);
	}
	 
	public Item getItem() {
		return this.queue.remove();
	}
	 
	public boolean isEmpty() {
		return this.queue.isEmpty();
	}
	
}