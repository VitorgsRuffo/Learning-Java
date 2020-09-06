
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Light time for a traffic light:");
		
		for(TrafficLight light : TrafficLight.values()) { //Enum.values(): retorna um array com todas as contantes do enum
			System.out.printf("%s time: %d%n", light.getLightName(), light.getLightTime());
		}
		
		System.out.printf("%s light time: %d.%n", TrafficLight.RED.getLightName(), TrafficLight.RED.getLightTime());

	}

}
