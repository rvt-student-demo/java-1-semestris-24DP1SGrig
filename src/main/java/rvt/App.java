package rvt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        delikatese();
        // detalas(args);
        // giftTax(args);
        // gradesAndPoints(args);
        // oddOrEven(args);
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
        scanner.close();

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
    public static void giftTax(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double value = Double.valueOf(scanner.nextLine());
        double tax;

        if (value < 5000) {
            tax = 0;
        } else if (value < 25000) {
            tax = 100 + (value - 5000) * 0.08;
        } else if (value < 55000) {
            tax = 1700 + (value - 25000) * 0.10;
        } else if (value < 200000) {
            tax = 4700 + (value - 55000) * 0.12;
        } else if (value < 1000000) {
            tax = 22100 + (value - 200000) * 0.15;
        } else {
            tax = 142100 + (value - 1000000) * 0.17;
        }

        System.out.println("Tax: " + tax);
    }
    public static void detalas(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int SKRUVES_CENA = 5;
        final int UZGRIEZNIS_CENA = 3;
        final int PAPLASNE_CENA = 1;

        int skruves = 0;
        int uzgrieznis = 0;
        int paplasnes = 0;

        System.out.println("Skrvju skaits:");
        skruves = Integer.valueOf(scanner.nextLine());
        System.out.println("Uzgrieznu skaits:");
        uzgrieznis = Integer.valueOf(scanner.nextLine());
        System.out.println("Paplasnes skaits:");
        paplasnes = Integer.valueOf(scanner.nextLine());

        if (skruves <= uzgrieznis && paplasnes / 2 == skruves) {
            System.out.println("Pasutijums ir kartiba");
        }
        if (!(skruves <= uzgrieznis)) {
            System.out.println("Parbaudi pasutijumu: par maz uzgrieznu");
        }
        if (!(paplasnes / 2 == skruves)) {
            System.out.println("Parbaudi pasutijumu: par maz paplaksne");
        }
        System.out.println("Kopeja cena: " + (skruves * SKRUVES_CENA + uzgrieznis * UZGRIEZNIS_CENA + paplasnes * PAPLASNE_CENA));
    }
    public static void delikatese() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ievadi preci: ");
        String prece = String.valueOf(scanner.nextLine());
        System.out.println("Ievadi cenu: ");
        Double cena = Double.valueOf(scanner.nextLine());
        System.out.println("Ekspress piegade (0==ne, 1==ja)");
        int piegade = Integer.valueOf(scanner.nextLine());

        if (piegade == 1) {
            piegade += 2;
        }
        if (cena < 10) {
            piegade += 2;
        }
        piegade *= 1.0;
        Double kopa = cena + piegade;
        System.out.println("\nRekins:");
        System.out.println("  " + prece + "\t" + cena);
        System.out.println("  piegade\t" + (piegade * 1.0));
        System.out.println("  kopa\t\t" + kopa);
    }
}