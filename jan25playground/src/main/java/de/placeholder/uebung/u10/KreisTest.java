package de.placeholder.uebung.u10;

import javax.swing.*;

public class KreisTest {

    public static void main(String[] args) {

        String Eingabe = JOptionPane.showInputDialog("Bitte gib ein Radius ein: ");
        double radius = Double.parseDouble(Eingabe);
        Kreis k1 = new Kreis(radius);
        System.out.printf("Der Radius des Kreises beträgt: %.2f\n", k1.getRadius());
        System.out.printf("Der Umfang beträgt: %.2f\n", k1.getUmfang());
        System.out.printf("Die Fläche beträgt: %.2f\n", k1.getFlaeche());
    }
}
