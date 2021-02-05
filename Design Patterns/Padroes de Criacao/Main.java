/*
    Padroes de Criaçao: solucionam problemas relacionados ao instanciamento de objetos. 
    Com esses padroes somos capazes de criar sistemas independentes de como seus 
    objetos sao criados, compostos e representados.


        - Padrao Factory: esse padrao facilita que mudemos a implementação de interface da qual um objeto é instanciado. (i.e, Type obj = new TypeImplementation1())
                          Para isso criaremos uma classe (Factory) que tera um metodo responsavel pelo intanciamento de objetos das varias implementacoes de uma certa interface.
                          Assim o usuario nao tem contato direto com o instanciamento do objeto, tornando mais facil a mudança da implementacao de interface da qual o objeto é instanciado.


        - Padrao Singleton: esse padrao limita o instanciamento de uma certa classe. Tal classe pode ser instanciada apenas uma vez.
                            Alem disso, o padrao permite que este objeto unico seja globalmente acessivel.
*/

