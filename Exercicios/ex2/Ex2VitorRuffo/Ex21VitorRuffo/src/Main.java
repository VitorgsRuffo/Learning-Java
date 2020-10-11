import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Bomba bomba1 = new Bomba(1);
		
		bomba1.cadastrarCombustivel("Gasolina", 4.50);
		bomba1.cadastrarCombustivel("Diesel", 3.50);
		bomba1.cadastrarCombustivel("Alcool", 3.90);
		
		bomba1.imprimirListaDeCombustiveis();
		
		BigDecimal precoDe7LitrosDeGasolina = bomba1.abastecerXLitros("Gasolina", 7);
		System.out.printf("Preco de 7 litros de gasolina: R$%.4f reais\n", precoDe7LitrosDeGasolina);
		
		BigDecimal quantidadeDeLitrosDeGasolinaPor3150Reais = bomba1.abastecerXReais("Gasolina", 31.50);
		System.out.printf("Quantidade de litros de gasolina por R$31,50 reais: %.4f litros\n", quantidadeDeLitrosDeGasolinaPor3150Reais);
	}
}
