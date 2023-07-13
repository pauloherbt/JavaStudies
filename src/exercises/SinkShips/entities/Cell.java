package exercises.SinkShips.entities;

public class Cell {
    private int positionX;
    private Columns positionY;
    private Ship ship;

    public Cell(int positionX, Columns positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }
    public Columns getPositionY() {
        return positionY;
    }

    @Override
    public String toString() {
        if(ship!=null)
            return positionY.toString()+positionX+" "+ship.getName();
        return positionY.toString()+positionX;
    }

    public Ship getShip() {
        return ship;
    }

    public void setShip(Ship ship) {
        this.ship = ship;
    }
}
