import java.util.LinkedList;

public class MagazineManager {
	
	private String publishingHouse;
	LinkedList<Magazine> magazinesAvailable;


	MagazineManager(String publishingHouse){
		this.publishingHouse = publishingHouse;
		this.magazinesAvailable = new LinkedList<Magazine>();
	}
	
	
	public void publishNewMagazine(String magazineName) {
		Magazine newMagazine = new Magazine(magazineName);
		magazinesAvailable.add(newMagazine);
	}
	
	
	public Magazine getMagazine(String magazineName) {
		for (Magazine magazine : this.magazinesAvailable) {
			if(magazine.getName().equals(magazineName)) {
				return magazine;
			}
		}
		
		return null;
	}
	
	
	public void subscribeToMagazine(String magazineName, Observer subscriber) {
		Magazine magazine = this.getMagazine(magazineName);
		if(magazine == null) {
			System.out.printf("The informed magazine \"%s\" is not available on %s publishing house.\n", magazineName, this.publishingHouse);
			return;
		}
		
		magazine.attach(subscriber);
	}
	 
	
	public void unsubscribeFromMagazine(String magazineName, Observer subscriber) {
		Magazine magazine = this.getMagazine(magazineName);
		if(magazine == null) {
			System.out.printf("The informed magazine \"%s\" is not available on %s publishing house.\n", magazineName, this.publishingHouse);
			return;
		}
		
		magazine.detach(subscriber);
	}
	
	public void publishMagazineNewEdition(String magazineName) {
		Magazine magazine = this.getMagazine(magazineName);
		if(magazine == null) {
			System.out.printf("The informed magazine \"%s\" is not available on %s publishing house.\n", magazineName, this.publishingHouse);
			return;
		}
		
		magazine.publishNewEdition();
	}
	
	
	public String toString() {
		return String.format("Publishing house: %s - Published magazine(s): %d\n\n", this.publishingHouse,
						   						    	  					     this.magazinesAvailable.size());
	}
	
	
	public void printMagazines() {
		System.out.printf("Magazine(s):\n\n");
		for(Magazine magazine : this.magazinesAvailable) {
			System.out.println(magazine);
		}
		System.out.println();
	}
	
}