//Os setters(metodos modificadores) e getters(metodos de acesso) fornecem acesso á atributos privados.
//Com eles somos capazes de controlar o modo como esses atributos são malipulados.
//Ex: ao chamar o metodo setSalary é necessario passar um valor positivo e nao nulo.
//Obs: só devemos criar setters e getters para um atributo privado quando vemos que for necessario, eles não são uma regra.

public class Employee {

    private double salary;
    private String name;

    public void setSalary(double newSalary){
        if(newSalary<=0){
            System.out.println("Valor de salario invalido..");
        }else{
            this.salary = newSalary;
        }
    }

    public double getSalary(){
        return this.salary;
    }

    public String getName(){
        return this.name;
    }

    //Extra: metodos predicados.
    //Testa se uma condicao relacionada ao objeto desta classe e verdadeira ou falsa.
    public boolean isSalaryHigherThanTwoThousand(){
        if(this.salary > 2000.00){
            return true;
        }else{
            return false;
        }
    }
}