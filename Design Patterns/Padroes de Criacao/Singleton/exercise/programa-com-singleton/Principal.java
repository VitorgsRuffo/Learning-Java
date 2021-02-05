public class Principal {
	public static void main(String[] args) {

		Incremental inc = Incremental.getInstance();
		System.out.println(inc);

		for (int i = 0; i < 10; i++){

			inc.increment();
			System.out.println(inc);
		}

	}

}
