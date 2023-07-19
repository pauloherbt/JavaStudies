package exercises.programacaofuncional.ex2;

import exercises.programacaofuncional.ex1.Product;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        JFileChooser jf= new JFileChooser();
        jf.showOpenDialog(null);
        File file = jf.getSelectedFile();
        List<Employee> employees=new ArrayList<>();
        try(BufferedReader bf=new BufferedReader(new FileReader(file))){
            while(bf.ready()){
                String[] fields=bf.readLine().split(",");
                employees.add(new Employee(fields[0],fields[1], Double.parseDouble(fields[2])));
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("What's the salary?");
        double inSalary=sc.nextDouble();
        System.out.println("email list os employees who salary is higher than "+inSalary);
        employees.stream().filter(e->e.getSalary()>inSalary).map(Employee::getEmail).sorted().forEach(System.out::println);
        System.out.println("type a char");
        char chr=sc.next().charAt(0);
        System.out.println("Sum of salary of workers whose name begin with "+chr);
        double summatory=employees.stream()
                .filter(e-> e.getName().charAt(0)==chr)
                .map(Employee::getSalary)
                .reduce(0.0,(a, b) ->a+b);
        System.out.println(summatory);
        System.out.println(employees);
    }

}
