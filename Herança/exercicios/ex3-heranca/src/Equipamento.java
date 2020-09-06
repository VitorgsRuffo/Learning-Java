
public class Equipamento {
	protected boolean ligado;
	
	public Equipamento() {
		this.ligado = false;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public boolean estaLigado() {
		return this.ligado;
	}
}
