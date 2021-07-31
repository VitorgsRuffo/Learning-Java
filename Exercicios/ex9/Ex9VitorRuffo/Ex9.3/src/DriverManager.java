
public class DriverManager {
	
	public static Connection getConnection(String ip) {
		return new Connection(ip);
	}
}