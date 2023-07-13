package javaFoundations.practices.practice08;

import javax.swing.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Matchs {
    private ArrayList<Match> matches;
    private ArrayList<Team> teams;
    private final int templimit =15;

    public Matchs() {
        matches=new ArrayList<>();
        teams=new ArrayList<>();
        setTeams();
    }
    private void setTeams(){
        teams.add(new Team("Parcas"));
        teams.add(new Team("Joazinhos"));
        teams.add(new Team("Lampions"));
        teams.add(new Team("Borussia horta"));
    }
    private int[] sort(int size){
        Random rd= new Random();
        int[] result= new int[size];
        int n=0;
        for (int i = 0; i < size; i++) {
            do {
                n= rd.nextInt(4)+1;
            }while (exists(n,result));
            result[i]=n;
        }
        return result;

    }
    private boolean exists(int n,int[] v){
        for (int integer : v) {
            if(n==integer){
                return true;
            }
        }
        return false;
    }
    public void playRound(){
        int frio=0;
        for (int i = 1;frio<3;i+=2) {
            int input=0;
            try{
                input= Integer.parseInt(JOptionPane.showInputDialog(null,"Temp in Celsius:",JOptionPane.QUESTION_MESSAGE));
            }catch (NumberFormatException e){
                System.out.println(e.getMessage());
                System.out.println("digite um numero valido");
            }
            if(input>=templimit){
                int[] result= sort(4);
                matches.add(new Match(teams.get(result[0]-1),teams.get(result[1]-1),input,i));
                matches.add(new Match(teams.get(result[2]-1),teams.get(result[3]-1),input,i+1));
                frio=0;
            }
            else{
                frio++;
            }
        }
    }

    @Override
    public String toString() {
        String result = "";
        for (Team team : teams) {
            result+= team.toString();
        }
        for (Match match : matches) {
            result+= match.toString();
        }
        return result;
    }
}
