
public class Musica {
	
	private final String artista;
	private final String titulo;
	
	Musica(String artista, String titulo){
		this.artista = artista;
		this.titulo = titulo;
	}
	
	public String getArtista() {
		return this.artista;
	}
	
	public String getTitulo() {
		return this.titulo;
	}
	
	public String toString() {
		return String.format("\"%s - %s\"", this.artista, 
											this.titulo);
	}
}