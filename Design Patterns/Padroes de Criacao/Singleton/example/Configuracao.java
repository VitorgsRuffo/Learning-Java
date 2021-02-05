import java.util.Map;
import java.util.HashMap;


public class Configuracao {
    
    //a variavel que guardara o objeto unico é um membro de classe (nao faz parte o objeto que sera instanciado):
    private static Configuracao instancia;

    //O construtor privado impede o usuario de instanciar essa classe. Portanto, o unico modo de obter a instancia dessa classe é atraves do metodo getInstance, que garante que apenas uma instancia sera criada. 
    private Configuracao(){
        this.propriedades = new HashMap<String, String>();
        this.propriedades.put("time-zone", "America/Sao_Paulo");
        this.propriedades.put("currency-code", "BRL");
    }

    //metodo membro de classe: retorna a unica instancia do objeto para o usuario.
    public static Configuracao getInstance(){
        if(Configuracao.instancia == null)
            Configuracao.instancia = new Configuracao();
        

        return Configuracao.instancia;
    }



    //dados da instancia unica que sera gerada:
    private Map<String, String> propriedades;

    
    //metodo de instancia: o usuario vai chamar esse metodo apartir da instancia (retornada pelo getInstance)
    public String getPropriedade(String nodeDaPropriedade){
        return this.propriedades.get(nodeDaPropriedade);
    }

    //metodo de instancia: o usuario vai chamar esse metodo apartir da instancia (retornada pelo getInstance)
    public void setPropriedade(String nomeDaPropriedade, String valor){
        this.propriedades.put(nomeDaPropriedade, valor);
    }
}