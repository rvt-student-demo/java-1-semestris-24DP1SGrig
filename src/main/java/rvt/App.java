package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give the first number:");
        int first = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the second number:");
        int second = Integer.valueOf(scanner.nextLine());
        
        System.out.println("Give the third number:");
        int third = Integer.valueOf(scanner.nextLine());

        double sum = (first + second + third) / 3.0;
        System.out.println("The average is " + sum);
    }
}
