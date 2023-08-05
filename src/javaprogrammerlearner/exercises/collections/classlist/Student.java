package javaprogrammerlearner.exercises.collections.classlist;

import java.util.ArrayList;
import java.util.Collections;

public class Student {


    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        addStudent(studentNames);
        displayStudent(studentNames);
        Collections.sort(studentNames);
        displayStudent(studentNames);
    }
    public static void addStudent(ArrayList<String> studentNames){
        studentNames.add("Lucas");
        studentNames.add("Carlos");
        studentNames.add("Pedro");

    }
    public static void displayStudent(ArrayList<String> studentNames){
        for (String studentName : studentNames) {
            System.out.println(studentName);
        }
    }
}
