package produtos.classes;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RemoverCarrinhoServlet
 */
@WebServlet("/removerCarrinhoServlet")
public class RemoverCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverCarrinhoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int id = Integer.parseInt(request.getParameter("indice"));
		
		LinkedList<Produto> carrinho = 
				(LinkedList) request.getSession().getAttribute("carrinho");
		
		carrinho.remove(id);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("carrinho.jsp");
		
		view.forward(request, response);
	
	}

}
