public class Main {
    public static void main(String[] args){
        Configuracao configuracao =
            Configuracao.getInstance();


        System.out.println(configuracao.getPropriedade("time-zone"));
        System.out.println(configuracao.getPropriedade("currency-code"));
   
        configuracao.setPropriedade("currency-code", "USD");
        System.out.println(configuracao.getPropriedade("currency-code"));
    }
}