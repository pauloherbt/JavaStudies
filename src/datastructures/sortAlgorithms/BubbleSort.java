package datastructures.sortAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int numbers[] = {40,7,59,4,1};
        for (int i = 0; i < numbers.length; i++) { // pode ser acrescentado uma flag se houve comapracoes, senao ja esta ordenado
            for (int j = 0; j < numbers.length; j++) {
                if(numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
        }
        for (int number : numbers) {
            System.out.print(number+" ");
        }
    }

}
