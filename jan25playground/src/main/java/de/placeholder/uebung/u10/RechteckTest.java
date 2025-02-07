package de.placeholder.uebung.u10;

import javax.swing.*;

public class RechteckTest {

    public static void main(String[] args) {

        String laengeEingabe = JOptionPane.showInputDialog("Bitte gib die Länge ein: ");
        String breiteEingabe = JOptionPane.showInputDialog("Bitte gib die Breite ein: ");

        double laenge = Double.parseDouble(laengeEingabe);
        double breite = Double.parseDouble(breiteEingabe);

        Rechteck r1 = new Rechteck(laenge, breite);

        System.out.printf("Lange Seite: %.2f\n", r1.getLangeSeite());
        System.out.printf("Kurze Seite: %.2f\n", r1.getKurzeSeite());
        System.out.printf("Fläche: %.2f\n", r1.getFlaeche());
        System.out.printf("Umfang: %.2f\n", r1.getUmfang());
        System.out.printf("Diagonale: %.2f\n", r1.getDiagonale());
    }
}
