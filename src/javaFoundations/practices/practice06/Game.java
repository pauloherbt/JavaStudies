package javaFoundations.practices.practice06;

public class Game {
    private int requiredCredits;
    private Card card;
    public Game(Card card){
        this.card=card;
        requiredCredits=10;
    }
    public void  play(){
        if(card.getCredits()>=requiredCredits){
            card.setCredits(card.getCredits()-requiredCredits);
            card.setTokens(card.getTokens()+20);
            System.out.println("CARD NUMBER: "+ card.getCardNumber());
            System.out.println("EARN TOKENS: "+ card.getTokens());
        }
        else
            System.out.println("not enough credits");
    }
}
