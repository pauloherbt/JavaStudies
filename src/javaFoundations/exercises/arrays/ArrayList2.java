package javaFoundations.exercises.arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers= new ArrayList<>();
        for (int i = 0; i <100 ; i++) {
            numbers.add(i);
        }
        ListIterator listIterator = numbers.listIterator();
        while (listIterator.hasNext()){
            System.out.print(listIterator.next()+" ");
        }
        for (int i=0;i<numbers.size();i++) {
            if(numbers.get(i)%2==0)
                numbers.remove(i);
        }
    }
}
