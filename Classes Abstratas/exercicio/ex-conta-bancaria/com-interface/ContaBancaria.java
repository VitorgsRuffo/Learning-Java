import java.math.BigDecimal;

//Ao trabalhar com contas bancarias saberemos que elas possuirao estes metodos (sacar, depositar).
//Deste modo, podemos trabalhar com multiplos tipos de conta bancaria de maneira generica:
//e.g, manter uma lista de diferentes variaçoes de contas bancarias.

//Porem, quando precisarmos executar um metodo especifico de uma variaçao de conta bancaria,
//sera necessario dar um casting no objeto para o tipo da sua variaçao para so entao termos
//acesso ao metodo.
public interface ContaBancaria {
	
	void sacar(BigDecimal valor);
	
	void depositar(BigDecimal valor);

}

//Problemas comum de interfaces:

	//1 - Se um metodo, por exemplo o depositar ou getters, possuir a mesma implementacao para todas
	//as variaçoes de conta bancaria teremos uma repetiçao de codigo. (soluçao: classe abstrata).

	//2 - As diferentes implementaçoes da interface podem possuir atributos em comum, ou seja,
	//vamos ter mais repetiçao de codigo.