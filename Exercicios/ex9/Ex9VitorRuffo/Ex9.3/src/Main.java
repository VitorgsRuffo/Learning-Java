
public class Main {

	public static void main(String[] args) {

		ConexaoBD conexaoBD = ConexaoBD.getInstancia();
		
		System.out.println(conexaoBD.getConexao());
				
	}
	
}