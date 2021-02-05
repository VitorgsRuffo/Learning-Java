/*
Polimorfismo == varias formas.
    Como esse conceito aparece na orientacao a objetos do java?
    e.g, 1- Podemos referenciar um objeto de varias formas.
         2- Um metodo abstrato de uma superclasse pode ser implementado de maneiras diferentes em subclasses diferentes.
    
    Obs: polimorfismo em metodos != sobrecarga de metodos -> (metodos com mesmo nome, mas com assinatura diferentes).


O polimorfismo nos permite escrever programas que lidem com objetos de diferentes subclasses
de uma superclasse como se todos fosse objetos da quela superclasse.
    e.g, criar uma lista de Animal composta por objetos cujas classes são subclasses da superclasse abstrata Animal. Alem
    disso, tambem podemos percorrer a lista invocando um metodo abstrato previsto na superclasse que foi implementado por
    diferentemente por cada uma das subclasses dos objetos da lista.

    Isso facilita a extensao futura do programa, por exemplo, ao adicionar um novo tipo de animal no programa. Pois, nao 
    precisamos alterar o programa principal que lida com esses objetos ja que o programa considera todo diferente tipo de
    animal como sendo do tipo generico Animal e lida com todos da mesma forma. 

Coercao (casting) e operador "instanceof":
    Como visto em Interfaces e Classes Abstratas, em certas situaçoes temos um objeto que e uma instancia de uma certa classe 
    mas esta sendo considerado como sendo do tipo de uma Classe Abstrata/Interface. Nestes casos, para invocar um metodo 
    especifico de sua classe precisamos checar se o objeto realmente é uma instancia daquela classe (instanceof) para entao
    castarmos o objeto para aquela classe possibilitando, assim, a invocacao do metodo.


Em que situação utilizar uma Interface? e uma Classe Abstrata?
    Classes que implementam uma Interface são obrigados a implementar todos os metodos. (Classes podem implementar mais de uma interface)
    Classes que extendem uma Classe Abstrata herdam seus atributos e metodos concretos, alem de serem obrigadas a implementar os metodos abstratos. (Classes so podem extender uma Classe)

    Usar Interfaces:         quando precisamos que uma classe tenha mais de um pai, assim, implementamos mais de uma interface.
    
    Usar Classes Abstratas:  quando as subclasses tiverem a mesma implementaçao para um ou mais metodos vale mais a pena usar classes abstratas, pois, bastar implementarmos
                             esse metodo uma vez dentro da classe abstrata que todas as subclasses herdaram. Se usassemos interface neste caso estariamos repetindo codigo ao
                             ter que implementar um mesmo metodo da mesma maneira em subclasses diferentes.
*/