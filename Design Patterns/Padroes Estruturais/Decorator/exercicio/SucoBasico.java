
public class SucoBasico implements Suco {
	
	private double preco;
	
	SucoBasico(){
		this.preco = 5.00;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	@Override
	public void fazer(String ingredientes) {
		System.out.println("Fazendo o suco...");
		try {
			Thread.sleep(3500);
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.printf("O suco esta pronto!\nIngredientes: agua, %s.\nValor: R$%.2f\n", ingredientes, this.preco);
	}
	
}