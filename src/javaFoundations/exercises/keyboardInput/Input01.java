package javaFoundations.exercises.keyboardInput;

import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String out = JOptionPane.showInputDialog("say my name:");
        System.out.println(out);
        int a = Integer.parseInt(out);
        System.out.println(a+1);
        int outInt = Integer.parseInt(JOptionPane.showInputDialog("digite um int"));
        System.out.println(outInt);
        String[] strings = {"Pokemon 1", "Pokemon2","Pokemon 3"};
        JOptionPane.showInputDialog(null,"Digite algo", "Nova janela", JOptionPane.WARNING_MESSAGE,null,strings, strings[2]);
        //Parse the input as an int.
        //Print its value +1



        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.


    }
}
