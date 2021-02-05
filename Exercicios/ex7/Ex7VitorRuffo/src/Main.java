
public class Main {
	public static void main(String[] args) {

		System.out.println("===============Suco basico==================");
		Suco suco1 = new SucoBasico();
		suco1.fazer("limao");
		
		
		System.out.printf("\n==============Suco com leite===============\n");
		Suco suco2 = new SucoComLeite(new SucoBasico());
		suco2.fazer("uva");
		
		
		System.out.printf("\n=========Suco com leite condensado=========\n");
		Suco suco3 = new SucoComLeiteCondensado(new SucoBasico());
		suco3.fazer("morango");
		
		
		System.out.printf("\n======Suco com leite e leite condensado====\n");
		Suco suco4 = new SucoComLeite( 
							new SucoComLeiteCondensado(new SucoBasico()) );
		suco4.fazer("abacaxi");
		
	}
}