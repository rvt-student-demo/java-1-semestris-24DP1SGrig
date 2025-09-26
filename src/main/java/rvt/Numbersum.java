package rvt;

import java.util.Scanner;

public class Numbersum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = 0;
        int sum = 0;
        while (true) {
            System.out.println("Gibe a number: ");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                break;
            } else {
                loops += 1;
                sum += input;
            }
        }
        System.out.println("Numer of numbers: " + loops);
        System.out.println("Sum of the numbers " + sum);
    }
}
