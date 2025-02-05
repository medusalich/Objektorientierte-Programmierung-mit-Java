package de.placeholder.uebung.u8;

import java.util.Scanner;

public class SpielfeldTest {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

        Spielfeld feld = new Spielfeld();

        while (true) {
            System.out.println("\nEingabe: ");
            String eingabe = scanner.nextLine();

            boolean exit = false;

            switch (eingabe.toLowerCase()) {
                case "l" -> feld.nachLinks();
                case "r" -> feld.nachRechts();
                case "u" -> feld.nachUnten();
                case "o" -> feld.nachOben();
                case "exit" -> exit = true;
                default -> System.out.println("Ungültig");
            }
            if (exit == true) {
                break;
            }
            feld.print();
        }
    }

}
