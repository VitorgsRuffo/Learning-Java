public class Animal {

    //Sobrecarga de metodos acontecendo:
	public void comer() {
		System.out.println("O animal esta comendo...");
	}
	
	public void comer(String nomeDoAnimal) {
		System.out.printf("O animal %s esta comendo...%n", nomeDoAnimal);
	}

}