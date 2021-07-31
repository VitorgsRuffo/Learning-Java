import java.util.Queue;
import java.util.LinkedList;

public class FIFO {
	
	private Queue<Object> queue;
	 
	FIFO(){
		this.queue = new LinkedList<Object>();
	}
	 
	public void add(Object o) {
		this.queue.add(o);
	}
	 
	public Object remove() {
		return this.queue.remove();
	}
	 
	public int size() {
		return this.queue.size();
	}
	
}