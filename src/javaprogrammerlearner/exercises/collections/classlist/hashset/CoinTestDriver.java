package javaprogrammerlearner.exercises.collections.classlist.hashset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CoinTestDriver {
    public static void main(String[] args) {
        Set<Coin> coinSet = new HashSet<>();
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);
        coinSet.addAll(List.of(coin1,coin2,coin5,coin10,coin20,coin50));
        coinSet.add(coin10);
        findCoin(coinSet,coin10);
        displayBagContents(coinSet);
        displayBagDetails(coinSet);
        coinSet.clear();
        displayBagDetails(coinSet);
    }
    public static void findCoin(Set<Coin> coinSet, Coin coin){
        String out = coinSet.contains(coin)?"There is a coin"+coin.getDenomination():"There is no coin"+coin.getDenomination();
        System.out.println(out+ " in the bag");
    }
    public static void displayBagContents(Set<Coin> coinSet){
        for (Coin coin : coinSet) {
            System.out.println("coin:"+coin.getDenomination());
        }
    }
    public static void displayBagDetails(Set<Coin> coinSet){
        if(coinSet.isEmpty()){
            System.out.println("bag empty");
            return;
        }
        System.out.println("there is "+ coinSet.size()+" elements");
    }
}
