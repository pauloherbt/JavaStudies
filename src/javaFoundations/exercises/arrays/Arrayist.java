package javaFoundations.exercises.arrays;

import java.util.ArrayList;
import java.util.ListIterator;

public class Arrayist {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        array.add("Amy");
        array.add("Bob");
        array.add("Cindy");
        array.add("david");
        for (String names: array) {
            System.out.println(names);
        }
        ListIterator<String> iterator= array.listIterator(2);
        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }
        array.add(0,"Nick");
        array.add(1,"mike");
        array.remove(3);
        for (String name : array) {
            System.out.println(name);
        }
    }

}