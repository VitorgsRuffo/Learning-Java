
public class Main {
	public static void main(String[] args) {
		int soma = 0;
		
		System.out.printf("Inteiros passados como parametro:%n%n");
		for(String elemento: args) {
			System.out.printf("%s%n", elemento);
			soma += Integer.parseInt(elemento); //convertendo string para inteiro com um metodo estatico da classe Integer.
		}
		
		System.out.printf("%nSoma == %d.%n", soma);
	}
}
