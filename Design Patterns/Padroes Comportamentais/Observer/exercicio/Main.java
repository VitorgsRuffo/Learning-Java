/*
 * Observers (subscribers): objetos que desejam ser notificados de atualizacoes.
 * Subject (publisher): guarda todos os Observers que se inscreveram nele e os notifica da ocorrencia de atualizacoes em seu estado.
 * 
 * 
 * O ponto principal desse design pattern e que atribuimos papeis bem definidos dentro do sistema para os objetos.
 * No caso o papel de "publisher" e o de "subscriber". A troca de mensagens entre esses objetos é baseada no uso de interfaces,
 * o que facilita a inclusao de novos tipos de subscriber, etc...
 * 
 * O uso de interfaces causa um fraco acoplamento reduzindo a dependencia entre Observer e Subject.
 * 
*/


public class Main {
	public static void main(String[] args) {
		
		Door frontDoor = new Door("Oak");
		
		Phone momsPhone = new Phone("mom-01017");
		Phone dadsPhone = new Phone("dad-01019");
		Phone myPhone = new Phone("me-010110");
		
		Dog ourDog = new Dog("Steve");
		
		frontDoor.attach(momsPhone);
		frontDoor.attach(dadsPhone);
		frontDoor.attach(myPhone);
		frontDoor.attach(ourDog);
		
		frontDoor.open();
		frontDoor.close();
		System.out.println("---------------------------------------------------");
		frontDoor.detach(myPhone);
		frontDoor.open();
		frontDoor.open();
		frontDoor.close();
	}
}