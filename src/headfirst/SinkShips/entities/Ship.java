package headfirst.SinkShips.entities;

import headfirst.SinkShips.utils.RandomGenerator;

import java.util.ArrayList;

public class Ship {
    private String name;
    private ArrayList<Cell> cells;

    public Ship() {
        RandomGenerator rg= new RandomGenerator();
        this.cells=rg.mapShip();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Cell> getCells() {
        return cells;
    }
}
