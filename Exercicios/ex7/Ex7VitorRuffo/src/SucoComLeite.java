
public class SucoComLeite extends SucoDecorator {

	SucoComLeite(Suco suco){
		super(suco);
	}
	
	@Override
	public void fazer(String ingredientes) {
		Suco suco = this.getSuco();
		suco.setPreco(suco.getPreco() + 1.0);
		suco.fazer(ingredientes + ", leite");
	}
}