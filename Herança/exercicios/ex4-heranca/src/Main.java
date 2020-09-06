import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input = 
				new Scanner(System.in);
		int opcao;
		
		
		MeioTransporte meioDeTransporte = 
				new MeioTransporte();
		
		boolean meioDeTransporteEstaLigado;
		int velocidade;
		
		do {
			meioDeTransporteEstaLigado = meioDeTransporte.estaLigado();
			velocidade = meioDeTransporte.getVelocidade();
			
			System.out.println("----Meio de Transporte----");
			System.out.println(" 1 - ligar.               ");
			System.out.println(" 0 - desligar.            ");
			System.out.println(" 2 - mudar velocidade.    ");
			System.out.println(" 3 - parar.               ");
			System.out.printf("------Estado: %s         %n", (meioDeTransporteEstaLigado ? "ligado" : "desligado"));
			System.out.printf("------Velocidade: %d km/h%n", velocidade);			
			
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					meioDeTransporte.ligar();
					break;
				case 0:
					meioDeTransporte.desligar();
					break;
				case 2:
					System.out.println("Insira a velocidade:");
					velocidade = input.nextInt();
					meioDeTransporte.setVelocidade(velocidade);
					break;	
				case 3:
					System.out.println("Parando...");
					break;
				default:
					System.out.println("Opcao invalida...");
			}
			
		}while(opcao != 3);
		

		
		Carro carro = 
				new Carro();
		
		boolean carroEstaLigado;
		int quilometragem;
		
		do {
			carroEstaLigado = carro.estaLigado();
			velocidade = carro.getVelocidade();
			quilometragem = carro.getQuilometragem();
			
			System.out.println("---------- Carro ---------");
			System.out.println(" 1 - ligar.               ");
			System.out.println(" 0 - desligar.            ");
			System.out.println(" 2 - mudar velocidade.    ");
			System.out.println(" 3 - mudar quilometragem. ");
			System.out.println(" 4 - parar.               ");
			System.out.printf("------Estado: %s         %n", (carroEstaLigado ? "ligado" : "desligado"));
			System.out.printf("------Velocidade: %d km/h%n", velocidade);	
			System.out.printf("------Quilometragem: %d km%n", quilometragem);			
			
			opcao = input.nextInt();
			switch(opcao) {
				case 1:
					carro.ligar();
					break;
				case 0:
					carro.desligar();
					break;
				case 2:
					System.out.println("Insira a velocidade:");
					velocidade = input.nextInt();
					carro.setVelocidade(velocidade);
					break;
				case 3:
					System.out.println("Insira a quilometragem:");
					quilometragem = input.nextInt();
					carro.setQuilometragem(quilometragem);
					break;
				case 4:
					System.out.println("Parando...");
					break;
				default:
					System.out.println("Opcao invalida...");
			}
			
		}while(opcao != 4);
		
	}
}
