import java.util.Comparator;

//Implementação de Comparator que nos fornece um metodo
//para a comparação entre duas instancias de Time2
public class TimeComparator implements Comparator<Time2> {

    //Uma implementação de Comparator<Time2> deve implementar o metodo
    //compare que é chamado, por exemplo, pelo sort quando ele
    //esta ordenando uma lista objetos do tipo Time2.
    @Override
    public int compare(Time2 time1, Time2 time2) {

        //Devemos implementar esse metodo de modo que ele retorne
        //um valor negativo se time1 < time2, 
        //ou um valor nulo se time1 == time2,
        //ou um valor positivo se time1 > time2


        int hourDifference = time1.getHour() - time2.getHour();
            
        if (hourDifference != 0) { // test the hour first
            return hourDifference; 
        }
            
        int minuteDifference = time1.getMinute() - time2.getMinute(); 
            
        if (minuteDifference != 0) { // then test the minute
            return minuteDifference;
        }
            
        int secondDifference = time1.getSecond() - time2.getSecond(); 
        return secondDifference; 
    } 
}