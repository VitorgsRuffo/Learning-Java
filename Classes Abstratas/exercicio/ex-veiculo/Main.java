
public class Main {
	public static void main(String[] args) {
		Veiculo carro1 = new Carro();
		
		carro1.marca = "honda";
		carro1.modelo = "civic 2020";
		carro1.placa = "ABC-0000";
		
		System.out.println("Numero de eixos: " + carro1.obterNumeroDeEixos());
		carro1.licenciar();
	}
}
