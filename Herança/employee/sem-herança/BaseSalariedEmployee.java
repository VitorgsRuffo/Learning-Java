
//Funcionario que ganha ganha um salario base semanal + as comissoes de suas vendas semanais.
//Perceba que BaseSalariedEmployee em sua essencia é um Employee porem com uma caracteristica extra (salario base).
public class BaseSalariedEmployee {
	private final String firstName;
	    private final String lastName;
	    private final String socialSecurityNumber;
	    private double grossSales; //vendas brutas na semana
	    private double commissionRate; //porcentagem de comissao sobre as vendas
	    private double baseSalary; // salario base por semana.

	    public BaseSalariedEmployee(String firstName, String lastName, 
	        String socialSecurityNumber, double grossSales, 
	        double commissionRate, double baseSalary) {

            // if grossSales is invalid throw exception
            if (grossSales < 0.0) {
                throw new IllegalArgumentException("Gross sales must be >= 0.0");
            }     

            // if commissionRate is invalid throw exception
            if (commissionRate <= 0.0 || commissionRate >= 1.0) {
                throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
            }     

            // if baseSalary is invalid throw exception
            if (baseSalary < 0.0) {                                             
                throw new IllegalArgumentException("Base salary must be >= 0.0");
            }                                                                   

            this.firstName = firstName;
            this.lastName = lastName;
            this.socialSecurityNumber = socialSecurityNumber;
            this.grossSales = grossSales;
            this.commissionRate = commissionRate;
            this.baseSalary = baseSalary;
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



	   public void setBaseSalary(double baseSalary) {                         
	      if (baseSalary < 0.0) {                                             
	         throw new IllegalArgumentException("Base salary must be >= 0.0");
	      }                                                                   
	                                                                          
	      this.baseSalary = baseSalary;                                       
	   }                                                                      

	   public double getBaseSalary() {return baseSalary;}



	   public double earnings() {
	      return baseSalary + (commissionRate * grossSales);
	   } 

	   @Override
	   public String toString() {
	      return String.format(
	         "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", 
	         "base-salaried employee", firstName, lastName,
	         "social security number", socialSecurityNumber,
	         "gross sales", grossSales, "commission rate", commissionRate, 
	         "base salary", baseSalary);
	   }
}