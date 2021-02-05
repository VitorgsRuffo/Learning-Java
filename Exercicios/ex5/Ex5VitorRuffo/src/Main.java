import java.util.Scanner;
import java.util.SortedSet;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int opcao;
		
		Mp3Player mp3Player = new Mp3Player("iPod", "Apple");
		
		String artista, titulo;
		
		do {
			System.out.println("=----------Mp3 Player---------=");
			System.out.println("=-----------------------------=");
			System.out.println("= 1 - Adicionar musica.       =");
			System.out.println("= 2 - Mostrar musicas.        =");
			System.out.println("= 3 - Mostrar musicas apos.   =");
			System.out.println("= 4 - Mostrar musicas antes.  =");
			System.out.println("= 5 - Sair.                   =");
			System.out.println("=-----------------------------=");
			System.out.printf(" %s", mp3Player);
			System.out.println("=-----------------------------=");

			
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					adicionarMusica(mp3Player, input);
					break;
				
				case 2:
					System.out.println("\nMusicas:\n");
					mp3Player.mostrarMusicas();
					break;
					
				case 3:
					mostrarMusicasApos(mp3Player, input);
					break;
					
				case 4:
					mostrarMusicasAntes(mp3Player, input);
					break;
					
				case 5:
					System.out.println("Saindo...\n");
					break;
				
				default:
					System.out.printf("Opcao invalida.\nPor favor digite novamente...\n");
			}
		}while(opcao != 5);
	}
	
	private static void adicionarMusica(Mp3Player mp3Player, Scanner input) {
		input.nextLine(); //usado para consumir o caractere '\n' produzido apos o "enter" que nao e consumido pelo nextInt() anterior.
		System.out.println("Nome do artista:");
		String artista = input.nextLine();
		
		System.out.println("Titulo da musica:");
		String titulo = input.nextLine();
		
		mp3Player.adicionarMusica(new Musica(artista, titulo));
	}
	
	private static void mostrarMusicasApos(Mp3Player mp3Player, Scanner input) {
		System.out.printf("\nMostrar musicas apos... ");
		Musica tail = escolherMusica(mp3Player, input);
		mp3Player.mostrarMusicasApos(tail);
	}
	
	private static void mostrarMusicasAntes(Mp3Player mp3Player, Scanner input) {
		System.out.printf("\nMostrar musicas antes... ");
		Musica head = escolherMusica(mp3Player, input);
		mp3Player.mostrarMusicaAntes(head);
	}
	
	private static Musica escolherMusica(Mp3Player mp3Player, Scanner input) {
		System.out.println("Escolha uma musica:");
		mp3Player.mostrarMusicas();
		
		SortedSet<Musica> musicas = mp3Player.getMusicas();
		int quantidadeMusicas = musicas.size();
		int opcao;
		do {
			opcao = input.nextInt();
			if(opcao < 1 || opcao > quantidadeMusicas)
				System.out.printf("Musica invalida. Por favor, tente novamente...\n");
		}while(opcao < 1 || opcao > quantidadeMusicas);
		
		int i = 1;		
		for(Musica musica : musicas) {
			if(i == opcao) 
				return musica;
			
			i++;
		}
		
		return null;
		
	}
}
	