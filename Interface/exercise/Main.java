
public class Main {
	public static void main(String[] args) {
		
		//Na hora de declarar a variavel usa-se o tipo da interface para termos uma variavel mais generica.
		FormaGeometrica quadrado = new Quadrado(); //entao escolhemos uma das implementacoes da interface para essa variavel
		
		System.out.printf("Numero de lado do quadrado: %d.%n", quadrado.obterNumeroLados());
		
	}
}
