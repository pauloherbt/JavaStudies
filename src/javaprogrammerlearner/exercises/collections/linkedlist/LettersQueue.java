package javaprogrammerlearner.exercises.collections.linkedlist;

import java.util.LinkedList;

public class LettersQueue {
    public static void main(String[] args) {
        LinkedList<String> lettersQueue = new LinkedList<>();
        lettersQueue.addFirst("A");
        lettersQueue.addFirst("B");
        lettersQueue.addFirst("C");
        lettersQueue.addFirst("D");
        System.out.println(lettersQueue);
        while(!lettersQueue.isEmpty()){
            System.out.println(lettersQueue.remove());
        }

    }
}
