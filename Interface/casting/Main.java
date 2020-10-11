import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Animal> animais = 
            new ArrayList<Animal>();
        
        //Criando objetos do mesmo tipo mas com implementacoes diferentes:
        Animal cachorro1 = new Cachorro();
        Animal cachorro2 = new Cachorro();

        Animal gato1 = new Gato();
        Animal gato2 = new Gato();

        //Ja que os objetos acima sao do mesmo tipo somos capazes de coloca-los em uma mesma lista:
        animais.add(cachorro1);
        animais.add(gato1);
        animais.add(cachorro2);
        animais.add(gato2);

        darDeComerAosAnimais(animais);
        pedirParaOsAnimaisFazeremBarulho(animais);
    }

    private static void darDeComerAosAnimais(ArrayList<Animal> animais){
        for(Animal animal : animais){
            //Ja que qualquer animal deve comer (deve ter uma implementacao para comer()) nao precisamos saber qual implementacao de Animal foi usada no objeto atual "animal" para usar o metodo "comer()".
            animal.comer();
        }
    }

    private static void pedirParaOsAnimaisFazeremBarulho(ArrayList<Animal> animais){
        for(Animal animal : animais){
            //Por outro lado, quando queremos acessar um metodo particular de uma implementacao de Animal (que nao foi declarada na interface Animal) devemos fazer um certo tratamento.
            if(animal instanceof Cachorro){ //a palavra-chave "instanceof" nos ajuda a descobrir se um objeto e uma instancia de uma certa classe retornando um booleano. 
                
                ((Cachorro)animal).latir(); //como "latir" e um metodo presente apenas na implementacao "Cachorro" de Animal e devido ao objeto animal ser de um tipo generalizado e nao Cachorro, precisamos fazer um casting do objeto (se ele for uma instancia de cachorro) para Cachorro antes de conseguir usar o metodo "latir"

            }else if (animal instanceof Gato){
                ((Gato)animal).miar();
            }
        }
    }
}