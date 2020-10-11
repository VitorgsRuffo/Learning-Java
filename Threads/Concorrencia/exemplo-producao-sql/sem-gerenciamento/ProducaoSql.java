import java.util.Collection;

//Codigo para uma thread que tera a tarefa de construir sentenças SQL e grava-las em uma lista.
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
		for (int i = comeco; i < fim; i++){

			sqls.add("SQL: " + i);
		}
	}

}
