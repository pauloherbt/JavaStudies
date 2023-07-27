package javaprogrammerlearner.exercises.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericMethodClass {


    public static void printArray(List<?> array){
        array.forEach(System.out::println);
    }
    public static double listSummatory(List<? extends Number> array){ //pode obter o valor
        double soum=0;
        for (Number number : array) {
            soum+=number.doubleValue();
        }
        return soum;
    }
    public static void addNumbers(List<? super Integer>array) { // pode add dentro
        array.add(7);
        array.add(8);
    }

    public static void main(String[] args) {
        String[] strs = {"Paulo", "Zezin","Tia Carlinda"};
        List<Integer> intlist = new ArrayList<>(List.of(1,2,3,4,5,6));
        List<Aluno> listAluno = List.of(new Aluno("JoaoA", 10), new Aluno("PedroA",19));
        //printArray(List.of(strs));
        //printArray(intlist);
        //printArray(listAluno);
        System.out.println(listSummatory(intlist));
        addNumbers(intlist);
        System.out.println(listSummatory(intlist));
    }
}
