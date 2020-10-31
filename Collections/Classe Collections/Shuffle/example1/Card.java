import java.util.List;
import java.util.Arrays;
import java.util.Collections;

// class to represent a Card in a deck of cards
class Card {
   public enum Face {Ace, Deuce, Three, Four, Five, Six,
      Seven, Eight, Nine, Ten, Jack, Queen, King } 

   public enum Suit {Clubs, Diamonds, Hearts, Spades} 

   private final Face face; 
   private final Suit suit; 
   
   // constructor
   public Card(Face face, Suit suit) {
       this.face = face; 
       this.suit = suit; 
   } 
   
   // return face of the card
   public Face getFace() {return face;}

   // return suit of Card
   public Suit getSuit() {return suit;}

   // return String representation of Card
   public String toString() {
      return String.format("%s of %s", face, suit);
   } 
} 