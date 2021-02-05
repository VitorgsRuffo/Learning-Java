//Interface Map: é um tipo de estrutura que nos permite guardar um conjunto de pares chave-valor, onde a chave, nao precisa ser um inteiro como nas listas, por exemplo.
//e.g, lista de pessoas (valor) cujo indice (chave) é o seu CPF.
//Implementacao de Map: HashMap.

import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main { //Programa que vai receber uma frase do usuario e vai contar quantas vezes cada palavra aparece.
                    //Para isso criaremos um Map que vai associar cada palavra com a sua quantidade de apariçoes.

    public static void main(String[] args) {
        //Ao criar um Map devemos indicar o tipo das chaves e dos valores desse map: <KeyType, ValueType> 
        Map<String, Integer> myMap = new HashMap<>(); //A implementacao de Map desse exemplo e a HashMap.            

        createMap(myMap); 
        displayMap(myMap); 
    } 

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        //Quebrando a string em varias palavras (tokens):
        String[] tokens = input.split(" ");
                
        
        for (String token : tokens) { //For each token in tokens, do:
            
            String word = token.toLowerCase(); 
                    
            if (map.containsKey(word)) { //o map contem o palavra atual ?
                
                int count = map.get(word); //get: passamos uma chave e ele retorna o valor associado aquela chave. 
                map.put(word, count + 1);  //put: passamos uma chave e o valor que queremos associar aquela chave.  
            } 
            else {
                map.put(word, 1); // se a chave (palavra) ainda nao esta no mapa, adicionamos ela ao mapa associando a com 1 (sua contagem atual). 
            } 
        } 
    } 
    
    
    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); //keySet: retorna um Set contendo todas as chaves do Map.

        //Criamos um TreeSet (que implementa SortedSet) passando o Set das chaves, obtendo assim, um conjunto
        //ordenado das chaves do map.
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (String key : sortedKeys) { //For each key in sortedKeys, do:
            System.out.printf("%-10s%10s%n", key, map.get(key)); //printamos a chave o valor associado a ela.
        }
        
        System.out.printf(
            "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    } 
} 