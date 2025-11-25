package rvt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
<<<<<<< HEAD
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

=======
        ex1();
        ex2();
        // ex3();
    }
    public static void ex1() {
        int[] val = {0, 1, 2, 3}; 
        int sum = 0;
        for (int i = 0; i < val.length; i++) {
            sum += val[i];
>>>>>>> 38b183b77530fe76d08465b0b4d39688144d4a7e
        }
    }
}
