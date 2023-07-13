package javaFoundations.exercises.overloadingMethods;

public class Prisoner {
    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public Prisoner(String name, double height, int sentence){
        this.name = name;
        this.height = height;
        this.sentence = sentence;
    }
    public Prisoner(){

    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }
    public void print(){
        System.out.println("Name: "+name+"Height: "+height+" sentence: "+sentence);
    }
    public void print(boolean condition){
        if(condition)
            think();
        else
            print();
    }
}
