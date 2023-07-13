package javaFoundations.practices.practice06;

import java.util.Random;

public class Card {
    private int credits;
    private int tokens;
    private int cardNumber;

    public Card(int credits, int tokens) {
        this.credits = credits;
        this.tokens = tokens;
        this.cardNumber=genCardNumber();
    }
    private int genCardNumber(){
        Random rd= new Random();
        return rd.nextInt(0,1001);
    }
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getTokens() {
        return tokens;
    }

    public void setTokens(int tokens) {
        this.tokens = tokens;
    }

    public int getCardNumber() {
        return cardNumber;
    }
}

