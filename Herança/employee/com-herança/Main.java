
public class Main {
	public static void main(String[] args) {
		
	    Employee employee = new Employee(
	     "Sue", "Jones", "222-22-2222", 10000, .06);       
	  
        System.out.println("Employee information obtained by get methods:");

        System.out.printf("%n%s %s%n", "First name is",
            employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is", 
            employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is", 
            employee.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", 
            employee.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
            employee.getCommissionRate());
        
        employee.setGrossSales(5000);  
        employee.setCommissionRate(.1);
        
        System.out.printf("%n%s:%n%n%s%n",                                
                "Updated employee information obtained by toString", employee); //ao passar somente o nome do objeto para uma funçao de print ela, em sua implementacao interna, chamara a toString desse objeto para obter uma string que represente as caracteristicas do objeto, para entao ela poder printar isso.
                                                                                //a toString padrao herdada da classe pai Object por Employee foi sobrescrita e portanto a toString de um objeto Employee é, agora, diferente.

        BaseSalariedEmployee employee2 = new BaseSalariedEmployee(                
            "Bob", "Lewis", "333-33-3333", 5000, .04, 300);
        
        System.out.println("");
        System.out.printf(
            "Employee information obtained by get methods:%n");
        System.out.printf("%s %s%n", "First name is",
            employee2.getFirstName());
        System.out.printf("%s %s%n", "Last name is", 
            employee2.getLastName());
        System.out.printf("%s %s%n", "Social security number is", 
            employee2.getSocialSecurityNumber());
        System.out.printf("%s %.2f%n", "Gross sales is", 
            employee2.getGrossSales());
        System.out.printf("%s %.2f%n", "Commission rate is",
            employee2.getCommissionRate());
        System.out.printf("%s %.2f%n", "Base salary is",
            employee2.getBaseSalary());

        employee2.setBaseSalary(1000); 
        
        System.out.printf("%n%s:%n%n%s%n", 
            "Updated employee information obtained by toString", 
            employee2.toString());
	}
}