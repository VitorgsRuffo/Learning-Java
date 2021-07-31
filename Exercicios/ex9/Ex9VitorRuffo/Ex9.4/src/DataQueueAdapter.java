
public class DataQueueAdapter extends DataQueue {
	
	private FIFO fifo;

	DataQueueAdapter(){	
		this.fifo = DataGenerator.generateData();
	}
	
	@Override
	public void putItem(Item i) {
		this.fifo.add(i);
	}
	
	@Override
	public Item getItem() {
		return (Item) this.fifo.remove();
	}
	
	@Override
	public boolean isEmpty() {
		if(this.fifo.size() <= 0)
			return true;
		else
			return false;
	}
}