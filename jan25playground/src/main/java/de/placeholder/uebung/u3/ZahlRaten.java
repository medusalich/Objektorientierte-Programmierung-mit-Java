package de.placeholder.uebung.u3;

import java.util.Scanner;

public class ZahlRaten {

    public static void main(String[] args) {
        // Zufallszahl zwischen 1 und 10 generieren
        int zufallszahl = (int) (Math.random() * 10) + 1;
        int versuche = 5;
        boolean gewonnen = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen errate die Zahl!");
        System.out.println("Ich habe eine Zahl zwischen 1 und 10 gewählt. Du hast " + versuche);

        while (versuche > 0) {
            System.out.print("Gib deine Zahl ein: ");
            int zahl = scanner.nextInt();

            if (zahl == zufallszahl) {
                gewonnen = true;
                break;
            } else {
                versuche--;
                if (versuche > 0) {
                    System.out.println("Falsch! Du hast noch " + versuche + " Versuche übrig.");
                }
            }
        }

        if (gewonnen) {
            System.out.println("Herzlichen Glückwunsch! Du hast die Zahl " + zufallszahl + " erraten.");
        } else {
            System.out.println("Game Over! Die richtige Zahl war " + zufallszahl + ".");
        }

        scanner.close();
    }
}

