import java.util.ArrayList; //Precisamos importar a classe ArrayList para usa-la.

public class Main {
    public static void main(String[] args){

        Morador morador1 = new Morador(); 
        carro.setMarca("Honda");
        morador1.setNome("Vitor");
        morador1.setApartamento(801);

        Carro carro = new Carro(); 
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setCor("Prata");
        carro.setPlaca("ABC-0000");

        Carro carro2 = new Carro(); 
        carro2.setMarca("VW");
        carro2.setModelo("Pickup");
        carro2.setCor("Preto");
        carro2.setPlaca("ABC-0002");

        //Criando a lista e adicionando dois carros a ela:
        ArrayList<Carro> carros = new ArrayList<Carro>(); //carros aponta para o inicio de uma lista.
        carros.add(carro);
        carros.add(carro2);

        morador1.setCarros(carros); //o atributo carros do morador1 passa a apontar pra mesma lista que a variavel carros da main.

        for(Carro carro : morador1.getCarros()){ //getCarros retornara uma referencia para a lista. O for vai ponhar um no da lista na variavel carro a cada iteraçao.
            System.out.printf("Cor: %s.%n", carro.getCor());
        }

        carros.remove(1); //a varivel carros da main aponta para a mesma lista que o atributo carros do morador1 aponta, logo, ambos conseguem alterar o estado desse objeto lista de carros.
        System.out.println("********************************");

        for(Carro carro : morador1.getCarros()){ //getCarros retornara uma referencia para a lista. O for vai ponhar um no da lista na variavel carro a cada iteraçao.
            System.out.printf("Cor: %s.%n", carro.getCor());
        }
    }
}