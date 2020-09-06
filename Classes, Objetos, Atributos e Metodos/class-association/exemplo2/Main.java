public class Main {
    public static void main(String[] args){
        //Obs: variaveis do tipo de uma Classe terão o valor de um endereço de memora que possui os seus atributos.

        Morador morador1 = new Morador(); //morador1 é um ponteiro para uma parte da memoria que guarda uma instancia de Morador (variveis/atributos que compoem um Morador)
        carro.setMarca("Honda");
        morador1.setNome("Vitor");
        morador1.setApartamento(801);

        Carro carro = new Carro(); //carro é um ponteiro para uma parte da memoria que guarda uma instancia de Carro (variveis/atributos que compoem um Carro)
        carro.setMarca("Honda");
        carro.setModelo("Civic");
        carro.setCor("Prata");
        carro.setPlaca("ABC-0000");

        morador1.setCarro(carro); //estamos fazendo o ponteiro carro que faz parte do objeto morador apontar pra esse carro que instanciamos logo acima.
        System.out.printf("Cor do carro: %s.%n", morador1.getCarro().getCor()); //morador1.getCarro() retorna uma referencia para a intancia que o ponteiro carro do objeto morador1 aponta.

        Carro carro2 = carro; //carro2 esta apontando para o mesmo objeto que o atributo carro do morador1 esta apontando.
        carro2.setCor("Azul"); //Obviamente essa mundança sera percebida pelo atributo carro do morador1.
        System.out.printf("Nova cor: %s.%n", morador1.getCarro().getCor()); //Azul
    }
}