package produtos.classes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlterarServlet
 */
@WebServlet("/alterarServlet")
public class AlterarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AlterarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Trata requisicoes get. Essas requisicoes ocorrem quando o cliente clica no link "alterar" na pagina de resultado de busca.
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ProdutoDAO dao = new ProdutoDAO();
		
		Long id = 
				Long.parseLong(request.getParameter("id"));
		
		Produto produto = dao.buscarPorId(id);
		
		request.setAttribute("produto", produto);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("alterar.jsp");
		
		view.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//Trata requisicoes post. Essas requisicoes ocorrem quando o cliente finaliza a alteracao do produto na pagina "alterar.jsp" e clica no botao "Finalizar alteracao".
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nome = request.getParameter("nome");
		double preco = 
				Double.parseDouble(request.getParameter("preco"));
		int quantidade = 
				Integer.parseInt(request.getParameter("quantidade"));
		
		Long id = Long.parseLong(request.getParameter("id"));
		
		Produto produtoAlterado = new Produto();
		produtoAlterado.setId(id);
		produtoAlterado.setNome(nome);
		produtoAlterado.setPreco(preco);
		produtoAlterado.setQuantidade(quantidade);

		ProdutoDAO dao = new ProdutoDAO();
		dao.alterar(produtoAlterado);
		
		String mensagem = String.format("O produto \"%s\" identificado por \"%d\" foi alterado com sucesso.", nome, id);
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("index.jsp");
		
		view.forward(request, response);

	}

}
