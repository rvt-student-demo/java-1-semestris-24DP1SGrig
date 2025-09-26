package rvt;

import java.util.Scanner;

public class Detalas {
    
    public static void main(String[] args) {
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
}
