package javaFoundations.exercises.mathClass;

public class BMI {
    public static void main(String[] args) {
        double peso=132.5,altura=62.5;
        final int CONSTANT =703;
        double BMI= Math.ceil(peso/Math.pow(altura,2)*CONSTANT); //ceil arredonda pra mais e floor pra menos
        System.out.println(BMI);
    }
}
