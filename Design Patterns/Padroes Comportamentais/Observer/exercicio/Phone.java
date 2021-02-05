
public class Phone implements Observer {
	private String id;
	private boolean doorState;
	
	Phone(String id){
		this.id = id;
		this.doorState = false;
	}
	
	public void receiveSubjectUpdate(Subject subject) {
		
		System.out.printf("\nPhone: %s\nNew Notification: the door has been opened...\n", this.id);	
	}
	
}