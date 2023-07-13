package javaFoundations.exercises.encapsulation;

public class Cell {
    private String name;
    private Boolean isOpen;
    private int PIN;

    public Cell(String name, Boolean isOpen) {
        this.name = name;
        this.isOpen = isOpen;
        PIN=1234;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getOpen() {
        return isOpen;
    }

    public void setOpen(int pin) {
        if (pin!=PIN){
            System.out.println("wrong PIN");
            return;
        }
        if (isOpen){
            isOpen=false;
            System.out.println("door closed");
        }
        else{
            isOpen=true;
            System.out.println("door opened");
        }
    }
}
