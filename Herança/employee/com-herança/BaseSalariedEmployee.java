
//BaseSalariedEmployee herdará os atributos/metodos que são a essencia de um Employee (pois BaseSalariedEmployee é um Employee) e implementara apenas aqueles que são particulares dele. 
public class BaseSalariedEmployee extends Employee{
	private double baseSalary; 

    public BaseSalariedEmployee(String firstName, String lastName, 
        String socialSecurityNumber, double grossSales, 
        double commissionRate, double baseSalary) {
            
        //Chamando explicitamente o construtor da classe pai (Employee) atraves do metodo especial super().
        super(firstName, lastName, socialSecurityNumber,             
            grossSales, commissionRate);                              
        //Obs: construtores não são herdados, cada classe tera o seu.

        if (baseSalary < 0.0) {                  
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }       

        this.baseSalary = baseSalary;
    }
	   

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {                  
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;                
    }

    public double getBaseSalary() {return baseSalary;}



    @Override //precisamos sobrescrever o metodo earnings que sera herdado da classe pai (Employee), pois, o earnings de um objeto BaseSalariedEmployee sera naturalmente diferente.
    public double earnings() {
        //acessando atributos herdados que são protected (commissionRate e grossSales): basta indicar os seus nomes.
        return baseSalary + (commissionRate * grossSales);                 
    }  

    @Override //sobrescrevemos o toString herdado da classe pai (Employee) pois precisamos incluir o baseSalary na string a ser retornada.
    public String toString() {
        //acessando atributos herdados que são private: precisamos usar os metodos getters (que são public) desses atributos.
        return String.format(                                           
            "%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f",           
            "base-salaried employee", this.getFirstName(), this.getLastName(),    
            "social security number", this.getsocialSecurityNumber(),              
            "gross sales", grossSales, "commission rate", commissionRate,
            "base salary", baseSalary);                                  
    } 
}
