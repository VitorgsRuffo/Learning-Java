
public class MeioTransporte {
	private boolean ligado;
	protected int velocidade;
	
	public MeioTransporte() {
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
		this.velocidade = 0;
	}
	
	public boolean estaLigado() {
		return this.ligado;
	}
	
	public int getVelocidade() {
		return this.velocidade;
	}
	
	public void setVelocidade(int velocidade) {
		if(velocidade < 0) {
			System.out.println("A velocidade nao pode ser negativa");
			return;
		}
		
		if(!this.ligado) {
			System.out.println("O meio de transporte esta desligado...");
			return;
		}
		
		this.velocidade = velocidade;
	}
	
}
