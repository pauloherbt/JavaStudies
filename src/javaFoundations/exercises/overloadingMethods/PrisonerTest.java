package javaFoundations.exercises.overloadingMethods;

public class PrisonerTest {
    public static void main(String[] args){
        Prisoner p01 = new Prisoner("Bubba", 2.08, 4);
        p01.print();
        p01.print(true);
    }
}
