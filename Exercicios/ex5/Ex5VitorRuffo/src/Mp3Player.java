import java.util.SortedSet;
import java.util.TreeSet;

public class Mp3Player {
	private final String modelo;
	private final String marca;
	private SortedSet<Musica> musicas;
	
	Mp3Player(String modelo, String marca){
		this.modelo = modelo;
		this.marca = marca;
		this.musicas = new TreeSet<Musica>(new ComparadorDeMusicas());
	}
	
	public SortedSet<Musica> getMusicas(){
		return this.musicas;
	}
	
	public void adicionarMusica(Musica musica) {
		this.musicas.add(musica);
		System.out.printf("\nA musica %s foi adicionada ao Mp3Player!\n\n", musica);
	}
	
	public void mostrarMusicas() {
		int i = 1;
		
		for(Musica musica : this.musicas) {
			System.out.printf("%d | %s.\n", i, 
										      musica);
			i++;
		}
		System.out.println("");
	}
	
	public void mostrarMusicasApos(Musica tail) {
		System.out.printf("\nMusicas apos %s (inclusive): \n", tail);
		
		SortedSet<Musica> set = this.musicas.tailSet(tail);
		
		for(Musica musica : set) {
			System.out.printf("%s\n", musica);
		}
		System.out.println();
	}
	
	public void mostrarMusicaAntes(Musica head) {
		System.out.printf("\nMusicas antes %s (exclusive): \n", head);
		
		SortedSet<Musica> set = this.musicas.headSet(head);
		
		for(Musica musica : set) {
			System.out.printf("%s\n", musica);
		}
		System.out.println();
	}
	
	public String toString() {
		return String.format("%s | %s - %d musica(s)\n", this.marca, 
														 this.modelo, 
														 this.musicas.size());
	}
	
}