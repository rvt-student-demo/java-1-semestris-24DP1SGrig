package rvt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num;

        Statistics sum = new Statistics();
        Statistics even = new Statistics();
        Statistics odd = new Statistics();

        System.out.println("Enter numbers: ");
        while (true) { 
            num = Integer.valueOf(scanner.nextLine());
            if (num != -1) {
                sum.addNumber(num);
                if (num % 2 == 0) {
                    even.addNumber(num);
                } else {
                    odd.addNumber(num);
                }
            } else {
                System.out.println("Sum: " + sum.sum());
                System.out.println("Sum of even numbers: " + even.sum());
                System.out.println("Sum of odd numbers: " + odd.sum());
                break;
            }

        }
    }
}
