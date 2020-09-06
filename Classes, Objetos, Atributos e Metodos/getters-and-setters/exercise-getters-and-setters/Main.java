
public class Main {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();
		Rectangle rect2 = new Rectangle();
		
		
		rect2.setLength(21.0);
		rect2.setLength(0.0);
		rect2.setLength(10.0);
		
		rect2.setWidth(23.0);
		rect2.setWidth(-5.0);
		rect2.setWidth(5.0);
		
		System.out.printf("%nrect1 perimeter: %.2f%n", rect1.calculatePerimeter());
		System.out.printf("rect1 area: %.2f%n%n", rect1.calculateArea());

		System.out.printf("rect2 perimeter: %.2f%n", rect2.calculatePerimeter());
		System.out.printf("rect2 area: %.2f%n", rect2.calculateArea());
		
	}
}
