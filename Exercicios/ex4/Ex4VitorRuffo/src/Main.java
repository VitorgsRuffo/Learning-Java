import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		//Clientes:
		String[] clientes = {"Vitor", 
				             "Pamela", 
				             "Angela", 
				             "Paula", 
				             "Bruno", 
				             "Luan", 
				             "Alan", 
				             "Matheus", 
				             "Wellinton", 
				             "Joao Pedro"};
		
		//Banco:
		Banco banco = new Banco("Bradesco", clientes);
		System.out.printf("--------Banco %s---------%n%n", banco.getNome());

		
		//Correntistas:
		Correntista correntista1 = new Correntista(banco.getContas());
		Thread thread2 = new Thread(correntista1);
		
		Correntista correntista2 = new Correntista(banco.getContas());
		Thread thread3 = new Thread(correntista2);
		
		Correntista correntista3 = new Correntista(banco.getContas());
		Thread thread4 = new Thread(correntista3);
		
		Correntista correntista4 = new Correntista(banco.getContas());
		Thread thread5 = new Thread(correntista4);
		
		Correntista correntista5 = new Correntista(banco.getContas());
		Thread thread6 = new Thread(correntista5);
		
		System.out.println("Antes das tranferencias: ");
		System.out.printf("%nValor total no banco:%nR$%.2f%n%n", banco.calcularSaldoTotalNoBanco());
		banco.imprimirSaldoDosClientes();
		
		//Efetuando as transferencias:
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		
		try {
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

		
		System.out.println("Apos as tranferencias: ");
		System.out.printf("%nValor total no banco:%nR$%.2f%n%n", banco.calcularSaldoTotalNoBanco());
		banco.imprimirSaldoDosClientes();		
	}
}