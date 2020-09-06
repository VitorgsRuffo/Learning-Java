//Estrutura de dados em Java: existem muitas EDs pré-definidas em Java que são chamadas de coleções (collections). Uma ArrayList é uma delas!
//ArrayList: lista dinamica de elementos do mesmo tipo (primitivo (wrapper class), ou de classe) dispostos aleatoriamente na memoria. 

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        //Declaração: ArrayList<TipoDeDadoPresenteNaLista> nomeDaLista = new ArrayList<TipoDeDadoPresenteNaLista>();
            ArrayList<String> pessoas = new ArrayList<String>();
            
            //Obs: não podemos usar tipos primitivos nestas listas. Caso for necessario criar uma lista de valores de tipos primitivos devemos usar a classe pre definida que representa esse tipo, os chamados wrappers (Integer, Float, Double, Character, Boolean)
                ArrayList<Integer> numeros = new ArrayList<Integer>();

        //add: adiciona um elemento ao fim da lista.
            pessoas.add("Vitor");
            pessoas.add("Gabriel");
            pessoas.add("Miguel");

            //Obs: podemos ainda adicionar um elemento em uma posicao especifica da lista:
                pessoas.add(1, "Rafael"); //add Rafael na segunda posicao da lista.
        
        //clear: remove todos os elementos da lista.
            pessoas.clear();

        //contains: retorna true se a lista possui o objeto indicado, senao retorna false.
            boolean isGabrielInTheList = pessoas.contains("Gabriel");
        
        //get: retorna o objeto da lista que possui o indice passado.
            int primeiraPessoa = pessoas.get(0);

        //indexOf: retorna o indice da primeira ocorrencia na lista do objeto passado.
            int indiceDoMiguel = pessoas.indexOf("Miguel");

        //remove: remove da lista a primeira ocorrencia do objeto passado. Ou, remove da lista o objeto que possui o indice especificado.
            pessoas.remove(1);
            pessoas.remove("Vitor"); 
            //sobrou apenas o Miguel na lista!
        
        //size: retorna a quantidade de elementos na lista.
            pessoas.size();

        //iterar na lista:

            //for:
            for (int i = 0; i < pessoas.size(); i++){
                System.out.println(pessoas.get(i));
            }

            //for aprimorado:
            imprimirLista(pessoas);
        
    }

    public static void imprimirLista(ArrayList<String> pessoas){
        for(String pessoa : pessoas){
            System.out.println(pessoa);
        }    
    }
}