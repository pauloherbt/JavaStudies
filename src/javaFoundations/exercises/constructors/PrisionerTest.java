package javaFoundations.exercises.constructors;

public class PrisionerTest {
    public static void main(String[] args) {
        PrisionerStudent ps = new PrisionerStudent("Paulo",1.80,10);
        System.out.printf("height %f name: %s sentence: %d", ps.height,ps.name,ps.sentence);
    }
}
