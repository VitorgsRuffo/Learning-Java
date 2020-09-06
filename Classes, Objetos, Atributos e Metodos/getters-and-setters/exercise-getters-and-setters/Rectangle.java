
public class Rectangle {
	private double length = 1;
	private double width = 1;
	
	public double calculatePerimeter(){
		double perimeter = (2 * this.length) + (2 * this.width);
		return perimeter;
	}
	
	public double calculateArea() {
		double area = this.length * this.width;
		return area;
	}
	
	public double getLength() {
		return this.length;
	}
	
	public void setLength(double length) {
		if(length > 0.0 && length < 20.0) {
			this.length = length;
		}else {
			System.out.printf("Length must be in this range: (0.0, 20.0)%n");
		}
	}
	
	public double getWidth() {
		return this.width;
	}
	
	public void setWidth(double width) {
		if(width > 0.0 && width < 20.0) {
			this.width = width;
		}else {
			System.out.printf("Width must be in this range: (0.0, 20.0)%n");
		}
	}
}
