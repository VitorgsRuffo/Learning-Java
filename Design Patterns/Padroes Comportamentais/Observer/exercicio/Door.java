import java.util.LinkedList;

public class Door implements Subject {
	private String woodType;
	private boolean open;
	LinkedList<Observer> observers;
	
	
	Door(String woodType){
		this.woodType = woodType;
		this.open = false;
		this.observers = new LinkedList<Observer>();
	}
	
	public String getWoodType() {
		return this.woodType;
	}
	
	public void open() {
		if(this.open == false) {
			System.out.printf("\nThe door is being opened...\n");
			this.open = true;
			this.notifyObservers(); //O unico atributo que gera uma notificaçao para os Observadores (quando o seu estado muda) é o de abrir a porta
									//(Tambem poderiamos chamar o notifyObservers em outros situaçoes/eventos!)
		}else {
			System.out.printf("\nThe door is already open.\n");
		}
	}
	
	public void close() {
		System.out.printf("\nThe door is being closed...\n");
		this.open = false;
	}
	
	public boolean isDoorOpen() {
		return this.open;
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
}