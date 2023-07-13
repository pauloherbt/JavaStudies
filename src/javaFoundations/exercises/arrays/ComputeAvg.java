package javaFoundations.exercises.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ComputeAvg {
    public static void main(String[] args) {
        int[] grades= new int[5];
        int soum=0;
        Scanner sc= new Scanner(System.in);
        for (int i = 0; i < grades.length ; i++) {
            try {
                grades[i]= sc.nextInt();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            soum+=grades[i];
        }
        System.out.println("average: "+(double)(soum/grades.length));
    }
}
