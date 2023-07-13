package javaFoundations.exercises.keyboardInput;


import javax.swing.*;

public class Input02 {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,
                "apenas uma mensagem aqui",
                "titulo modificado",
                1);

        String input1 = (String)JOptionPane.showInputDialog(null,
                "Is this a question?",
                "oh o titulo",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                null,
                "aqui e pra ser a entrada padrao");

        String[] acceptableValues = {"1,2,3"};
        String input2 = (String) JOptionPane.showInputDialog(null,
                "Is this a question?",
                "titltee",
                3,
                null,
                acceptableValues,
                acceptableValues[0]);
        int out = Integer.parseInt(input1);
        System.out.println(out);
    }
}
