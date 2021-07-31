
public abstract class ArvoreNatalDecorator implements ArvoreNatal {

	private ArvoreNatal arvoreNatal;
	
	ArvoreNatalDecorator(ArvoreNatal arvoreNatal){
		this.arvoreNatal = arvoreNatal;
	}
	
	public ArvoreNatal getArvoreNatal() {
		return this.arvoreNatal;
	}
	
	public abstract String getDescricao();
	
}