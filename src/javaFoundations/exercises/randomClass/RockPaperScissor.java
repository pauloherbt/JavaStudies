package javaFoundations.exercises.randomClass;

import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {
        Random rd= new Random(); //seed util para testar codigos aleatorios
        for (int i = 0; i < 50; i++) {
            int n= rd.nextInt(4);
            if(n==0)
                System.out.println("pedra");
            if(n==1)
                System.out.println("papel");
            else
                System.out.println("tesoura");
        }
    }
}
