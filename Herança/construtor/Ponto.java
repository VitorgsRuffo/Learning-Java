public class Ponto {

    private double x, y;

    //construtor padrão (sem parametros)
    public Ponto(){
        this.x = 0.0;
        this.y = 0.0;
    }

    //construtor personalizado (com parametros) (sobrecarga de metodos!)
    public Ponto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }
}