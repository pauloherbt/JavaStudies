package javaFoundations.exercises.constructors;

public class PrisionerStudent {
    //Fields
    public String name;
    public double height;
    public int sentence;

    //Constructor
    public PrisionerStudent(String name, double height, int sentence){
        System.out.println("esse e o contrusctor");
        this.name=name;
        this.height=height;
        this.sentence=sentence;
    }

    //Methods
    public void think(){
        System.out.println("I'll have my revenge.");
    }

}
