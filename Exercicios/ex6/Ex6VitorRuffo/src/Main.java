import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class Main { 

    public static void main(String[] args) {
        Map<Character, Integer> myMap = new HashMap<>();      

        createMap(myMap); 
        displayMap(myMap); 
    } 

    private static void createMap(Map<Character, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a setence:");
        String sentence = scanner.nextLine()
                                 .replaceAll("\\p{Punct}","")
                                 .replaceAll(" ", "");
        
        char[] letters = sentence.toCharArray();
    
        for (char letter : letters) { 
            
            Character objectLetter = letter; //auto-boxing.
                    
            if (map.containsKey(objectLetter)) { 
                
                int count = map.get(objectLetter);  
                map.put(objectLetter, count + 1);    
            }
            else {
                map.put(objectLetter, 1);  
            } 
        } 
    } 
    
    
    private static void displayMap(Map<Character, Integer> map) {
        Set<Character> keys = map.keySet(); 

        TreeSet<Character> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        for (Character key : sortedKeys) { 
            System.out.printf("%-10s%10s%n", key, map.get(key)); 
        }
        
        System.out.printf(
            "%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    } 
} 