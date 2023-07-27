package javaprogrammerlearner.exercises.generics;

public class Aluno extends Number {
    String name;
    Integer idade;

    public Aluno(String name, Integer idade) {
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return idade;
    }
}
