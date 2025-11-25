package rvt;

import java.util.Scanner;

public class Chapter44 {
    public static void main(String[] args) {
        ex7();
    }

    public static void ex1() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter your name: ");
        String name = scanner.nextLine().trim();

        int spaceIndex = name.indexOf(" ");

        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1);
        System.out.println();
        System.out.println(firstName + " " + lastName.toUpperCase());

    }

    public static void ex2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String word = scanner.nextLine();
        System.out.println();

        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }
    }

    public static void ex3() {
        Scanner input = new Scanner(System.in);

        String[] femaleNames = {"Amy", "Buffy", "Cathy"};
        String[] maleNames   = {"Elroy", "Fred", "Graham"};

        while (true) {
            System.out.println("Enter a name: ");
            String fullName = input.nextLine().trim();

            if (fullName.length() == 0) {
                break;
            }

            System.out.println(fullName);

            String firstName = fullName.split(" ")[0];

            String title = "";

            for (String fn : femaleNames) {
                if (firstName.equalsIgnoreCase(fn)) {
                    title = "Ms. ";
                    break;
                }
            }

            if (title.equals("")) {
                for (String mn : maleNames) {
                    if (firstName.equalsIgnoreCase(mn)) {
                        title = "Mr. ";
                        break;
                    }
                }
            }

            if (title.equals("")) {
                System.out.println(fullName);
            } else {
                System.out.println(title + fullName);
            }

            System.out.println();
        }

    }

    public static void ex4() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter cook time-> ");
        String digits = in.nextLine().trim();

        int len = digits.length();
        String minutes, seconds;

        if (len <= 2) {
            minutes = "0";
            seconds = digits;
        } else {
            minutes = digits.substring(0, len - 2);
            seconds = digits.substring(len - 2);
        }

        System.out.println("Your time->  " + minutes + ":" + seconds);
    }

    public static void ex5() {
        Scanner in = new Scanner(System.in);
        boolean block = false;

        while (in.hasNextLine()) {
            String line = in.nextLine();

            if (line.startsWith("/*")) {
                block = true;
                System.out.println(line);
                continue;
            }

            if (line.startsWith("*/")) {
                System.out.println(line);
                block = false;
                continue;
            }

            if (line.startsWith("//")) {
                System.out.println(line);
                continue;
            }

            if (block) {
                System.out.println(line);
            }
        }
    }

    public static void ex6() {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your password:");
            String pw = in.nextLine();

            if (pw.length() >= 7) {
                if (!pw.equals(pw.toUpperCase())) {
                    if (!pw.equals(pw.toLowerCase())) {
                        boolean hasDigit = false;
                        for (int i = 0; i < pw.length(); i++) {
                            if (Character.isDigit(pw.charAt(i))) {
                                hasDigit = true;
                                break;
                            }
                        }
                        if (hasDigit) {
                            System.out.println("Acceptable password.");
                            break;
                        }
                    }
                }
            }

            System.out.println("That password is not acceptable.\n");
        }
    }

    public static void ex7() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a word -->");
        String w = in.nextLine();

        int spaces = 0;

        while (w.length() > 0) {
            for (int i = 0; i < spaces; i++)
                System.out.print(" ");
            System.out.println(w);

            spaces++;
            if (w.length() == 1) break;
            w = w.substring(1, w.length() - 1);
        }
    }
}
