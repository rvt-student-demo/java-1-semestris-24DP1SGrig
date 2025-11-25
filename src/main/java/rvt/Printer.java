package rvt;

public class Printer {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }
    public static void printArrayInStars(int[] array) {
        Integer skaits = 0;
        for (int i = 0; i < array.length; i++) {
            skaits = array[i];
            for (int x = 0; x < skaits; x++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
