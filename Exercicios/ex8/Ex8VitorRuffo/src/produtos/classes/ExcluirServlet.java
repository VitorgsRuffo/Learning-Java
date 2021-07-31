package produtos.classes;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcluirServlet
 */
@WebServlet("/excluirServlet")
public class ExcluirServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcluirServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ProdutoDAO dao = new ProdutoDAO();
		
		Long id = Long.parseLong(request.getParameter("id"));
		String nome = request.getParameter("nome");
		
		dao.excluir(id);
		
		String mensagem = String.format("O produto \"%s\" identificado por \"%d\" foi excluido do sistema.", nome, id);
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("index.jsp");
		
		view.forward(request, response);
		
		
	}

}
