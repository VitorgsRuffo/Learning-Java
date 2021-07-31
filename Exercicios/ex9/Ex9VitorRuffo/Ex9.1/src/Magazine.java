import java.util.LinkedList;

public class Magazine implements Subject {
	
	private String name;
	private int currentEdition;
	LinkedList<Observer> observers;

	Magazine(String name) {
		this.name = name;
		this.currentEdition = 1;
		this.observers = new LinkedList<Observer>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getEdition() {
		return this.currentEdition;
	}
	
	public void publishNewEdition() {
		this.currentEdition++;
		this.notifyObservers();
	}
	
	public void attach(Observer observer) {
		this.observers.add(observer);
	}
	
	public void detach(Observer observer) {
		this.observers.remove(observer);
	}
	
	public void notifyObservers() {
		for(Observer observer : this.observers) {
			observer.receiveSubjectUpdate(this);
		}
	}
	
	public String toString() {
		return String.format("Name: %s - Edition: %d - Subscriber(s): %d.\n", this.name,
																			this.currentEdition,
																			this.observers.size());
	}
}	