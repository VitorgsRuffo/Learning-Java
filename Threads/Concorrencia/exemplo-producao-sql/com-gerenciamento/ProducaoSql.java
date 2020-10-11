import java.util.Collection;

public class ProducaoSql implements Runnable {
	
	private int comeco;
	private int fim;
	private Collection<String> sqls;
	
	
	public ProducaoSql(int pComeco, int pFim, Collection<String> pSqls){
		this.comeco = pComeco;
		this.fim = pFim;
		this.sqls = pSqls;
	}
	
	@Override
	public void run() {

		for(int i = comeco; i < fim; i++){
			synchronized (sqls) { //usa-se entao o syncronized para permitir que apenas um thread por vez tenha acesso ao objeto sqls e, portanto, execute a linha que adiciona uma sentença sql a esse mesmo objeto. (altere o estado do objeto)
				sqls.add("SQL: "+i);
			}
		}

	}

}
