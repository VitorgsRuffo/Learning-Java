
//Como sabemos toda classe sera sub-classe da classe pai de todas, a Object: esse "extends Object" apenas deixa isso explicito.

//Funcionario que ganha apenas das comissoes de suas vendas semanais.
public class Employee extends Object {
	   private final String firstName;                        
	   private final String lastName;                         
	   private final String socialSecurityNumber;             
	   private double grossSales; //vendas brutas na semana
	   private double commissionRate; //porcentagem de comissao sobre as vendas
	
	   public Employee(String firstName, String lastName,
			String socialSecurityNumber, double grossSales, 
			double commissionRate) {
			//Sempre ha uma chamada implicita ao constructor padrao da classe pai desta classe.
				
			// if grossSales is invalid throw exception
			if (grossSales < 0.0) {
				throw new IllegalArgumentException("Gross sales must be >= 0.0");
			}   
		
			// if commissionRate is invalid throw exception
			if (commissionRate <= 0.0 || commissionRate >= 1.0) {
				throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
			}   
		
			this.firstName = firstName;                                    
			this.lastName = lastName;                                    
			this.socialSecurityNumber = socialSecurityNumber;         
			this.grossSales = grossSales;
			this.commissionRate = commissionRate;
	   } 
	
	   public String getFirstName() {return firstName;}
	
	   public String getLastName() {return lastName;}
	
	   public String getSocialSecurityNumber() {return socialSecurityNumber;}
	


	   public void setGrossSales(double grossSales) {
	      if (grossSales < 0.0) {
	         throw new IllegalArgumentException("Gross sales must be >= 0.0");
	      }
	
	      this.grossSales = grossSales;
	   } 

	   public double getGrossSales() {return grossSales;}
	


	   public void setCommissionRate(double commissionRate) {
	      if (commissionRate <= 0.0 || commissionRate >= 1.0) {
	         throw new IllegalArgumentException(
	            "Commission rate must be > 0.0 and < 1.0");
	      }
	
	      this.commissionRate = commissionRate;
	   } 
	
	   public double getCommissionRate() {return commissionRate;}
	


	   public double earnings() {return commissionRate * grossSales;}
	
	   @Override //@Override indica que este metodo sobrescreve um metodo da classe pai (super classe)
	   //retorna a representaçao em string do objeto employee que chamou este metodo.      
       public String toString() {                                           
	      return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f",     
	         "employee", firstName, lastName,                    
	         "social security number", socialSecurityNumber,                
	         "gross sales", grossSales,                                     
	         "commission rate", commissionRate);                            
	   }                                                                    
} 