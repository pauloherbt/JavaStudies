package exercises.SinkShips.utils;

import exercises.SinkShips.entities.Cell;
import exercises.SinkShips.entities.Columns;

import java.security.SecureRandom;
import java.util.ArrayList;

public class RandomGenerator {
    private SecureRandom sr= new SecureRandom();
    private Columns columns;
    public ArrayList<Cell> mapShip(){
        ArrayList<Cell> cells= new ArrayList<>();
        int positionX=sr.nextInt(7);
        Columns positionY= Columns.values()[sr.nextInt(7)];
        if(positionX<5){
            for (int i = 0; i <=2 ; i++) {
                cells.add(new Cell(positionX+i,positionY));
            }
        }
        if(!(positionX<5)){
            for (int i = 0; i <=2 ; i++) {
                cells.add(new Cell(positionX-i,positionY));
            }
        }
        return cells;
    }
}
