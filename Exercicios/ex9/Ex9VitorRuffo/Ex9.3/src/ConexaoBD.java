public class ConexaoBD {
	
	private static ConexaoBD instancia;
	
	private ConexaoBD() {
		this.conexao = DriverManager.getConnection("192.168.0.1:2000");
	}
	
	public static ConexaoBD getInstancia() {
		if(ConexaoBD.instancia == null)
            ConexaoBD.instancia = new ConexaoBD();
        

        return ConexaoBD.instancia;
	}
	
	
	
	private Connection conexao;
	
	public Connection getConexao() {
		return this.conexao ;
	}
}