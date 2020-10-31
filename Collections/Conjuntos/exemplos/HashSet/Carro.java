
public class Carro {
	
	private String modelo;
	private String marca;
	
	public Carro(String pModelo, String pMarca) {
		this.modelo = pModelo;
		this.marca = pMarca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getMarca() {
		return marca;
	}
	
	public String toString() {
		return this.marca +"-"+this.modelo;
	}
	
	//Sobreescrevemos os metodos equals e hashCode que servirão para
	//determinar quando duas instancias de Carro são iguais. Em ambos
	//os casos determina-se que dois Carros são iguais se eles têm a 
	//mesma marca e modelo.
	@Override
	public boolean equals(Object o1) {
		Carro that = (Carro) o1;
		
		return (this.marca.equals(that.getMarca())
				&& this.modelo.equals(that.getModelo()));
	}
	
	@Override
	public int hashCode() {
		return 
				this.marca.hashCode()+this.modelo.hashCode();
	
		//A classe pre-definida String tem a sua implementacao particular do metodo hashCode.
		//Esse metodo retorna um inteiro que representa aquela string de maneira unica.
	}
}