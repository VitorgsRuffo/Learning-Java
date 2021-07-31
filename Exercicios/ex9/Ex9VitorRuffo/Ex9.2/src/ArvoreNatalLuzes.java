
public class ArvoreNatalLuzes extends ArvoreNatalDecorator {
	
	ArvoreNatalLuzes(ArvoreNatal arvoreNatal){
		super(arvoreNatal);
	}
	
	@Override
	public String getDescricao() {
		return String.format("%s, luzes", this.getArvoreNatal().getDescricao());
	}
	
}