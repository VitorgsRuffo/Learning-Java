//Outro problema: e se quisessemos que o morador tivesse N carros , teriamos que criar N atributos do tipo Carro alem de nome e apartamento ?
//Poderiamos criar um array de carros: Carro[] carros = new Carro[X]. Porem isso limitaria a quantidade de carros que teriamos porque o X precisa ser especificado no momento de compilação.
//Como não sabemos a quantidade de carros desde o inicio e nao queremos impor um limite podemos usar um ArrayList de carros.
public class Morador {
    private String nome;
    private int apartamento;
    Carro carro;

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


	public String getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
}