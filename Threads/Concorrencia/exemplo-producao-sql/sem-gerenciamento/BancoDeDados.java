//import java.util.ArrayList;
import java.util.Collection;
//import java.util.HashSet;
import java.util.LinkedList;
//import java.util.Vector;

public class BancoDeDados {

	public static void main(String[] args) throws InterruptedException {
		
		Collection<String> sqls = 
				new LinkedList<String>();
		
		//As tres threads criam e gravam as sentenças sql que elas produzem em uma mesma lista. (estrutura de dados compartilhada entre threads.) (LinkedLists nao sao thread-safe!)
		//Esse acesso ao recurso compartilhado sem um certo tipo de controle vai gerar inconsistencias nos resultados:
		//Ex: diferentes threads gravando valores na mesma posicao (perda de um valor).


		ProducaoSql p1 = new ProducaoSql(0, 10, sqls);
		Thread t1 = new Thread(p1);
		
		ProducaoSql p2 = new ProducaoSql(10, 20, sqls);
		Thread t2 = new Thread(p2);
		
		ProducaoSql p3 = new ProducaoSql(20, 30, sqls);
		Thread t3 = new Thread(p3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Threads produtoras de SQLs finalizadas!");
		System.out.printf("%d sentenças SQL foram produzidas.%n", sqls.size());


		for (int i = 0; i < 30; i++) {


			if (!sqls.contains("SQL: " + i)) {
				throw new IllegalStateException("Nao encontrei a SQL " + i);
			}
		}
		
		if (sqls.contains(null)) {
			throw new IllegalStateException("Nao devia ter null aqui dentro!");
		}
		
		for (int i = 0; i < sqls.size(); i++){
			System.out.println(((LinkedList<String>)sqls).get(i));
		}
		
		System.out.println("Fim da execucao com sucesso...");

	}
}
