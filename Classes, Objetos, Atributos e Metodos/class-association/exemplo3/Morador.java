import java.util.ArrayList; //Precisamos importar a classe ArrayList para usa-la.

public class Morador {
    private String nome;
    private int apartamento;
    ArrayList<Carro> carros;

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

    public ArrayList<Carro> getCarros(){
        return carros;
    }
    public void setCarros(ArrayList<Carro> carros){
        this.carros = carros;
    }
}