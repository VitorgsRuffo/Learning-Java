public class PizzariaRuffo extends Pizzaria {

    @Override
    public Pizza pedirPizza(){
        
        if(){
            Pizza p = new imp1();
        }else if(){
            Pizza p = new imp2();
        }else{
            System.out.printf("Opcao de pizza invalida. Por favor tente novamente.\n");
        }

        p.abrirMassa();
        p.adicionarMolho();
        p.adicionarIngredientesDaCobertura();
        p.assar();
        p.cortar();

        return p;
    }
}