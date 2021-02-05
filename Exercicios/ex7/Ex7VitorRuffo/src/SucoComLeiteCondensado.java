
public class SucoComLeiteCondensado extends SucoDecorator {
	
	SucoComLeiteCondensado(Suco suco){
		super(suco);
	}
	
	@Override
	public void fazer(String ingredientes) {
		Suco suco = this.getSuco();
		suco.setPreco(suco.getPreco() + 2.0);
		suco.fazer(ingredientes + ", leite condensado");
	}
}