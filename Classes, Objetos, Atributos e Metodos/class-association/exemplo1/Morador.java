//Atributos de classe podem ser de tipos primitivos, intancias de classes da API java (e.g, String, Integer, ..), ou intancias de classes que nos mesmos criamos.
//Veremos como trabalhar com este ultimo caso.

//Classe: representa um morador do apartamento + o seu carro.
//Notamos que ela tem um problema: estamos misturando dois objetos do mundo real (morador e carro) num objeto só.
//Observer que um carro tem 4 atributos so para ele. (Ele merece uma classe separada).
//É melhor criar uma classe carro e trabalhar com uma instancia de carro dentro da classe Morador.
public class Morador {
    private String nome;
    private int apartamento;
    private String marcaCarro;
	private String modeloCarro;
	private String corCarro;
	private String placaCarro;


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getApartamento() {
		return apartamento;
	}
	public void setApartamento(int apartamento) {
		this.apartamento = apartamento;
	}


	public String getMarcaCarro() {
		return marcaCarro;
	}
	public void setMarcaCarro(String marcaCarro) {
		this.marcaCarro = marcaCarro;
	}


	public String getModeloCarro() {
		return modeloCarro;
	}
	public void setModeloCarro(String modeloCarro) {
		this.modeloCarro = modeloCarro;
	}


	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}


	public String getPlacaCarro() {
		return placaCarro;
	}
	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}	
}

//E se quisessemos que o morador tivesse N carro, teriamos que cirar N*4 atributos alem de nome e apartamento ?
