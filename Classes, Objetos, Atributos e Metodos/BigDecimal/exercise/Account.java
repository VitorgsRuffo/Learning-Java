import java.math.BigDecimal;

public class Account {
   private String name; 
   private BigDecimal balance = new BigDecimal("0.0"); 

   public Account(String name, double balance) {
      this.name = name;

      if(balance > 0.0){
         this.balance = BigDecimal.valueOf(balance); 
      }
     
   }

   public void deposit(double depositAmount) {      
      if (depositAmount > 0.0) { 
         balance = balance.add(BigDecimal.valueOf(depositAmount)); 
      }
   }

   public BigDecimal getBalance() {
      return balance; 
   } 

   public void setName(String name) {
      this.name = name; 
   } 

   public String getName() {
      return name; 
   } 
}