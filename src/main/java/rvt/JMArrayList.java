package rvt;

import java.util.ArrayList;
import java.util.Scanner;

public class JMArrayList {
    public static void main(String[] args) {
        // onlyTheseNumbers();
        // listSize();
        // onTheList();
        ArrayList<String> strings = new ArrayList<>();

        strings.add("First");
        strings.add("Second");
        strings.add("Third");

        System.out.println(strings);

        removeLast(strings);
        removeLast(strings);

        System.out.println(strings);
    }
    public static void onlyTheseNumbers() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Integer first;
        Integer last;

        while (true) {
            Integer number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            } else {
                list.add(number);
            }
        }
        System.out.printf("From where? ");
        first = Integer.valueOf(scanner.nextLine());
        System.out.printf("To where? ");
        last = Integer.valueOf(scanner.nextLine());

        for (; first < last+1; first++) {
            System.out.println(list.get(first));
        }

    }
    public static void listSize() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String word = String.valueOf(scanner.nextLine());
            if (word.equals("")) {
                break;
            } else {
                list.add(word);
            }
        }
        System.out.println("In total: " + list.size());
    }
    public static void onTheList() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        String search; 
        while (true) {
            String word = String.valueOf(scanner.nextLine());
            if (word.equals("")) {
                break;
            } else {
                list.add(word);
            }
        }
        System.out.printf("Search for? ");
        search = String.valueOf(scanner.nextLine());
        if (list.contains(search)) {
            System.out.println(search + " was found!");
        } else {
            System.out.println(search + " was not found!");
        }
    }
    public static void removeLast(ArrayList<String> strings) {
        strings.removeLast();
    }
}