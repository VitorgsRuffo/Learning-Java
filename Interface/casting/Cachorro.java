public class Cachorro implements Animal {

    //Metodos previstos na interface Animal e que a classe Cachorro é obrigada a implementar:
    public void andar(){
        System.out.println("O cachorro esta andando...");
    }
    public void comer(){
        System.out.println("O cachorro esta comendo...");
    }
    public void dormir(){
        System.out.println("O cachorro esta dormindo...");
    }
    public void fazerNecessidades(){
        System.out.println("O cachorro esta *******...");
    }

    //Metodo particular de Cachorro:
    public void latir(){
        System.out.println("AuAu!");
    }
}