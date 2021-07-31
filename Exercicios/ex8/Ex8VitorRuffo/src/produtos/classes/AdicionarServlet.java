package produtos.classes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdicionarServlet
 */
@WebServlet("/adicionarServlet")
public class AdicionarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome     = request.getParameter("nome");
		double preco    = Double.parseDouble(request.getParameter("preco"));
		int quantidade  = Integer.parseInt  (request.getParameter("quantidade"));
		
		Produto novoProduto = new Produto();
		novoProduto.setNome(nome);
		novoProduto.setPreco(preco);
		novoProduto.setQuantidade(quantidade);
		
		ProdutoDAO dao = new ProdutoDAO();
		dao.inserir(novoProduto);
		
		String mensagem = String.format("O produto \"%s\" foi adicionado ao sistema!", nome);
		request.setAttribute("mensagem", mensagem);

		RequestDispatcher view = 
				request.getRequestDispatcher("adicionar.jsp");
		
		view.forward(request, response);
		
	}

}
