import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class FilaDeBanco {
	private ArrayList<Cliente> filaComum = new ArrayList<Cliente>();
	private ArrayList<Cliente> filaPreferencial = new ArrayList<Cliente>();
	private boolean aProximaFilaASerAtendidaEAPreferencial = true;
	
	private Scanner input = new Scanner(System.in); //atributos devem definir o objeto, por exemplo, este atributo scanner aqui nao define um objeto desta classe esta apenas sendo usado como variavel global para ser util nos metodos desta classe. Este nao e uma boa pratica
													//nao usar scanner em classes que nao sao a main.

	public void iniciar() {
		int opcao;
		do {
			imprimirMenu();			// A main que geralmente deve lidar com as interfaces e inputs do usuario e nao a classe.
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
	
	private void entrarNaFila(){
		System.out.printf("%nNome da pessoa:%n");
		String nome = input.next();
		
		LocalTime horaDeChegada = LocalTime.now();
		
		System.out.printf("%nIdade:%n");
		int idade = input.nextInt();
		
		System.out.printf("%nServico:%n");
		String servico = input.next();
		
		Cliente novoCliente = new Cliente(nome, horaDeChegada, idade, servico);
		if(novoCliente.ePreferencial()) {
			filaPreferencial.add(novoCliente);
		}else {
			filaComum.add(novoCliente);
		}
		System.out.printf("%n%s entrou no final da fila %s..%n", nome, (novoCliente.ePreferencial() ? "preferencial" : "comum"));
	}
	
	private void desistirDaFila() {
		imprimirFila();
		System.out.printf("%nIndique a fila:%n"
				+ "1 - Comum%n2 - Preferencial%n");
		int fila = input.nextInt();
		System.out.printf("%nPosicao da pessoa:%n");
		int posicao = input.nextInt();
		switch(fila) {
			case 1:
				if(posicao > filaComum.size() || posicao <= 0) {
					System.out.printf("%nPosicao nao existente..%n");
					return;
				}
				filaComum.remove(posicao-1);
				break;
			case 2:
				if(posicao > filaPreferencial.size() || posicao <= 0) {
					System.out.printf("%nPosicao nao existente..%n");
					return;
				}
				filaPreferencial.remove(posicao-1);	
				break;
			default:
				System.out.printf("%nFila invalida..%n");
				return;
		}
		
		System.out.printf("%nA pessoa na posicao %d desistiu da fila %s..%n", posicao, (fila==2 ? "preferencial" : "comum"));
	}
	
	private void atenderCliente() {
		if(aProximaFilaASerAtendidaEAPreferencial && filaPreferencial.size() > 0) {
			filaPreferencial.remove(0);
		}else if(aProximaFilaASerAtendidaEAPreferencial && filaPreferencial.size() == 0) {
			System.out.printf("%nNao ha clientes na fila preferencial..%n");
			aProximaFilaASerAtendidaEAPreferencial = !aProximaFilaASerAtendidaEAPreferencial;
			return;
		}else if(filaComum.size() > 0){
			filaComum.remove(0);
		}else if(filaComum.size() == 0) {
			System.out.printf("%nNao ha clientes na fila comum..%n");
			aProximaFilaASerAtendidaEAPreferencial = !aProximaFilaASerAtendidaEAPreferencial;
			return;
		}
		System.out.printf("%nAtendendo o proximo cliente %s..%n", (aProximaFilaASerAtendidaEAPreferencial ? "preferencial" : "comum"));
		aProximaFilaASerAtendidaEAPreferencial = !aProximaFilaASerAtendidaEAPreferencial;
	}
	
	private void buscarPosicaoNaFila() {
		System.out.printf("%nIndique a fila:%n"
				+ "1 - Comum%n2 - Preferencial%n");
		int fila = input.nextInt();
		
		System.out.printf("%nNome da pessoa:%n");
		String nome = input.next();
		
		int posicao;
		switch(fila) {
			case 1:
				posicao = buscaPorNomeNaFilaComum(nome);
				break;
			case 2:
				posicao = buscaPorNomeNaFilaPreferencial(nome);
				break;
			default:
				System.out.printf("%nFila invalida..%n");
				return;
		}
		
		if(posicao == -1) {
			System.out.printf("%nEsta pessoa nao esta presente na fila..%n");
		}else {
			System.out.printf("%n%s esta na posicao %d da fila %s..%n", nome, posicao + 1, (fila==2 ? "preferencial" : "comum"));
		}
	}
	
	private int buscaPorNomeNaFilaComum(String nomeBuscado) {
		for(Cliente cliente : filaComum) {
			if(cliente.getNome().equals(nomeBuscado)) {
				return filaComum.indexOf(cliente);
			}
		}
		return -1;
	}
	
	private int buscaPorNomeNaFilaPreferencial(String nomeBuscado) {
		for(Cliente cliente : filaPreferencial) {
			if(cliente.getNome().equals(nomeBuscado)) {
				return filaPreferencial.indexOf(cliente);
			}
		}
		return -1;
	}
	private void imprimirFila() {
		System.out.printf("%nFila Comum:");
		System.out.printf("%n******************%n");
		for(int i = 0; i<filaComum.size(); i++) {
			System.out.printf("%d - %s%n"
					+ "	Hora de chegada: %s%n"
					+ "	Idade: %d%n"
					+ "	Servico: %s%n%n", i+1, filaComum.get(i).getNome(), filaComum.get(i).getHoraDeChegada(), filaComum.get(i).getIdade(), filaComum.get(i).getServico());
		}
		
		System.out.printf("%nFila Preferencial:");
		System.out.printf("%n******************%n");
		for(int i = 0; i<filaPreferencial.size(); i++) {
			System.out.printf("%d - %s%n"
							+ "	Hora de chegada: %s%n"
							+ "	Idade: %d%n"
							+ "	Servico: %s%n%n", i+1, filaPreferencial.get(i).getNome(), filaPreferencial.get(i).getHoraDeChegada(), filaPreferencial.get(i).getIdade(), filaPreferencial.get(i).getServico());
		}
		
	}
}