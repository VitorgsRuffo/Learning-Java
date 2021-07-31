package produtos.classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


public class ProdutoDAO {
	
	private Connection connection;
	
	public ProdutoDAO(){
		
		this.connection = new ConnectionFactory().getConnection();
		
	}
	
	
	public void inserir(Produto produto){
		
		String sql = 
				"INSERT INTO produto (NOME, PRECO, QUANTIDADE) VALUES (?, ?, ?)";
		
		try {
			
			PreparedStatement prepStat = connection.prepareStatement(sql);
			
			prepStat.setString (1, produto.getNome());
			prepStat.setDouble (2, produto.getPreco());
			prepStat.setInt    (3, produto.getQuantidade());
			
			prepStat.execute();
			prepStat.close();
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
			
		}finally {
			
			try {
				
				connection.close();
				
			}catch(SQLException e) {
				
				throw new RuntimeException(e);
			}
		}
		
	}
	
	
	public List<Produto> buscarPorNome(String nome){
		
		String sql = 
				"SELECT * FROM produto WHERE NOME LIKE UPPER(?)";
		
		List<Produto> produtos = new ArrayList<Produto>();
		
		try {
			
			PreparedStatement prepStat = connection.prepareStatement(sql);
			
			prepStat.setString(1, new String("%"+nome+"%").toUpperCase());
					
			ResultSet resultado = prepStat.executeQuery();
			
			while(resultado.next()){
				
				Produto produto = new Produto();
				
				produto.setId(resultado.getLong("ID"));
				produto.setNome(resultado.getString("NOME"));
				produto.setPreco(resultado.getDouble("PRECO"));
				produto.setQuantidade(resultado.getInt("QUANTIDADE"));

				produtos.add(produto);
			}
			
			resultado.close();
			prepStat.close();
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
			
		}finally {
			
			try {
				connection.close();
				
			}catch(SQLException e) {
				
				throw new RuntimeException(e);
			}
		}
		
		return produtos;

	}
	
	
	public Produto buscarPorId(Long id){
		
		String sql = 
				"SELECT * FROM produto WHERE ID=?";
		
		Produto produto = new Produto();

		try {
			
			PreparedStatement prepStat = connection.prepareStatement(sql);

			prepStat.setLong(1, id);
			
			ResultSet resultado = prepStat.executeQuery();
			
			resultado.next();
			
			produto.setId(resultado.getLong("ID"));
			produto.setNome(resultado.getString("NOME"));
			produto.setPreco(resultado.getDouble("PRECO"));
			produto.setQuantidade(resultado.getInt("QUANTIDADE"));
			
			resultado.close();
			prepStat.close();
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
			
		}finally {
			
			try {
				connection.close();
				
			}catch(SQLException e) {
				
				throw new RuntimeException(e);
			}
		}
		
		return produto;
	}
	
	
	public void alterar(Produto produto){
		
		String sql = 
				"UPDATE produto SET NOME=?, PRECO=?, QUANTIDADE=? WHERE ID=?";
		
		try {
			
			PreparedStatement prepStat = connection.prepareStatement(sql);
			
			prepStat.setString (1, produto.getNome());
			prepStat.setDouble (2, produto.getPreco());
			prepStat.setInt    (3, produto.getQuantidade());
			prepStat.setLong   (4, produto.getId());
			
			prepStat.execute();
			prepStat.close();
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
			
		}finally {
			
			try {
				connection.close();
				
			}catch(SQLException e) {
				
				throw new RuntimeException(e);
			}
		}
		
	}
	
	
	public void excluir(Long id){
		
		String sql = 
				"DELETE FROM produto WHERE ID=?";
		
		try {
			
			PreparedStatement prepStat = connection.prepareStatement(sql);
			
			prepStat.setLong(1, id);
			
			prepStat.execute();
			prepStat.close();
			
		}catch(SQLException e) {
			
			throw new RuntimeException(e);
			
		}finally {
			
			try {
				connection.close();
				
			}catch(SQLException e) {
				
				throw new RuntimeException(e);
			}
		}
		
	}
	
}