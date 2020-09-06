//Cachorro herda ambos os metodos (que estao em sobrecarga) de Animal. Ele sobrescreve o comer() que nao possui parametros e mantem original o comer() com parametros.

public class Cachorro extends Animal{

    @Override //@Override não muda nada no nosso codigo apenas indica que o metodo abaixo esta sobrescrevendo o metodo herdado da classe pai (cuja assinatura é a mesma).
	public void comer() {
		System.out.println("O cachorro esta comendo...");
	}

}
