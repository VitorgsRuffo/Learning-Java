import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner input = 
				new Scanner(System.in);
		
		String nomes = input.nextLine();
		
		String[] arrayNomes = nomes.split("\\s");
		
		List<String> listaNomes = Arrays.asList(arrayNomes);
		
		System.out.println("Lista de nomes (contem duplicados):");
		for(String nome : listaNomes) {
			System.out.printf("%s ", nome);
		}
		System.out.println();
		
		
		Set<String> set = new HashSet<>(listaNomes);
		
		System.out.println("Conjunto de nomes (nao contem duplicados):");
	    for (String nome : set) {
	    	System.out.printf("%s ", nome);
	    }
	    System.out.println();
	}

}