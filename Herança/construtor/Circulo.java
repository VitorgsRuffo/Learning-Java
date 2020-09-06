public class Circulo extends Ponto {
    private double raio;

    //Construtores não são herdados.
    public Circulo(){
        //Não chamamos explicitamente o construtor da classe pai. Portanto, o seu construtor padrao sera chamado implicitamente. super()
    	//Caso não houvesse um construtor padrao (apenas um personalizado) teriamos um erro, pois, precisamos chamar o construtor da classe pai (seja o padrao ou personalizado).

        this.raio = 0;
    }

    public Circulo(double x, double y, double raio){
        super(x, y);
        this.raio = raio;
    }

    public double getRaio(){
        return raio;
    }

    @Override
    public String toString(){
        return String.format("x: %s%ny: %s%nraio: %s%n",
            this.getX(), this.getY(), raio) 
    }

}