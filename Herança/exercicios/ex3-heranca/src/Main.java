import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;
		
		Equipamento interruptor = new Equipamento();
		boolean ligado;
		System.out.printf("Um interruptor por padrão vem desligado...%n%n");
		do {
			ligado = interruptor.estaLigado();
			System.out.println("---------Interruptor----------");
			System.out.println(" 1 - ligar.            ");
			System.out.println(" 0 - desligar.         ");
			System.out.println(" 2 - parar.            ");
			System.out.printf("------Estado: %s       %n", (ligado ? "ligado" : "desligado"));
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					interruptor.ligar();
					break;
				case 0:
					interruptor.desligar();
					break;
				case 2:
					System.out.println("Parando...");
					break;
				default:
					System.out.println("Opcao invalida...");
			}
			
		}while(opcao != 2);
			
		
	    EquipamentoSonoro caixaDeSom = new EquipamentoSonoro(false);
	    short volume;
	    boolean caixaDeSomEstaligada;
		do {
			caixaDeSomEstaligada = caixaDeSom.estaLigado();
			System.out.println("---------Caixa de Som----------");
			System.out.println(" 1 - ligar.            ");
			System.out.println(" 0 - desligar.         ");
			System.out.println(" 2 - alterar volume.   ");
			System.out.println(" 3 - parar.            ");
			System.out.printf("------Estado: %s      %n", (caixaDeSomEstaligada ? "ligado" : "desligado"));
			System.out.printf("------Volume: %d      %n", caixaDeSom.getVolume());
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					caixaDeSom.ligar();
					break;
				case 0:
					caixaDeSom.desligar();
					break;
				case 2:
					if(caixaDeSomEstaligada) {
						System.out.println("Volume:");
						volume = input.nextShort();
						caixaDeSom.setVolume(volume);
					}else 
						System.out.println("A caixa de som esta desligada...");
					
					break;
				case 3:
					System.out.println("Parando...");
					break;
				default:
					System.out.println("Opcao invalida...");
			}
			
		}while(opcao != 3);
	    
	}
}
