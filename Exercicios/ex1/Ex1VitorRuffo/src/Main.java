import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.printf("Let's calculate your maximum heart rate and target heart rate.%n");
		
		System.out.println("Enter your name:");
		String name = input.nextLine();
		
		System.out.println("Enter your last name:");
		String lastName = input.nextLine();
		
		System.out.println("Enter your gender - male(M) | female(F):");
		char gender = input.next().toCharArray()[0];
		
		System.out.println("Enter your birthday:");
		int birthDay = input.nextInt();
		
		System.out.println("Enter your birthmonth:");
		int birthMonth = input.nextInt();
		
		System.out.println("Enter your birthyear:");
		int birthYear = input.nextInt();
		
		HeartRates person = new HeartRates(name, lastName, gender, birthDay, birthMonth, birthYear);
		
		System.out.println("Result:");
		System.out.printf("Name: %s.%nLast Name: %s.%nGender: %c.%nBirth: %d/%d/%d.%n", person.getName(), person.getLastName(), person.getGender(), person.getBirthDay(), person.getBirthMonth(), person.getBirthYear());
		double[] range = person.calculateTargetHeartRate();
		System.out.printf("Age: %d.%nMaximum heart rate: %d.%nTarget heart rate: %.2f-%.2f.", person.calculateAge(), person.calculateMaxHeartRate(), range[0], range[1]);
	}
}