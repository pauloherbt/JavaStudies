package javaFoundations.exercises.javaMethods;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tip01 {
    public static void main(String[] args) throws FileNotFoundException {
        final double TAX = 1.2;
        Scanner sc = new Scanner(Tip01.class.getResourceAsStream("list.txt"));
        while(sc.hasNext()){
            System.out.print(sc.next());
            System.out.println(" "+String.format("%.2f",sc.nextDouble()*TAX));
        }

    }
}
