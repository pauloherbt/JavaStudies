package exercises.SinkShips.entities;

import java.util.ArrayList;

public class Board {
    private ArrayList<Cell> cells;
    private final int SIZE= 7;

    public Board() {
        mapCell();
        positionShips();
    }

    private void mapCell() {
        this.cells = new ArrayList<>();
        for (Columns column:Columns.values()){
            for (int i = 0; i < SIZE ; i++) {
                this.cells.add(new Cell(i,column));
            }
        }
    }
    private void positionShips(){
        Ship[]ships= new Ship[3];
        String[] names= {"Sheczy","Silçyc","moore"};
        for (int i = 0; i < ships.length; i++) {
            ships[i]=new Ship();
            ships[i].setName(names[i]);
        }
        for (Cell cell : cells) {
            for (Ship ship : ships) {
                for (Cell shipCell : ship.getCells()) {
                    if (cell.getPositionX()==shipCell.getPositionX()&&cell.getPositionY()==shipCell.getPositionY()){
                        cell.setShip(ship);
                    }
                }

            }

        }

    }

    public ArrayList<Cell> getCells() {
        return cells;
    }
}
