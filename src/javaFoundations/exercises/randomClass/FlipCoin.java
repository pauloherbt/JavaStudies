package javaFoundations.exercises.randomClass;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {

        // 50% chance heads, 50% chance tails
        Random rand = new Random();
        for(int i=0;i<100;i++){
            double chance = rand.nextDouble()*10; //aumentar a precisao de 0 a 1 vai de 0 a 10
            System.out.printf("%f:%s\n", chance,chance>0.5 ? "superior":"inferior");
        }
        //em um intervalo n>1 faça o argumento ser (teto-n+1) e some n fora
        int teto=50;int inicio=40;
        for (int i = 0; i <10 ; i++) {
            System.out.println(rand.nextInt(teto-inicio+1)+inicio);
        }

    }
}
