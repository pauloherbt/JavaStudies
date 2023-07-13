package javaFoundations.practices.practice08;

import java.util.Random;

public class Match {
    private Team team1;
    private int placar1;
    private int placar2;
    private Team team2;
    private int temperature;
    private int id;

    public Match(Team team1, Team team2, int temperature, int id) {
        this.team1 = team1;
        this.team2 = team2;
        this.temperature = temperature;
        this.id = id;
        playmatch();
    }
    private void playmatch(){
        Random random= new Random();
        int range=temperature/10;
        placar1=random.nextInt(3*range);
        placar2=random.nextInt(3*range);
        if(placar1>placar2){
            team1.setTotalWin();
            team2.setTotalLose();
        }
        else if(placar2>placar1){
            team2.setTotalWin();
            team1.setTotalLose();
        }
        else {
            team1.setTotalTies();
            team2.setTotalTies();
        }
        team1.setConcededGoals(placar2);
        team1.setScoredGoals(placar1);
        team2.setConcededGoals(placar1);
        team2.setScoredGoals(placar2);
    }

    @Override
    public String toString() {
        return "Game: " +id
                +"\nTemperature: "+ temperature+"\n"
                +"Home Team:"+ team1.getName()+", " +placar1+" \n"
                +"Away Team: "+team2.getName()+", " +placar2+" \n";

    }
}
