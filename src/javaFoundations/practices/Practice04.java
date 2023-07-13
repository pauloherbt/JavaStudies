package javaFoundations.practices;

import java.util.Random;
import java.util.Scanner;

public class Practice04 {
    /*Faca metodos para converter
    temperatura, calcuilar a hipotenusa
     e a soma de o giro de dois dados
     faca manipulacoes em uma string
     seguindo o arquivo guia*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a full name");
        String output=manipulateName(sc.nextLine());
        System.out.println("your name manipulated is "+output);
        System.out.println("temp in celsius :"+ fToC(32));
        System.out.println("hypotenuse :"+hypotenuse(4,3));
        System.out.println("soum of two dices is>: "+ roll());
    }

    public static String manipulateName(String fullName){
        String[] splittedNames = fullName.split(" ");
        int indexLastName= splittedNames.length-1;
        return splittedNames[indexLastName]+", "+splittedNames[0].toUpperCase().charAt(0)+".";
    }
    public static double fToC(double degreesF){
        return (double) 5/9*(degreesF-32);
    }
    public static double hypotenuse(int a, int b){
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    public static int roll(){
        Random rd= new Random();
        int soum=0;
        for (int i = 0; i <2 ; i++) {
            soum+=rd.nextInt(6)+1;
        }
        return soum;
    }
}
