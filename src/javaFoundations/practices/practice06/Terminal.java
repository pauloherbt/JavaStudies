package javaFoundations.practices.practice06;

public class Terminal {
    private final int CREDITS_PER_DOL=2;
    private Prize prize;
    private Prize prize2;
    private Card card;

    public Terminal(Card card) {
        setPrizes();
        this.card=card;

    }
    public void verifyBalance(){
        System.out.println("-------------------------");
        System.out.println("CARD NUMBER: "+card.getCardNumber());
        System.out.println("TOTAL CREDITS: "+card.getCredits());
        System.out.println("TOTAL EARN TOKENS: "+card.getTokens());
        System.out.println("-------------------------");
    }
    public void buyCredits(int amount){
        if(amount>0){
            card.setCredits(amount*CREDITS_PER_DOL);
        }
        else
            System.out.println("not enough money");
        verifyBalance();
    }
    public void transferCredits(int amount,Card destinyCard){
        if(amount>0&&amount<=card.getCredits()){
            card.setCredits(card.getCredits()-amount);
            int credits=amount+destinyCard.getCredits();
            destinyCard.setCredits(credits);
        }
        else
            System.out.println("not enough credits");
        verifyBalance();
    }
    public void receivePrize(int v){
        if(v==1){
            processPrize(card,prize);
        }
        else if(v==2)
            processPrize(card,prize2);
    }
    private void processPrize(Card card, Prize prize){
        if(Prize.getAmountOnTerminal()>0) {
            if (card.getTokens() >= prize.getRequiredTickets()) {
                int credits = card.getTokens() - prize.getRequiredTickets();
                Prize.setAmountOnTerminal(Prize.getAmountOnTerminal() - 1);
                card.setTokens(credits);
                System.out.println("you earn:" + prize.getName());
                verifyBalance();
            }
            else
                System.out.println("not enough tokens");
        }
        else
            System.out.println("the prize's gone");
    }
    private void setPrizes(){
        this.prize=new Prize("doll",10);
        this.prize2= new Prize2("dog",120);
    }

}
