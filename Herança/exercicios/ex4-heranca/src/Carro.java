
public class Carro extends MeioTransporte {
	private int quilometragem;
	
	public int getQuilometragem() {
		return this.quilometragem;
	}
	
	public void setQuilometragem(int quilometragem) {
		if(quilometragem < 0 || quilometragem > 999999) {
			System.out.println("A quilometragem deve estar no intervalo (0, 999999).");
			return;
		}
		
		this.quilometragem = quilometragem;
	}
	
	@Override
	public void setVelocidade(int velocidade) {
		if(velocidade < 0 || velocidade > 200) {
			System.out.println("A velocidade do carro deve estar no intervalo [0, 200].");
			return;
		}
		
		if(!this.estaLigado()) {
			System.out.println("O carro esta desligado...");
			return;
		}
		
		this.velocidade = velocidade;
	}
}
