
public class Connection {
	private String ip;
	
	Connection(String ip){
		this.ip = ip;
	}
	
	public String toString() {
		return String.format("Conexao ativa! (ip: %s)\n", this.ip);
	}
}