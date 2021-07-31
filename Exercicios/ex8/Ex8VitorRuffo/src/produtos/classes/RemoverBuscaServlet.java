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
 * Servlet implementation class RemoverBuscaServlet
 */
@WebServlet("/removerBuscaServlet")
public class RemoverBuscaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoverBuscaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("indice"));
		
		LinkedList<String> listaBuscados = 
				(LinkedList) request.getSession().getAttribute("listaBuscados");
		
		listaBuscados.remove(id);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("buscar.jsp");
		
		view.forward(request, response);
		
	}

}
