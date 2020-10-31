//O java nos fornece um bocado de estruturas de dados genéricos pré-definidas: Collections.
//O framework Collections define interfaces, a serem implementadas, dessas essas estruturas (coleções).
    //e.g, a interface de uma lista define as operações que podem ser exercidas sobre uma lista.

//A interface Collection é a primeira na hierarquia, da qual todas as outras derivam.
//Obs: as sub-interfaces herdam as operações de Collection e definem as suas especificas.    

    //Set: Uma implementação para Set (e.g, HashSet) é uma coleção que não contém elementos duplicados.

    //List: Uma implementação para List (e.g, ArrayList, LinkedList) é uma coleção ordenada que pode conter elementos duplicados.

    //Queue: Uma implementação para Queue é uma coleção que usa o conceito de fila.

//Interface Map: Uma implementação para Map é uma coleção que associa chaves a valores e não contém elementos duplicados. (Não deriva de Collection)


//-------------------------------------------------------------------------------------------------------------------------------------------------------//


//Relembrando Wrappers: Existem para que a gente possa definir tipos primitivos através de classes, e, com isso, manipular intancias desses tipos primitivos como objetos.
//Eles vão ser uteis, pois, as instancias das implementações das interfaces da hierarquia Collection guardarão ponteiros para objetos (tipos por referencia).
//Assim, se quisermos criar uma coleção de inteiros, devemos usar o respectivo wrapper Integer.

//Auto-boxing: conversão automatica de uma valor de um tipo primitivo em um objeto da classe wrapper correspondente. 
    //e.g, Integer num = 10; (O proprio java cuida da parte de instanciamento do objeto Integer com o valor 10 e atribui o endereço desse novo objeto para a variavel num)

//Auto-unboxing: conversão automatica de um objeto de uma classe wrapper para o valor do tipo primitivo correspondente.
    //e.g Integer number = new Integer(10);
    //    int n = number; //(o proprio java extrai o valor do objeto apontado por number e atribui a variavel n)

 
//-------------------------------------------------------------------------------------------------------------------------------------------------------//


//Interface Collection: inteface que inclui metodos essenciais de uma estrutura coleção como adicionar, excluir, comparar. Ela é a interface pai de todas as coleções.
//         X
//Classe Collections: oferece métodos estaticos e genericos que realizam operações sobre coleções que implementam a interface Collection ou uma de suas sub-interfaces. (e.g, pesquisa, ordenação, ...)
//Obs: esses metodos sao genericos pois podemos passar qualquer coleção como sendo do tipo Collection ja que a sua implementação implementa Collection ou uma de suas sub-interfaces. (Polimorfismo)