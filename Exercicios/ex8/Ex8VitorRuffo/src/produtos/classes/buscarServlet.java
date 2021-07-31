package produtos.classes;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class buscarServlet
 */
@WebServlet("/buscarServlet")
public class buscarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public buscarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nome");
		
		//armazenando a busca atual no cookie do cliente:
		HttpSession session = request.getSession();

		Object listaBuscadosObj = session.getAttribute("listaBuscados");
		
		if(listaBuscadosObj == null) {
			
			LinkedList<String> listaBuscados = 
					new LinkedList<String>();
			
			listaBuscados.add(nome);
			
			session.setAttribute("listaBuscados", listaBuscados);
			
		}else {
			
			LinkedList<String> listaBuscados = 
					(LinkedList<String>) listaBuscadosObj;
			
			listaBuscados.add(nome);
			
		}
		
		//buscando todos os produtos com o nome passado na requisicao:
		ProdutoDAO dao = new ProdutoDAO();
		
		List<Produto> listaProdutos = 
				dao.buscarPorNome(nome);
		
		
		//encaminhando a requisicao (juntamente com o resultado da busca) para um arquivo .jsp que montara a resposta para o usuario:
		request.setAttribute("listaProdutos", listaProdutos);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("busca.jsp");
		
		view.forward(request, response);
	}

}
