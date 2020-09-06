import java.util.ArrayList;

public class Bomba {
	private int id;
	ArrayList<Combustivel> combustiveis = new ArrayList<Combustivel>();
	
	public Bomba(int id) {
		this.id = id;
	}
	
	public void imprimirListaDeCombustiveis() {
		System.out.println("----------Combustiveis---------");
		
		for(Combustivel combustivel : this.combustiveis) {
			System.out.printf("Nome: %s | Preco por litro: R$%.2f\n", combustivel.getNome(), combustivel.getPrecoPorLitro());
		}
		
		System.out.println("-------------------------------");
	}
	
	public void cadastrarCombustivel(String nome, double precoPorLitro) {
		Combustivel novoCombustivel = new Combustivel(nome, precoPorLitro);
		this.combustiveis.add(novoCombustivel);
	}
	
	public double abastecerXLitros(String nomeDoCombustivel, int quantidadeDeLitros) {
		double precoPorLitro = -1;
		for(Combustivel combustivel : combustiveis) {
			if(combustivel.getNome().equals(nomeDoCombustivel)) {
				precoPorLitro = combustivel.getPrecoPorLitro();
				break;
			}
		}
		if(precoPorLitro < 0) {
			System.out.println("Combustivel não encontrado..");
			return -1.0;
		}else {
			return precoPorLitro * quantidadeDeLitros;
		}
	}
	
	public int abastecerXReais(String nomeDoCombustivel, double quantidadeEmDinheiro) {
		double precoPorLitro = -1;
		for(Combustivel combustivel : combustiveis) {
			if(combustivel.getNome().equals(nomeDoCombustivel)) {
				precoPorLitro = combustivel.getPrecoPorLitro();
				break;
			}
		}
		if(precoPorLitro < 0) {
			System.out.println("Combustivel não encontrado..");
			return -1;
		}else {
			return (int)(quantidadeEmDinheiro / precoPorLitro);
		}
		
	}
	
}
