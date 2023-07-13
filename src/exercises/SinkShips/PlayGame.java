package exercises.SinkShips;

import exercises.SinkShips.entities.Board;
import exercises.SinkShips.entities.Cell;
import exercises.SinkShips.entities.Columns;
import exercises.SinkShips.entities.Ship;

import java.util.Scanner;

public class PlayGame {
    private Board board;

    public PlayGame() {
        this.board = new Board();
        printBoard();
        play();
    }

    public void play() {
        int count = 0;
        do {
            Cell matchCell = searchPosition(readData());
            count++;
            System.out.println(verifyShip(matchCell));

        } while (exist());
        System.out.println("All startups are dead!\n Took enough " + count + " guesses");
    }

    private void printBoard() {
        int count = 0;
        for (Cell cell : board.getCells()) {
            System.out.print(cell.toString() + " ");
            count++;
            if (!(count < 7)) {
                System.out.println();
                count = 0;
            }
        }
    }

    private boolean exist() {
        for (Cell cell : board.getCells()) {
            if (cell.getShip() != null) return true;
        }
        return false;
    }

    private Cell readData() {
        Scanner sc = new Scanner(System.in);
        String posX="";
        String posY="";
        boolean pass=false;
        do {
            try {
                String move = sc.nextLine().toUpperCase();
                posY = move.substring(0, 1);
                posX = move.substring(1, 2);
                if (Integer.parseInt(posX)>6){
                    throw new Exception();
                }
                for (Columns columns: Columns.values()) { //verifico se a posY digitada pelo usuario esta no intevalo (A-G)
                    if(columns.equals(Columns.valueOf(posY))){
                        return new Cell(Integer.parseInt(posX), Columns.valueOf(posY));
                    }
                }
                pass=true;

            } catch (Exception e){
                System.out.println("Error please insert the correct position");
                pass=false;
            }
        }while(!pass);

        return null;
    }

    private Cell searchPosition(Cell cell) {
        for (Cell boardCell : board.getCells()) {
            if (cell.getPositionX() == boardCell.getPositionX() && cell.getPositionY() == boardCell.getPositionY()) {
                return boardCell;
            }
        }
        return null;

    }

    private String verifyShip(Cell cell) {
        String state = "miss";
        if (cell != null)
            if (cell.getShip() != null) {
                state = "hit";
                Ship aux = cell.getShip();
                cell.setShip(null);
                for (Cell boardCell : board.getCells()) {
                    if (aux == boardCell.getShip()) {
                        return state;
                    }
                }
                return state += " You sunk " + aux.getName();
            }
        return state;
    }
}
