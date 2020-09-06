public class Main {
    public static void main(String[] args){
        Circulo c1 = new Circulo();
        System.out.printf("Informacoes c1:%n%s%n", c1);

        Circulo c2 = new Circulo(100.00, 50.00, 10.0);
        System.out.printf("Informacoes c2:%n%s%n", c2);
    }
}