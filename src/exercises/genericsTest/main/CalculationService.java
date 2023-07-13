package exercises.genericsTest.main;

import java.util.List;

public class CalculationService {

    public static  < T extends Comparable<T>> T max(List<T> list){
        T max= list.get(0);
        for (T obj:list) {
            if((-obj.compareTo(max)>0)){
                max=obj;
            }
        }
        return max;
    }
}
