import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int opcao;
		
		Mp3Player mp3Player = new Mp3Player("iPod", "Apple");
		
		String artista, titulo;
		
		do {
			System.out.println("=--------Mp3 Player-------=");
			System.out.println("=-------------------------=");
			System.out.println("= 1 - Adicionar musica.   =");
			System.out.println("= 2 - Ordenar musicas.    =");
			System.out.println("= 3 - Buscar por musica.  =");
			System.out.println("= 4 - Embaralhar musicas. =");
			System.out.println("= 5 - Mostrar musicas.    =");
			System.out.println("= 6 - Sair.               =");
			System.out.println("=-------------------------=");
			System.out.printf(" %s", mp3Player);
			System.out.println("=-------------------------=");

			
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					adicionarMusica(mp3Player, input);
					break;
				
				case 2:
					ordenarMusicas(mp3Player, input);
					break;
					
				case 3:
					buscarMusica(mp3Player, input);
					break;
					
				case 4:
					mp3Player.embaralharMusicas();
					break;
					
				case 5:
					mp3Player.mostrarListaDeMusicas();
					break;
					
				case 6:
					System.out.println("Saindo...\n");
					break;
				
				default:
					System.out.printf("Opcao invalida.\nPor favor digite novamente...\n");
			}
		}while(opcao != 6);
	}
	
	private static void adicionarMusica(Mp3Player mp3Player, Scanner input) {
		input.nextLine(); //usado para consumir o caractere '\n' produzido apos o "enter" que nao e consumido pelo nextInt() anterior.
		System.out.println("Nome do artista:");
		String artista = input.nextLine();
		
		System.out.println("Titulo da musica:");
		String titulo = input.nextLine();
		
		mp3Player.adicionarMusica(new Musica(artista, titulo));
	}
	
	private static void ordenarMusicas(Mp3Player mp3Player, Scanner input) {
		System.out.printf("Ordenar musicas por:\n1 - artista\n2 - titulo\n");
		int opcao;
		do {
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					mp3Player.ordenarMusicas(new ComparadorDeMusicas("artista"));
					break;
					
				case 2:
					mp3Player.ordenarMusicas(new ComparadorDeMusicas("titulo"));
					break;
					
				default:
					System.out.println("Opcao invalida...\nPor favor digite novamente...\n");
			}
		}while(opcao != 1 && opcao != 2);
		
	}
	
	private static void buscarMusica(Mp3Player mp3Player, Scanner input) {
		System.out.printf("Buscar musica por:\n1 - Artista\n2 - Titulo\n");
		int opcao;
		
		Musica chave;
		String stringDeBusca;
		
		do {
			opcao = input.nextInt();
			input.nextLine(); //usado para consumir o caractere '\n' produzido apos o "enter" que nao e consumido pelo nextInt() anterior.

			switch(opcao) {
				case 1:
					System.out.println("Artista: ");
					stringDeBusca = input.nextLine();
					chave = new Musica(stringDeBusca, "");
					mp3Player.buscarMusica(chave, new ComparadorDeMusicas("artista"));
					break;
					
				case 2:
					System.out.println("Titulo: ");
					stringDeBusca = input.nextLine();
					chave = new Musica("", stringDeBusca);
					mp3Player.buscarMusica(chave, new ComparadorDeMusicas("titulo"));
					break;
					
				default:
					System.out.println("Opcao invalida...\nPor favor digite novamente...\n");
			}
		}while(opcao != 1 && opcao != 2);
	
	}
}