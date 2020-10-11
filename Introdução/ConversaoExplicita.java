public class ConversaoExplicita{   
    public static void main(String[] args){
        //Conversao explicita entre tipos:
        int somaDasNotas = 55;
        int quantidadeDeNotas = 7;

        //Apesar de 55 dividido por 7 ser double, ao dividir inteiro por inteiro consideramos apenas a parte inteira do quociente.
        double media = somaDasNotas / quantidadeDeNotas; //o valor de media sera 7 e nao 7.8


        //Para conseguir o resultado correto devemos fazer a conversão explicita de um dos operandos para double: (coerção, do ingles casting, que é uma operacao unaria -> apenas um operando)
        media = (double) somaDasNotas / quantidadeDeNotas; //o java vai converter implicitamente o divisor para double ja que o dividendo agora passou a ser double. 
    
    
    }
}