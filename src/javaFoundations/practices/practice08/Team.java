package javaFoundations.practices.practice08;

public class Team {
    private String name;
    private int totalWin,totalLose,totalTies,concededGoals,scoredGoals;

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getTotalWin() {
        return totalWin;
    }

    public void setTotalWin() {
        this.totalWin++;
    }

    public int getTotalLose() {
        return totalLose;
    }

    public void setTotalLose() {
        this.totalLose++;
    }

    public int getTotalTies() {
        return totalTies;
    }

    public void setTotalTies() {
        this.totalTies++;
    }

    public int getConcededGoals() {
        return concededGoals;
    }

    public void setConcededGoals(int concededGoals) {
        this.concededGoals +=concededGoals;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals +=scoredGoals;
    }

    @Override
    public String toString() {
        return "Team: "+name
                +"\nWins: "+totalWin
                +", Losses: "+totalLose
                +", Ties: "+ totalTies
                +"\nGoals scored:"+scoredGoals
                +", Goals conceded: "+concededGoals+"\n";
    }
}
