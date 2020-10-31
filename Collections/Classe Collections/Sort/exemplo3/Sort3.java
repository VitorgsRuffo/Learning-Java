
/*O metodo sort é funciona com base em comparações.
Ele conhece a maneira correta de se comparar objetos de 
classes pré-definadas como Integer ou String. 

Mas e se quisermos ordenar uma lista de objetos cuja classe nós mesmos definimos?
- e.g, Temos uma lista de Estudantes e queremos ordena-los por numero de matricula.
- O sort nao vai saber como comparar tais objetos Estudante para poder ordena-los.

Devemos entao auxiliar o sort mostrando exatamente como comparar tais objetos. 
Para isso implementamos a interface Comparator e o metodo compare, e passamos uma
intancia dessa implementaçao para o metodo sort.
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Sort3 {
    public static void main(String[] args) {

        //Estamos trabalhando com uma lista de tempos:
        List<Time2> list = new ArrayList<>(); 

        list.add(new Time2(6, 24, 34));
        list.add(new Time2(18, 14, 58));
        list.add(new Time2(6, 5, 34));
        list.add(new Time2(12, 14, 58));
        list.add(new Time2(6, 24, 22));
        
        System.out.printf("Unsorted array elements:%n%s%n", list);

        //Vamos ordenar essa lista. Como é uma lista de um tipo de dados que o java nao conhece devemos instanciar
        //uma implementaçao da interface Comparator que "ensina" pro sort como comparar dois objetos de tempo. Essa 
        //instancia deve ser passada como parametro para o sort.         
        Collections.sort(list, new TimeComparator());

        System.out.printf("Sorted list elements:%n%s%n", list);
    } 
} 