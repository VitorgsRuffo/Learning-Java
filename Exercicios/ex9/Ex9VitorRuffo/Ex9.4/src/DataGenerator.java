import java.util.Queue;

public class DataGenerator {

	public static FIFO generateData() {
		
		FIFO fifo = new FIFO(); 
		
		for(int i = 0; i < 10; i++) 
			fifo.add(new Item((int)(Math.random() * 10 + 1)));
		
		
		return fifo;
	}
	
}