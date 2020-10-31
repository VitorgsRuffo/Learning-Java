import java.util.List;
import java.util.LinkedList;
import java.util.Collections;

public class Mp3Player {
	private final String modelo;
	private final String marca;
	private List<Musica> musicas;
	
	Mp3Player(String modelo, String marca){
		this.modelo = modelo;
		this.marca = marca;
		this.musicas = new LinkedList<Musica>();
	}
	
	public void adicionarMusica(Musica musica) {
		this.musicas.add(musica);
		System.out.printf("\nA musica %s foi adicionada ao Mp3Player!\n\n", musica);
	}
	
	public void ordenarMusicas(ComparadorDeMusicas comparadorDeMusicas) {
		
		String tipoDeComparacao = comparadorDeMusicas.getTipo();
		System.out.printf("\nOrdenando musicas por %s...\n", tipoDeComparacao);
		Collections.sort(this.musicas, comparadorDeMusicas);
		
		this.mostrarListaDeMusicas();
	}
	
	public void buscarMusica(Musica chave, ComparadorDeMusicas comparadorDeMusicas) {
		
		String tipoDeComparacao = comparadorDeMusicas.getTipo();
		System.out.printf("\nBuscando musica por %s...\n", tipoDeComparacao);
		int resultado = Collections.binarySearch(this.musicas, chave, comparadorDeMusicas);
		
		if(resultado >= 0) {
			Musica musica = this.musicas.get(resultado);
			System.out.println("Musica encontrada!\n");
			System.out.printf("%02d - %s - %s\n\n", (resultado + 1), 
												  musica.getArtista(), 
											      musica.getTitulo());
			
		}else {
			System.out.println("Musica nao encontrada...\n");
		}
	}
	
	public void embaralharMusicas() {
		System.out.println("Embaralhando musicas...");
		Collections.shuffle(this.musicas);
		
		this.mostrarListaDeMusicas();
	}
	
	public void mostrarListaDeMusicas() {
		int tamanhoDaLista = this.musicas.size();
		Musica musica;
		
		System.out.println("\nLista de musicas:\n");
		for(int i = 0; i < tamanhoDaLista; i++) {
			musica = musicas.get(i);
			System.out.printf("%02d | %s.\n", (i+1), 
										      musica);
		}
		System.out.println("");
	}
	
	public String toString() {
		return String.format("%s | %s - %d musica(s)\n", this.marca, 
														this.modelo, 
														this.musicas.size());
	}
	
}