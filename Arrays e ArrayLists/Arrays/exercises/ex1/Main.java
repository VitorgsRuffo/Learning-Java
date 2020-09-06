import java.security.SecureRandom;

public class Main {
	public static void main(String[] args) {
		int[] quantidadeDeVendasPorFaixaDeValor = new int[6];
		
		SecureRandom geradorDeNumeroAleatorio = new SecureRandom();
		int venda;
		
		for(int i = 0; i<50; i++) {
			venda = geradorDeNumeroAleatorio.nextInt(700);
			if(venda<=99) {
				quantidadeDeVendasPorFaixaDeValor[0]++;
			}else if(venda>=100 && venda<=199) {
				quantidadeDeVendasPorFaixaDeValor[1]++;
			}else if(venda>=200 && venda <=299) {
				quantidadeDeVendasPorFaixaDeValor[2]++;
			}else if(venda>=300 && venda <=399) {
				quantidadeDeVendasPorFaixaDeValor[3]++;
			}else if(venda>=400 && venda <=499) {
				quantidadeDeVendasPorFaixaDeValor[4]++;
			}else if(venda>=500) {
				quantidadeDeVendasPorFaixaDeValor[5]++;
			}
		}
		
		for(int i = 0; i<6; i++) {
			System.out.printf("Quantidade de vendas na faixa %d: %d.%n", i+1, quantidadeDeVendasPorFaixaDeValor[i]);
		}
	}
}
