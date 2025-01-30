package de.placeholder.uebung.u4;

import java.util.Scanner;

public class Rabatt {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib dein Alter ein: ");
        int alter = scanner.nextInt();

        System.out.println("Gib den Preis des Produkts ein: ");
        double preis = scanner.nextDouble();

        double rabatt;
        double endpreis;

        if (alter < 18) {
            rabatt = preis * 0.2;
        } else {
            rabatt = preis * 0.1;
        }

        endpreis = preis - rabatt;

        System.out.println("Du erhältst einen Rabatt von: " + rabatt + "Euro");
        System.out.println("Der Endpreis nach Rabatt beträgt: " + endpreis + "Euro");
    }
}
