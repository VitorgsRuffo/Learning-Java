
public class Main {

	public static void main(String[] args) {

		System.out.println("===============Arvore Basica==================");
		ArvoreNatal arvore1 = new ArvoreNatalBasica();
		System.out.printf("Descricao: %s\n\n", arvore1.getDescricao());
		
		
		System.out.println("===============Arvore com luzes==================");
		ArvoreNatal arvore2 = new ArvoreNatalLuzes(new ArvoreNatalBasica());
		System.out.printf("Descricao: %s\n\n", arvore2.getDescricao());
		
		
		System.out.println("===============Arvore com festoes==================");
		ArvoreNatal arvore3 = new ArvoreNatalFestoes(new ArvoreNatalBasica());
		System.out.printf("Descricao: %s\n\n", arvore3.getDescricao());
		
		
		System.out.println("===============Arvore com luzes e festoes==================");
		ArvoreNatal arvore4 = new ArvoreNatalFestoes(
												new ArvoreNatalLuzes(
																	new ArvoreNatalBasica() ));
		
		System.out.printf("Descricao: %s\n\n", arvore4.getDescricao());
		
		
		System.out.println("===============Arvore com luzes, festoes e luzes==================");
		ArvoreNatal arvore5 = new ArvoreNatalLuzes(
												new ArvoreNatalFestoes(
																	new ArvoreNatalLuzes(
																					new ArvoreNatalBasica() )));
		
		System.out.printf("Descricao: %s\n\n", arvore5.getDescricao());
		
		
	}
	
}