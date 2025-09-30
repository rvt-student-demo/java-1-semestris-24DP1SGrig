package rvt;

public class App {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);
        // Scanner scanner = new Scanner(System.in);
        // int end = Integer.valueOf(scanner.nextLine());
        // for (int start = 0; start < end + 1; start++) {
        //     System.out.println(start);
        // }
    }
    public static void divisibleByThreeInRange(int beginning, int end) {
        for (int i = beginning; i < end; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
