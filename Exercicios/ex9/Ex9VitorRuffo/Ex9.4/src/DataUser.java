
public class DataUser {

	public void useData(DataQueueAdapter queue) {
		
		System.out.printf("Items:\n\n");
		
		while(!queue.isEmpty()) {
			System.out.println(queue.getItem());
		}
		

		queue.putItem(new Item(-1));
		
	}
	
}