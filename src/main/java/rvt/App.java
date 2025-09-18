package rvt;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        gradesAndPoints(args);
        oddOrEven(args);
        // Scanner scanner = new Scanner(System.in);
        
        // System.out.println("Give the first number:");
        // int first = Integer.valueOf(scanner.nextLine());
        
        // System.out.println("Give the second number:");
        // int second = Integer.valueOf(scanner.nextLine());
        
        // System.out.println("Give the third number:");
        // int third = Integer.valueOf(scanner.nextLine());

        // double sum = (first + second + third) / 3.0;
        // System.out.println("The average is " + sum);
    }
    public static void gradesAndPoints(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scanner.nextLine());

        if (points < 0) {
            System.out.println("Grade: impassable!");
        } else if (points < 50) {
            System.out.println("Grade: failed");
        } else if (points < 60) {
            System.out.println("Grade: 1");
        } else if (points < 70) {
            System.out.println("Grade: 2");
        } else if (points < 80) {
            System.out.println("Grade: 3");
        } else if (points < 90) {
            System.out.println("Grade: 4");
        } else if (points <= 100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
        
    }
    public static void oddOrEven(String[] args) {
        System.out.println("Give a number:");
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even.");
        } else {
            System.out.println("Number " + number + " is odd.");
        }
    }
}
