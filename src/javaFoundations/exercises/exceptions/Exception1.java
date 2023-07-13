package javaFoundations.exercises.exceptions;

public class Exception1 {
    public static void main(String args[]) {

        int[] nums = {3, 2, 6, 1};
        badUse(nums);
    }
    public static void badUse(int[] vals) {
        int total = 0;
        for (int i = 0; i < vals.length; i++) {
            int index = vals[i];
            total += vals[i];
        }
        System.out.println(total);
    }
}
