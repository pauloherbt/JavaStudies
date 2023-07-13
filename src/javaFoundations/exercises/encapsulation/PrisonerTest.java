package javaFoundations.exercises.encapsulation;

public class PrisonerTest {
    public static void main(String[] args) {
        Cell cell= new Cell("Cell 4", false);
        Prisoner bubba = new Prisoner("Bubba", 2.08, 4,cell);
        bubba.display();
        cell.setOpen(418712);
        cell.setOpen(123);
        cell.setOpen(1234);

    }
}
