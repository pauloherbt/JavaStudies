package javaFoundations.exercises.arrays;

public class ArraysEx2 {
    public static void main(String[] args) {
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        System.out.println("size of array " + browsers.length);
        for (String browser: browsers) {
            System.out.println(browser);
        }

    }
}
