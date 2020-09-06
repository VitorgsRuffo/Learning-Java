//Sobrescrita de metodos: uma classe filha herda os metodos protected e public da classe pai. Caso a classe filha queira mudar o comportamento de um desses metodos basta ela sobrescreve-lo. Para isso a classe filha deve declarar um metodo com a mesma assinatura e com o corpo que essa sub-classe desejar.
//Obs: sobrescrita (overriding) é diferente de sobrecarga (overload) de metodos. 

public class Main {
    public static void main(String[] args){
        Animal a = new Animal();
		Cachorro c = new Cachorro();
		
		a.comer();
		a.comer("Felipe");

		b.comer();
		b.comer("Alberto");
    }
}