
public class TarefaParalela implements Runnable {
	
	private int id;
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void run() {
        
        System.out.println("Thread " + this.id + " iniciou a execução.");

        Thread.sleep(5000); //suspendendo a execuçao da thread por 5000 milisegundos

		for (int i = 0; i < 1000; i++){
			System.out.println("programa: " + this.id + " valor: " + i);
        }
        
        System.out.println("Thread " + this.id + " finalizou a execução.");
	}

}