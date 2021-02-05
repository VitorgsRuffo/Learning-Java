/*- Padroes compormentais: situaçoes onde temos que distribuir responsabilidades (papeis de atuaçao dentro do programa) entre objetos.
    - e.g, existe a situaçao dentro de um sistema onde alguem publica (papel do publicador) alguma noticia e um outro alguem é notificado (papel do recebedor)

    - Com esses padroes buscamos facilitar a comunicacao (com metodos) entre esses objetos que seja de facil manutençao, extensão, mudança...
      Para isso o uso de interfaces e classes abstratas se faz necessario para causar fraco acoplamento e dependencia entre as diferentes classes.


    - Padrao Observer:  padrao que lida com o problema de manter objetos (Observers) "cientes" ou notificados da ocorrencia de um evento/atualização em um certo objeto especifico (Subject). 
                        O Subject é o responsavel por notificar os Observers da ocorrencia de atualizações.
                        (Modelo publisher/subscriber: o sub se inscreve no pub. O pub notifica os subs inscritos quando atualizacoes ocorrerem)



    - Padrao Template:  um metodo principal (TemplateMethod) em uma classe abstrata resolve um certo problema, este metodo é um esqueleto 
                        da resolucao do problema. Certos passos (PrimitiveOperations) dentro desse metodo são delegados a subclasse. Para 
                        isso, esses passos são realizados por um metodo abstrato que sera implementado por essa subclasse. Assim a 
                        subclasse decide como ela vai resolver aquele subproblema. (Isso facilita a modificação nas implementaçao 
                        dos passos de um algoritmo). Assim, as diferentes subclasses podem resolver esse subproblema de maneiras
                        diferentes, culminando em varios algoritmos que possuem o mesmo esqueleto mas com diferentes soluçoes
                        para certos subproblemas.



*/