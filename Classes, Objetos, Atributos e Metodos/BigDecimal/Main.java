//Quando queremos trabalhar com numeros de ponto flutuante e precisamos de exatidao nas casas decimais, usamos a classe java.math.BigDecimal
//O tipo primitivo double apresenta alguns problemas de exatidao, por isso foi criada a BigDecimal.

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args){

        //Imprecisão do tipo double:
            double num1 = 0.1;
            double num2 = 0.2;
            System.out.println(num1 + num2); //0.30000000000000004
            
            //System.out.println(2.00 - 1.1);
            //System.out.println(2.00 - 1.2);
            //System.out.println(2.00 - 1.3);
            //System.out.println(2.00 - 1.4);
            //System.out.println(2.00 - 1.5);
            //System.out.println(2.00 - 1.6);
            //System.out.println(2.00 - 1.7);
            //System.out.println(2.00 - 1.8);
            //System.out.println(2.00 - 1.9);
            //System.out.println(2.00 - 2);

            System.out.println(5.01 + 2.02); //7.029999999999999


        //Intanciando um objeto de BigDecimal: valueOf retorna um objeto do tipo BigDecimal com o valor passado como argumento.
            BigDecimal valor1 = BigDecimal.valueOf(5.01);
            BigDecimal valor2 = BigDecimal.valueOf(2.02);
            System.out.println(valor1.add(valor2)); //7.03

        //Tambem podemos instanciar com o construtor: nao é recomendado chamar o construtor passando um literal double pois pode gerar imprecisao. (use sempre valueOf que ira lidar com possiveis imprecisoes).
            valor1 = new BigDecimal(5.01);
            valor2 = new BigDecimal(2.02);
            System.out.println(valor1.add(valor2)); //7.029999999999999804600747665972448885440826416015625


        //Se formos usar o construtor é necessario passar o numero como string:
            valor1 = new BigDecimal("5.01");
            valor2 = new BigDecimal("2.02");
            System.out.println(valor1.add(valor2)); //7.03

        //Operacoes aritmeticas com BigDecimal: teremos metodos para fazer as operacoes basicas entre BigDecimals.
            
            valor1 = new BigDecimal("5.051");
            valor2 = BigDecimal.valueOf(2.05);
            
            //Adicao:
            System.out.println(valor1.add(valor2));
            
            //Subtracao:
            System.out.println(valor1.subtract(valor2));
            
            //Multiplicacao:
            System.out.println(valor1.multiply(valor2));

            //Divisao: 
            System.out.println(valor1.divide(valor2, 3, RoundingMode.UP)); //arredondar para baixo: RoundingMode.DOWN
            //Obs: quando o resultado der uma dizima periodica precisamos explicitamente indicar se queremos arredondar para cima ou para baixo. (Alem de indicar quantas casas decimais de precsao queremos - Segundo argumento)
    }
}