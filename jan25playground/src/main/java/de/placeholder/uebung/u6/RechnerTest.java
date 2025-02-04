package de.placeholder.uebung.u6;

import java.util.Scanner;

public class RechnerTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Gib deine erste Zahl ein: ");
        double zahl1 = scanner.nextDouble();

        System.out.println("Gib deine zweite Zahl ein: ");
        double zahl2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\nWählen die Operation (+, addieren, -, subtrahieren, *, multiplizieren, /, dividieren): ");
        String waehlen = scanner.nextLine().toLowerCase();

        double ergebnis = 0;

        switch(waehlen) {
            case "+":
            case "addieren":
                ergebnis = Rechner.addieren(zahl1, zahl2);
                System.out.println("Ergebnis der Addition: " + ergebnis);
                break;
            case "-":
            case "subtrahieren":
                ergebnis = Rechner.subtrahieren(zahl1, zahl2);
                System.out.println("Ergebnis der Subtraktion: " + ergebnis);
                break;
            case "*":
            case "multiplizieren":
                ergebnis = Rechner.multiplizieren(zahl1, zahl2);
                System.out.println("Ergebnis der Addition: " + ergebnis);
                break;
            case "/":
            case "dividieren":
                ergebnis = Rechner.dividieren(zahl1, zahl2);
                System.out.println("Ergebnis der Addition: " + ergebnis);
                break;
        }
    }
}
