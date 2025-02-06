package de.placeholder.uebung.u8;

import java.util.Random;
import java.util.Scanner;

public class Pilzsuche {

    private final int ANZAHL_ZEILEN;
    private final int ANZAHL_REIHEN;

    private int[][] wald;

    private final Random zufallsGenerator = new Random();

    private final Scanner scanner = new Scanner(System.in);

    //Konstruktoren sind Methoden, die IMMER das Objekt als return haben
    public Pilzsuche(int zeilen, int reihen) {
        ANZAHL_ZEILEN = zeilen;
        ANZAHL_REIHEN = reihen;
        wald = new int[zeilen][reihen];
    }

    public static void main(String[] args) {
        Pilzsuche pilzsuche = new Pilzsuche(10, 10);
        pilzsuche.pilzeVerteilen(15);
        pilzsuche.waldAusgeben(true);
        pilzsuche.starteSuche(10);
    }

    public void starteSuche(int anzahlVersuche) {

        int versuch = 1;
        int gefundenePilze = 0;

        while(versuch <= anzahlVersuche) {
            System.out.println("\nVersuch " + versuch + " von " + anzahlVersuche);
            System.out.print("\nZeile: ");
            int zeile = scanner.nextInt();
            System.out.print("Reihe: ");
            int reihe = scanner.nextInt();

            if(wald[zeile][reihe] == 1) {
                System.out.println("Du hast einen Pilz gefunden!");
                wald[zeile][reihe] = 2;
                gefundenePilze++;
            }
            else if (wald[zeile][reihe] == 2) {
                System.out.println("Diesen Pilz hast du schon aufgedeckt!");

            } else {
                System.out.println("Nichts gefunden!");
            }
            versuch++;
            waldAusgeben(true);
        }

        System.out.println("Spiel ist beendet!");
        System.out.println("Du hast " + gefundenePilze + " Pilze gefunden.");
    }

    public void pilzeVerteilen(int anzahl) {

        int gesetzt = 0;

        //Per Zufall verteilen
        while(gesetzt < anzahl) {
            //Zeile per Zufall bestimmen
            int zeile = zufallsGenerator.nextInt(ANZAHL_ZEILEN);
            //Reihe per Zufall bestimmen
            int reihe = zufallsGenerator.nextInt(ANZAHL_REIHEN);

            //TODO: Wenn Position schon belegt, dann an eine andere Stelle setzen
            if(wald[zeile][reihe] > 0) continue;

            wald[zeile][reihe] = 1;
            gesetzt++;
        }
    }

    //Instanzmethoden brauchen ein Objekt
    public void waldAusgeben(boolean nurGefundeneAnzeigen) {
        //Ausgabe
        for(int[] zeile : wald){
            for (int reihe : zeile) {
                if(nurGefundeneAnzeigen) {
                    if(reihe == 2) {
                        System.out.print("X ");
                    }
                    else {
                        System.out.print("? ");
                    }
                }
                else {
                    System.out.print(reihe + " ");
                }
            }
            System.out.println(); //Zeilenumbruch
        }
    }
}
