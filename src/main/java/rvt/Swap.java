package rvt;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Integer[] numbers = {1, 3, 5, 7, 9, 0};
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
        
        System.out.println();
        System.out.println("Give two indices to swap:");
        Integer index1 = Integer.valueOf(scanner.nextLine());
        Integer index2 = Integer.valueOf(scanner.nextLine());
        System.out.println();

        numbers[5] = numbers[index1];
        numbers[index1] = numbers[index2];
        numbers[index2] = numbers[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
