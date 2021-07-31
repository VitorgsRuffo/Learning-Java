
public class Main {

	public static void main(String[] args) {
		
		MagazineManager atlantica = new MagazineManager("Atlantica");
		
		atlantica.publishNewMagazine("Enfermagem Brasil");
		atlantica.publishNewMagazine("Nutricao Brasil");
		atlantica.publishNewMagazine("Fisiologia do Exercicio");
		
		System.out.println(atlantica);
		atlantica.printMagazines();
		System.out.println();
		
		
		Reader me = new Reader("Vitor");
		atlantica.subscribeToMagazine("Nutricao Brasil", me);
		atlantica.subscribeToMagazine("Fisiologia do Exercicio", me);
		
		Reader she = new Reader("Pamela");
		atlantica.subscribeToMagazine("Nutricao Brasil", she);
		atlantica.subscribeToMagazine("Enfermagem Brasil", she);
		
		Reader he = new Reader("Bruno");
		atlantica.subscribeToMagazine("Fisiologia do Exercicio", he);
		
		
		atlantica.publishMagazineNewEdition("Nutricao Brasil");
		System.out.println();
		
		atlantica.publishMagazineNewEdition("Enfermagem Brasil");
		System.out.println();

		atlantica.publishMagazineNewEdition("Fisiologia do Exercicio");
		System.out.println();
		
		
		atlantica.unsubscribeFromMagazine("Fisiologia do Exercicio", he);
		atlantica.publishMagazineNewEdition("Fisiologia do Exercicio");
		
		
		System.out.println();
		atlantica.printMagazines();
	}

}