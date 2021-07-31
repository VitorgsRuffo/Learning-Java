package produtos.classes;

import java.io.IOException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AdicionarCarrinhoServlet
 */
@WebServlet("/adicionarCarrinhoServlet")
public class AdicionarCarrinhoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdicionarCarrinhoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    //Trata requisicoes get. Essas requisicoes ocorrem quando o cliente clica no link "adicionar no carrinho" na pagina de resultado de busca "busca.jsp".
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Long id = 
				Long.parseLong(request.getParameter("id"));
		
		ProdutoDAO dao = new ProdutoDAO();
		Produto produto = dao.buscarPorId(id);
		
		request.setAttribute("produto", produto);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("adicionarCarrinho.jsp");
		
		view.forward(request, response);
		
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	//Trata requisicoes post. Essas requisicoes ocorrem quando o cliente esta na pagina "adicionarCarrinho.jsp", escolhe uma quantidade desejada do produto e clica no botao "Adicionar".
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Long id = 
				Long.parseLong(request.getParameter("id"));
		
		int quantidade = 
				Integer.parseInt(request.getParameter("quantidade"));
		
		ProdutoDAO dao = new ProdutoDAO();
		Produto produto = dao.buscarPorId(id);
		
		Produto produtoCarrinho = new Produto();
		produtoCarrinho.setNome(produto.getNome());
		produtoCarrinho.setPreco(produto.getPreco());
		produtoCarrinho.setQuantidade(quantidade);
		
		//adicionando produto na lista "carrinho" do cookie do cliente:
		HttpSession session = request.getSession();
		Object carrinhoObj = session.getAttribute("carrinho");
		
		if(carrinhoObj == null) {
			
			LinkedList<Produto> carrinho = 
					new LinkedList<Produto>();
			
			carrinho.add(produtoCarrinho);
			
			session.setAttribute("carrinho", carrinho);
			
		}else {
			
			LinkedList<Produto> carrinho = 
					(LinkedList<Produto>) carrinhoObj;
			
			carrinho.add(produtoCarrinho);

		}

		
		String mensagem = String.format("O produto \"%s\" identificado por \"%d\" foi adicionado ao carrinho de compras.", produtoCarrinho.getNome(), id);
		request.setAttribute("mensagem", mensagem);
		
		RequestDispatcher view = 
				request.getRequestDispatcher("index.jsp");
		
		view.forward(request, response);

	}

}
