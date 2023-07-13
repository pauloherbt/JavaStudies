package javaFoundations.exercises.encapsulation;

public class Prisoner {
    //Fields
    private String name;
    private double height;
    private int sentence;
    private Cell cell;
    //Constructor
    public Prisoner(String name, double height, int sentence,Cell cell){
        this.setName(name);
        this.setHeight(height);
        this.setSentence(sentence);
        this.setCell(cell);
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void display(){
        System.out.println("Name: " + getName());
        System.out.println("Height: " + getHeight());
        System.out.println("Sentence: " + getSentence());
        System.out.println("Cell: " + getCell().getName());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getSentence() {
        return sentence;
    }

    public void setSentence(int sentence) {
        this.sentence = sentence;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
