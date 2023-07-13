package exercises.genericsTest.main;

import java.util.ArrayList;
import java.util.List;

public class Arrays <T>  {
    public Arrays(){
        List<String> stringList= java.util.Arrays.asList("Paulo","Herbert","Ripardo");
        List<Integer> intList= java.util.Arrays.asList(1,2,3,4,5,6,7,8);
        List<Object> destinyList= new ArrayList<>();
        copyArray(intList,destinyList);
        copyArray(stringList,destinyList);
        List<Object> destinyList2= new ArrayList<>();
        copyArray(destinyList,destinyList2);
        printar(destinyList2);
    }
    private void printar(List<?>products) {
        for (Object s: products) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
    private <T> void copyArray(List<? extends T> origin, List<? super T> destiny){
        for (T n: origin) {
            destiny.add(n);
        }

    }
}
