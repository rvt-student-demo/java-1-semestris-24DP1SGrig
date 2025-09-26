package rvt;

import java.util.Scanner;

public class Repeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loops = 0;
        int sum = 0;
        int even = 0;
        int odd = 0;
        System.out.println("Give numbers:");
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (!(number == -1)) {
                loops++;
                sum += number;
                if (number % 2 == 0) {
                    even += 1;
                } else {
                    odd += 1;
                }
            } else {
                break;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + loops);
        System.out.printf("Average: %f\n", (double) sum / loops);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
