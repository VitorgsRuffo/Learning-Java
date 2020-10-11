public class Gato implements Animal {
    
    //Metodos previstos na interface Animal e que a classe Gato é obrigada a implementar:
     public void andar(){
        System.out.println("O gato esta andando...");
    }
    public void comer(){
        System.out.println("O gato esta comendo...");
    }
    public void dormir(){
        System.out.println("O gato esta dormindo...");
    }
    public void fazerNecessidades(){
        System.out.println("O gato esta *******...");
    }

    //Metodo particular de gato:
    public void miar(){
        System.out.println("Miau!");
    }
}