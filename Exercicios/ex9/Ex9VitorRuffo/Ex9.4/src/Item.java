
public class Item {
	
	private int id;
	
	Item(int id){
		this.id = id;
	}
	
	public String toString() {
		return String.format("id: %d\n", this.id);
	}
}