import java.util.Comparator;

public class ComparadorDeMusicas implements Comparator<Musica> {
	private final String tipo;
	
	ComparadorDeMusicas(String tipo){
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	@Override
	public int compare(Musica musica1, Musica musica2) {
		int resultado = 0;
		
		if(this.tipo.equals("titulo"))
			resultado = compararPorTitulo(musica1, musica2);
		
		else if(this.tipo.equals("artista"))
			resultado = compararPorArtista(musica1, musica2);
		
		return resultado;
	}
	
	private int compararPorTitulo(Musica musica1, Musica musica2) {
		String titulo1 = musica1.getTitulo();
		String titulo2 = musica2.getTitulo();
		
		return titulo1.compareTo(titulo2);
	}
	
	private int compararPorArtista(Musica musica1, Musica musica2) {
		String artista1 = musica1.getArtista();
		String artista2 = musica2.getArtista();
		
		return artista1.compareTo(artista2);
	}
}