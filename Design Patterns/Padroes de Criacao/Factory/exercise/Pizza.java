import java.util.Thread;

public abstract class Pizza {
    
    public void abrirMassa(){
        System.out.println("Abrindo massa...");
        Thread.sleep(2000);
    }

    public void adicionarMolho(){
        System.out.println("Adicionando molho...");
        Thread.sleep(2000);
    }

    public abstract void adicionarIngredientesDaCobertura();

    public void assar(){
        System.out.println("assando...");
        Thread.sleep(4000);
    }
    public void cortar(){
        System.out.println("cortando...");
        Thread.sleep(2000);
    }

}