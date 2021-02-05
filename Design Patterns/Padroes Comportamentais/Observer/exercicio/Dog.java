
public class Dog implements Observer {
	private String name;
	private boolean doorState;
	
	Dog(String name){
		this.name = name;
		this.doorState = false;
	}
	
	public void receiveSubjectUpdate(Subject subject) {
		
		System.out.printf("\nDog: %s\nNew update: the door has been opened...\n", this.name);	
	}

}
