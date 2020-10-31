import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

public class Main {
	public static void main(String[] args) {
		Scanner input = 
				new Scanner(System.in);
		
		System.out.println("Escreva uma frase:");
		
		String frase = input.nextLine()
							.replaceAll("\\p{Punct}","")
							.toLowerCase();
		
		String[] palavras = frase.split("\\s");		
		
		List<String> listaPalavras = 
				Arrays.asList(palavras);
		
		int totalDePalavras = listaPalavras.size();

		
		Set<String> conjuntoStrings = 
				new HashSet<String>(listaPalavras);
		
		int totalDePalavrasUnicas = 
				conjuntoStrings.size();
		
		int totalDePalavrasDuplicadas = 
				totalDePalavras - totalDePalavrasUnicas;
		
		System.out.printf("Total de palavras duplicadas na frase: %d.\n", 
						  totalDePalavrasDuplicadas);
	}
}