package javaFoundations.exercises.exceptions;

public class Calculator {
    public int add(int a, int b){
        return a+b;
    }
    public double divide(int a, int b) throws ArithmeticException{
        return (double) a /b;
    }
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(43, 79);
        System.out.println("Add Result: " + addResult);
        double divResult = 0;
        try{
             divResult= calc.divide(15, 0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Division Result: " + divResult);

    }
}
