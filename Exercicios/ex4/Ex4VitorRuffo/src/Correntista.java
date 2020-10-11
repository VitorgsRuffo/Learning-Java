import java.math.BigDecimal;
import java.util.ArrayList;

public class Correntista implements Runnable {
	
	ArrayList<ContaCorrente> contas;
	
	Correntista(ArrayList<ContaCorrente> contas){
		this.contas = contas;
	}
	
	@Override
	public void run() {
		
		int indiceContaOrigem, indiceContaDestino;
		ContaCorrente contaOrigem, contaDestino;
		BigDecimal valorDaTransferencia;
		
		for(int i = 0; i<20; i++) {
			
			do {
				indiceContaOrigem = (int)((Math.random() * (9 - 0 + 1)) + 0); 
				indiceContaDestino = (int)((Math.random() * (9 - 0 + 1)) + 0);
			}while(indiceContaOrigem == indiceContaDestino);
			
			valorDaTransferencia = BigDecimal.valueOf((float)(Math.random() * (10000 - 0 + 1) + 0)); //Valor maximo de uma transferencia == 10000
			
			
			synchronized(this.contas){
				contaOrigem = contas.get(indiceContaOrigem);
				contaDestino = contas.get(indiceContaDestino);
				contaOrigem.efetuarTransferencia(contaDestino, valorDaTransferencia);
			}
		}
		
	}
}
