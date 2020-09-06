import java.util.ArrayList;
import java.util.Scanner;

public class FilaDeBanco {
	private ArrayList<String> fila = new ArrayList<String>();
	private Scanner input = new Scanner(System.in);

	public void iniciar() {
		int opcao;
		do {
			imprimirMenu();
			opcao = lerOpcao();
			switch(opcao) {
				case 1:
					entrarNaFila();
					break;
				case 2:
					desistirDaFila();
					break;
				case 3:
					atenderCliente();
					break;
				case 4:
					buscarPosicaoNaFila();
					break;
				case 5:
					imprimirFila();
					break;
				case 6:
					System.out.printf("%nSaindo..%n");
					break;
				default:
					System.out.printf("%nOpcao invalida.%n");
			}
		}while(opcao != 6);
	}
	
	private void imprimirMenu() {
		System.out.println("***********************");
		System.out.println("    CONTROLE DE FILA:  ");
		System.out.println("***********************");
		System.out.println("1 - Entrar na fila.");
		System.out.println("2 - Desistir da fila.");
		System.out.println("3 - Atender cliente.");
		System.out.println("4 - Buscar posicao na fila.");
		System.out.println("5 - Imprimir fila.");
		System.out.println("6 - Sair.");
	}
	
	private int lerOpcao() {
		return input.nextInt();
	}
	
	private void entrarNaFila() {
		System.out.printf("%nNome da pessoa:%n");
		String nome = input.next();
		fila.add(nome);
		System.out.printf("%n%s entrou no final da fila..%n", nome);
	}
	
	private void desistirDaFila() {
		System.out.printf("%nPosicao da pessoa:%n");
		int posicao = input.nextInt();
		fila.remove(posicao-1);
		System.out.printf("%nA pessoa na posicao %d desistiu da fila..%n", posicao);
	}
	
	private void atenderCliente() {
		fila.remove(0);
		System.out.printf("%nAtendendo o proximo cliente..%n");
	}
	
	private void buscarPosicaoNaFila() {
		System.out.printf("%nNome da pessoa:%n");
		String nome = input.next();
		System.out.printf("%n%s esta na posicao %d da fila..%n", nome, fila.indexOf(nome) + 1);
	}
	
	private void imprimirFila() {
		System.out.printf("%nFila do banco:");
		System.out.printf("%n***************%n");

		for(int i = 0; i<fila.size(); i++) {
			System.out.printf("%d - %s %n%n", i+1, fila.get(i));
		}
	}
}
