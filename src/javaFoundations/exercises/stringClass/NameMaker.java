package javaFoundations.exercises.stringClass;


import java.util.Scanner;

public class NameMaker {

    public static void main(String args[]) {
        String firstName,middleName,lastname,fullName;
        String[] inputs=new String[3];
        String[] patterns={"first","middle","last"};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.printf("digite o %s name",patterns[i]);
            inputs[i]=sc.nextLine();
        }
        firstName=inputs[0];
        middleName=inputs[1];
        lastname=inputs[2];
        fullName=firstName+" "+middleName+" "+lastname;
        System.out.println(fullName);
    }

}
