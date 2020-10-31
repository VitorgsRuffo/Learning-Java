import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// class DeckOfCards declaration
public class DeckOfCards {
    private List<Card> list; // declare List that will store Cards
 
    // set up deck of Cards and shuffle
    public DeckOfCards() {
       Card[] deck = new Card[52];
       int count = 0; // number of cards
 
       // populate deck with Card objects
       for (Card.Suit suit : Card.Suit.values()) {
          for (Card.Face face : Card.Face.values()) {  
             deck[count] = new Card(face, suit);
             ++count;
          } 
       } 
 
       list = Arrays.asList(deck); // get List    
       Collections.shuffle(list);  // shuffle deck (ordena de maneira aleatoria == embaralha os elementos da lista)
    } 
 
    // output deck
    public void printCards() {
       // display 52 cards in four columns
       for (int i = 0; i < list.size(); i++) {
          System.out.printf("%-19s%s", list.get(i),
             ((i + 1) % 4 == 0) ? System.lineSeparator() : "");
       } 
    } 
}