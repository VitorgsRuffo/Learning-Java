//Enum: tipo especial de classe que representa um grupo de atributos constantes - (um enum tambem pode conter metodos).

//Os  atributos definidos por um enum sao implicitamente static e final(nao deixa o valor do atributo ser alterado - o que da o efeito de constante para os atributos do enum)
//Nao podemos instanciar objetos de um enum.
//Enums nao podem dar extends em outra classe. (Uma classe enum extende implicitamente a classe java.lang.Enum)
//Enums podem implementar interfaces.
//Uso: usamos enums quando sabemos que um certo conjunto de valores nunca ira mudar ao longo do programa. (meses do ano, cores, quantidade de dias em cada mes do ano)

import java.util.Scanner;

public class Enumeration {
	
    private enum State {PR, RJ, SP, SC, RS};

    public static void main(String[] args){
        State myState = State.PR;
        System.out.printf("Vitor state is %s\n", myState);

        State emiliaState = State.SC;
        switch(emiliaState){
            case PR:
                System.out.println("Emilia state is Parana");
                break;
            case RJ:
                System.out.println("Emilia state is Rio");
                break;
            case SP:
                System.out.println("Emilia state is Sao paulo");
                break;
            case SC:
                System.out.println("Emilia state is Santa Catarina");
                break;
            case RS:
                System.out.println("Emilia state is Rio G. do Sul");
                break;
        }
        
        System.out.println("All states:");
        for(State state : State.values()) { //o tipo enum tem um metodo, chamado values(), que retorna um array com todas as constantes definidas por ele.
        	System.out.println(state);     	
        }

    }
}
