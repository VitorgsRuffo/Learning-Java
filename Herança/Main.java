//Ponto importante: é ideal a reutilização de codigo e esse é um dos principais objetivos da orientaçao a objetos.
//Um dos mecanismos de reutilização de codigo da orientaçao a objetos é a herança.

//A herança: basicamente definimos uma classe mais geral (superclasse ou classe pai) que tera classes (sub-classe ou classe filha) que herdarão seus metodos e atributos public ou protected. Isso acontece, pois, as classes filhas são, em sua essencia, iguais a classe pai porem com algumas diferenças extras.
    //ex: Superclasse: Pessoa, Sub-classes: Policial, Pedreiro, Padeiro, Medico
    
    //Private: atributos/metodos private não sao herdados. Ele sao acessiveis apenas dentro da classe que os define.
    //Protected: possibilita o acesso do atributo/metodo pela propria classe, por subclasses ou por classes do mesmo pacote. 

//Object: é a classe pré-definida que é pai de todas as classes do Java. Todas as classes, que você criou ou que ja fazem parte do Java, herdam atributos e metodos dessa classe pai Object.


//Exemplo de herança:

    //Pessoa
    public class Pessoa {
        //Classe pai.
    }

    //Aluno (é uma) Pessoa
    public class Aluno extends Pessoa {
        //Aluno herda os atributos/metodos public e protected de Pessoa.
    }

    //Servidor (é uma) Pessoa
    public class Servidor extends Pessoa {
        //Servidor herda os atributos/metodos public e protected de Pessoa.
    }

    //Professor (é um) Servidor
    public class Professor extends Servidor {
        //Professor herda os atributos/metodos public e protected de Servidor (e implicitamente os de Pessoa tambem).
    }

    //Obs: pra herança fazer sentido no nosso codigo a classe filha deve ser uma variaçao da classe pai. Ou seja, é igual a classe pai na sua essência porém com algumas particularidades extras.