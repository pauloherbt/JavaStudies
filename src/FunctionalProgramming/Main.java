package FunctionalProgramming;

import FunctionalProgramming.Anotações.Gato;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Songs> songs = new ArrayList<>(List.of(new Songs("A culpa é nossa", "Leo Lins")
                    , new Songs("Tim maia", "Devo admitir")
                    , new Songs("Eduardo Costa", "Pinga"), new Songs("Reu Confesso", "Leonardo")));
        songs.sort(Comparator.comparing(Songs::getName));
        System.out.println(songs);
        List<? extends Animal> animais = new ArrayList<>();

        System.out.println(animais);
    }
}