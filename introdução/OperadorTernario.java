public class OperadorTernario {
    public static void main(String[] args){
        //exemplo do seu uso:  if(){}else{}
        int a = 10;
        int b = 15;
        int maior;

        //(expressaoBooleana) ? retorno caso for true : retorno caso for falso.
        maior = (a>b) ? a : b;
        System.out.printf("O maior e %d\n", maior);
    }
}