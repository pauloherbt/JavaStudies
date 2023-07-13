package javaFoundations.practices;

import java.util.Scanner;

public class Practice05 {

    public static void main(String[] args) {
        Practice05 teste = new Practice05();
        //teste.validatePin();
        //teste.showMultiples(7);
        //teste.createRectangle(10,10);
        teste.createTriangle(7);
    }
    //01 Validate pin
    public void validatePin(){
        Scanner scanner = new Scanner(System.in);
        int PIN=123;
        System.out.println("Type a pin");
        int pin=scanner.nextInt();
        while (pin!=PIN){
            System.out.println("FAIL!\ntype a correct pin");
            pin=scanner.nextInt();
        }
        System.out.println("PIN CORRETO");
    }
    public void showMultiples(int n){
        for (int i = 1; i <= 12; i++) {
            System.out.println(n+"x"+i+" = "+(n*i));
        }
    }
    public void createRectangle(int h,int w){
        for (int i = 1; i <=h ; i++) {
            for (int j=1;j<=w;j++) {
                if (i == 1 || i == h || j == 1 || j == w)
                    System.out.printf("*");
                else
                    System.out.printf(" ");
            }
            System.out.println();
        }
    }
    public void createTriangle(int h){
        for (int i = 1; i <=h ; i++) {
            for (int j=1;j<=i;j++){
                if(j>1&&j<i&&i!=h) //caso em que ocorre espacos
                    System.out.printf(" ");
                else
                    System.out.printf("*");
            }
            System.out.println("");
        }
    }
}
