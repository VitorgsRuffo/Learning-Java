import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("HB20", "Hyundai");
		Carro c2 = new Carro("HB20", "Hyundai");
		Carro c3 = new Carro("Onix", "GM");
		Carro c4 = new Carro("Palio", "Fiat");
		Carro c5 = new Carro("Onix", "GM");
		Carro c6 = new Carro("Gol", "VW");
		
		Carro[] carros = {c1, c2, c3, c4, c5, c6};
		
		List<Carro> carrosList = 
				Arrays.asList(carros);
		
		System.out.println("Elementos da lista (Contem duplicados):");
		for (Carro c : carrosList) {
			
			System.out.printf("%s: %d%n", c, c.hashCode());
		}
		
		System.out.println("========================");
		
		printNonDuplicates(carrosList);

	}
	
	
	public static void printNonDuplicates(Collection<Carro> values) {
		
		//Antes de inserir no Set os elementos da Collection passada, o construtor
		//percorre o Set comparando seus elementos com o elemento atual da Collection.
		//Caso aquele elemento ja esteja no Set ele nao é adicionado. (usa-se o equal/hashCode do elemento da Collection na comparacao)
		Set<Carro> set = new HashSet<>(values);
		
		System.out.println("Elementos do HashSet (Nao duplicados):");
		for (Carro c : set) {
			System.out.printf("%s: %d%n", c, c.hashCode());
		}
	}

}
