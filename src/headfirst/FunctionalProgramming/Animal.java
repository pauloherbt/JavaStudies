package headfirst.FunctionalProgramming;

public class Animal {
    String name;
    public void falar(){
        System.out.printf("%s falando", name);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
