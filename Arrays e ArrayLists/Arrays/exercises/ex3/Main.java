
public class Main {

	public static void main(String[] args) {
		
		System.out.printf("Product result is %d.%n", intProduct(1,2,3,4,5));
		System.out.printf("Product result is %d.%n", intProduct(1,2,3,4));
		System.out.printf("Product result is %d.%n", intProduct(1,2,3));
		System.out.printf("Product result is %d.%n", intProduct(1,2));
		System.out.printf("Product result is %d.%n", intProduct(1));
	}
	
	static int intProduct(int... factors) {
		int result = 1;
		for(int factor : factors) {
			result *= factor;
		}
		return result;
	}

}
