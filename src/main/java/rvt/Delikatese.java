package rvt;

import java.util.Scanner;

public class Delikatese {
    public static void main(String[] args) {
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
