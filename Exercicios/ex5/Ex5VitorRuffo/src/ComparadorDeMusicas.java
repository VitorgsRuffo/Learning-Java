import java.util.Comparator;

public class ComparadorDeMusicas implements Comparator<Musica> {
	
	@Override
	public int compare(Musica musica1, Musica musica2) {
		String titulo1 = musica1.getTitulo();
		String titulo2 = musica2.getTitulo();
		
		return titulo1.compareToIgnoreCase(titulo2);
	}
	
}