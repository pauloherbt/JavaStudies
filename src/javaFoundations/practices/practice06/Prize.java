package javaFoundations.practices.practice06;

public class Prize {
    private String name;
    private int requiredTickets;
    private static int amountOnTerminal=4;

    public Prize(String name, int requiredTickets) {
        this.name = name;
        this.requiredTickets = requiredTickets;
    }
    public String getName() {
        return name;
    }

    public int getRequiredTickets() {
        return requiredTickets;
    }

    public static int getAmountOnTerminal() {
        return amountOnTerminal;
    }
    public static void setAmountOnTerminal(int amountOnTerminal) {
        Prize.amountOnTerminal = amountOnTerminal;
    }
}
