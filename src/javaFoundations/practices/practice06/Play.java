package javaFoundations.practices.practice06;

public class Play {
    public static void main(String[] args) {
        Card card1 = new Card(0,0);
        Card card2= new Card(0,0);
        Terminal terminal1= new Terminal(card1);
        Terminal terminal2= new Terminal(card2);
        terminal1.buyCredits(50);
        terminal2.buyCredits(50);
        Game game1 = new Game(card1);
        game1.play();
        game1.play();
        game1.play();
        game1.play();
        terminal1.verifyBalance();
        game1= new Game(card2);
        game1.play();
        game1.play();
        game1.play();
        game1.play();
        game1.play();
        terminal2.verifyBalance();

        terminal1.transferCredits(60,card2);
        terminal2.verifyBalance();
        terminal1.receivePrize(1);
        terminal1.receivePrize(2);
        terminal1.receivePrize(1);
        terminal2.receivePrize(2);
    }

}
