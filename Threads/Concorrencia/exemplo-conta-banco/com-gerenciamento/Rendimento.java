import java.util.ArrayList;

//Codigo para uma thread que executara uma tarefa de aplicar taxa de rendimento em contas de banco.
public class Rendimento implements Runnable {
    private ArrayList<Conta> contas;
    private double taxa;

    Rendimento(ArrayList<Conta> contas, double taxa){
        this.contas = contas;
        this.taxa = taxa;
    }

    @Override
    public void run(){
        for(Conta conta : this.contas){
            conta.aplicarTaxaDeRendimento(this.taxa);
        }
    }

}