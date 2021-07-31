package produtos.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	
	public Connection getConnection(){
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(
					"jdbc:mysql://ip:port/"
					+ "produtos?useTimezone=true&serverTimezone=America/"
					+ "Sao_Paulo", 
					"login", "pwd");
			
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}