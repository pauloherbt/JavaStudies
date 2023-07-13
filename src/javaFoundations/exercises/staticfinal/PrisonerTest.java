package javaFoundations.exercises.staticfinal;

public class PrisonerTest {
    public static void main(String[] args){
        Cell cellA1 = new Cell("A1", false, 1234);
        Cell cellB1 = new Cell("B1", false, 1234);
        Cell cellC1 = new Cell("C1", false, 1234);
        Cell cellD1 = new Cell("D1", false, 1234);

        Prisoner bubba = new Prisoner("Bubba", 2.08, 4, cellA1);
        Prisoner jubba= new Prisoner("jubba",2.50,4,cellB1);
        Prisoner lubba= new Prisoner("lubba",2.50,4,cellC1);
        Prisoner pubba= new Prisoner("pubba",2.50,4,cellD1);
        bubba.display();
        jubba.display();
        lubba.display();
        pubba.display();
        System.out.println(Prisoner.getPrisonerCount());


}

}
