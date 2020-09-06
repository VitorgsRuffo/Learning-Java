
public enum TrafficLight {
	
	GREEN("Green", 20),
	RED("Red", 20),
	YELLOW("Yellow", 10);
	
	private final String lightName;
	private final int lightTime;

	TrafficLight(String lightName, int lightTime){
		this.lightName = lightName;
		this.lightTime = lightTime;
	}
	
	public String getLightName() {
		return this.lightName;
	}
	
	public int getLightTime() {
		return this.lightTime;
	}
	
}
