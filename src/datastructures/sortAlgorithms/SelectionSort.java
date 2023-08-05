package datastructures.sortAlgorithms;

import java.util.Arrays;
import java.util.List;

public class SelectionSort {


    public static void main(String[] args) {

        int numbers[] = {40,7,59,4,1};
        for (int i = 0; i < numbers.length; i++) {
            int minorNumIndex=i;
            for (int j = i+1; j < numbers.length; j++) {
                if(numbers[j]<numbers[minorNumIndex]){
                    minorNumIndex=j;
                }
            }
            int temp=numbers[i];
            numbers[i]=numbers[minorNumIndex];
            numbers[minorNumIndex]=temp;
        }
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }
}
