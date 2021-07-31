
public class Reader implements Observer {
	private String name;
	
	Reader(String name){
		this.name = name;
	}
	
	public void receiveSubjectUpdate(Subject subject) {
		Magazine magazine = (Magazine) subject;
	
		System.out.printf("Reader: %s - Notification: %s's edition %d is now available.\n\n", this.name, magazine.getName(), magazine.getEdition());
	}
}