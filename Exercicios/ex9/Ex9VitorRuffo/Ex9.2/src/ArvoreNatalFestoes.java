
public class ArvoreNatalFestoes extends ArvoreNatalDecorator {
	
	ArvoreNatalFestoes(ArvoreNatal arvoreNatal){
		super(arvoreNatal);
	}
	
	@Override
	public String getDescricao() {
		return String.format("%s, festoes", this.getArvoreNatal().getDescricao());
	}
	
}
