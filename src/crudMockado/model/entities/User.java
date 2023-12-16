package crudMockado.model.entities;

import java.util.List;

public class User {
    private String name;
    private String email;
    private int age;
    private double height;
    private List<String> additionalAnswer;
    public User(String name, String email, int age, double height,List<String> additionalAnswer) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.height = height;
        this.additionalAnswer = additionalAnswer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<String> getadditionalAnswer() {
        return additionalAnswer;
    }

    public void setadditionalAnswer(List<String> additionalAnswer) {
        this.additionalAnswer = additionalAnswer;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }
}
