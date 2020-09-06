import java.util.Scanner;

public class Main{
   public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);

      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53); 

      System.out.printf("%s balance: $%f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%f%n%n", account2.getName(), account2.getBalance()); 

      
      System.out.print("Enter deposit amount for account1: "); 
      double depositAmount = input.nextDouble(); 
      System.out.printf("%nadding %f to account1 balance..%n%n", depositAmount);
      account1.deposit(depositAmount); 


      System.out.printf("%s balance: $%f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%f%n%n", account2.getName(), account2.getBalance()); 

      
      System.out.print("Enter deposit amount for account2: "); 
      depositAmount = input.nextDouble();
      System.out.printf("%nadding %f to account2 balance%n%n", depositAmount);
      account2.deposit(depositAmount); 
      
      
      System.out.printf("%s balance: $%f%n", account1.getName(), account1.getBalance()); 
      System.out.printf("%s balance: $%f%n%n", account2.getName(), account2.getBalance()); 
   } 
} 
