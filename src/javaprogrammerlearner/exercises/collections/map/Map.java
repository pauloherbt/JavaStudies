package javaprogrammerlearner.exercises.collections.map;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        HashMap<String,String> fruitMap= new HashMap<>();
        add(fruitMap);
        displayElements(fruitMap);
        findElement(fruitMap, "Banana");

    }
    public static void add(HashMap<String,String> fruitMap){
        fruitMap.put("Apple", "Green");
        fruitMap.put("Cherry", "Red");
        fruitMap.put("Orange", "Orange");
        fruitMap.put("Banana", "Yellow");
    }
    public static void displayElements(HashMap<String,String> fruitMap){
        for (String key: fruitMap.keySet()) {
            System.out.println(key +" "+fruitMap.get(key));
        }
    }
    public static void findElement(HashMap<String,String> fruitMap, String key){
        if(fruitMap.containsKey(key)){
            System.out.println("the fruit "+key+" is "+fruitMap.get(key));
        }
        else
            System.out.println("Element not found");
    }
}
