
public abstract class SucoDecorator implements Suco {
	
	private Suco suco;
	
	SucoDecorator(Suco suco){
		this.suco = suco;
	}
	
	public Suco getSuco() {
		return this.suco;
	}
	
	public void setPreco(double preco) {
		this.suco.setPreco(preco);
	}
	
	public double getPreco() {
		return this.suco.getPreco();
	}
	
	abstract public void fazer(String ingredientes);
	
}