package rvt;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int end = Integer.valueOf(scanner.nextLine());
        for (int start = 0; start < end + 1; start++) {
            System.out.println(start);
        }
    }
}
