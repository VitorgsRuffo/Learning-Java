
public class EquipamentoSonoro extends Equipamento {
	private short volume;
	private boolean stereo;
	
	public EquipamentoSonoro(){ //O java chama o construtor padrao da classe pai (Equipamento) automaticamente.
		this.volume = 0;
	}
	
	public EquipamentoSonoro(boolean stereo){
		this.volume = 0;
		this.stereo = stereo;
	}
	
	public short getVolume() {
		return this.volume;
	}
	
	public void setVolume(short volume) {
		if(volume < 0 || volume > 10) {
			System.out.println("O volume so pode ser ajustado de 0 a 10.");
			return;
		}
		this.volume = volume;
	}

	public void mono() {
		this.stereo = false;
	}
	
	public void stereo(){
		this.stereo = true;
	}
	
	@Override
	public void ligar() {
		this.ligado = true;
		this.volume = 5;
	}
	
}
