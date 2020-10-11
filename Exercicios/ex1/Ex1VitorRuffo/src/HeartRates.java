import java.time.LocalDate;

public class HeartRates {
	private String name;
	private String lastName;
	private char gender;
	private int day, month, year;
	
	public HeartRates(String name, String lastName, char gender, int day, int month, int year) {
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setBirthDay(int day) {
		this.day = day;
	}
	
	public int getBirthDay() {
		return day;
	}
	
	public void setBirthMonth(int month) {
		this.month = month;
	}
	
	public int getBirthMonth() {
		return month;
	}
	
	public void setBirthYear(int year) {
		this.year = year;
	}
	
	public int getBirthYear() {
		return year;
	}
	
	public int calculateAge() {
		LocalDate date =  LocalDate.now();
		int currentYear = date.getYear();
		int currentMonth = date.getMonthValue();
		int currentDay = date.getDayOfMonth();
		
		if((currentMonth == this.month && currentDay >= this.day) || (currentMonth > this.month)) {
			return currentYear - this.year;
		}else {
			return (currentYear - 1) - this.year;
		}

	}
	
	public int calculateMaxHeartRate() {
		return 220 - calculateAge();
	}
	
	public double[] calculateTargetHeartRate() {
		int maxHeartRate = calculateMaxHeartRate();
		double[] range = new double[2];
		range[0] = 0.5 * maxHeartRate;
		range[1] = 0.85 * maxHeartRate;
		return range;
	}
}