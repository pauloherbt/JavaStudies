package javaFoundations.exercises.keyboardInput;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner sc= new Scanner(System.in);
        int soum=0;
        for (int i = 0; i < 3; i++) {
            soum+=sc.nextInt();
        }
        //Find and print the sum of three integers entered by the user
        System.out.println(soum);
        //Remember to close the Scanner
        sc.close();
    }
}
