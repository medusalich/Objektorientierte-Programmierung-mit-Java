package de.placeholder.uebung.u17;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int zahl;

        while (true) {

            try {
                System.out.println("Schreib eine Zahl: ");
                zahl = scanner.nextInt();
                System.out.println(zahl);
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Bitte nur Zahlen eingeben!");
                scanner.nextLine();
            }
        }
    }
}
