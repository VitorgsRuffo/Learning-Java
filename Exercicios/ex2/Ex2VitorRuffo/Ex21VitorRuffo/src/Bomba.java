import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Bomba {
	private int id;
	ArrayList<Combustivel> combustiveis = new ArrayList<Combustivel>();
	
	public Bomba(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void imprimirListaDeCombustiveis() {
		System.out.println("----------Combustiveis---------");
		
		for(Combustivel combustivel : combustiveis) {
			System.out.printf("Nome: %s | Preco por litro: R$%.4f\n", combustivel.getNome(), combustivel.getPrecoPorLitro());
		}
		
		System.out.printf("------------Bomba "+ id +"------------%n%n");
	}
	
	public void cadastrarCombustivel(String nome, double precoPorLitro) {
		Combustivel novoCombustivel = new Combustivel(nome, precoPorLitro);
		this.combustiveis.add(novoCombustivel);
	}
	
	public BigDecimal abastecerXLitros(String nomeDoCombustivel, double quantidadeDeLitros) {
		Combustivel combustivel = buscarCombustivelPorNome(nomeDoCombustivel);
		if(combustivel == null) {
			System.out.println("Combustivel não encontrado..");
			return BigDecimal.valueOf(0.0);
		}
		
		BigDecimal precoPorLitro = combustivel.getPrecoPorLitro();
		return precoPorLitro.multiply(BigDecimal.valueOf(quantidadeDeLitros));
		
	}
	
	public BigDecimal abastecerXReais(String nomeDoCombustivel, double quantidadeEmDinheiro) {		
		Combustivel combustivel = buscarCombustivelPorNome(nomeDoCombustivel);
		if(combustivel == null) {
			System.out.println("Combustivel não encontrado..");
			return BigDecimal.valueOf(0.0);
		}
		
		BigDecimal precoPorLitro = combustivel.getPrecoPorLitro();
		return BigDecimal.valueOf(quantidadeEmDinheiro).divide(precoPorLitro, 4, RoundingMode.UP);
	}
	
	private Combustivel buscarCombustivelPorNome(String nomeDoCombustivel) {
		for(Combustivel combustivel : combustiveis) {
			if(combustivel.getNome().equals(nomeDoCombustivel)) {
				return combustivel;
			}
		}
		return null;
	}
	
}
