package de.placeholder.uebung.u8;

public class Aufgabe8 {

    /*
    Schreibe ein Array für ein Theater mit 5 Reihen und 7 Plätzen pro Reihe.
    Setze Peter, Carol, Bruce und Natasha auf ihre Plätze
    Peter - Reihe 3, Sitz 5
    Carol - Reihe 4, Sitz 2
    Bruce - Reihe 0, Sitz 0
    Natasha - Reihe 4, Sitz 6

    Zeige danach das Array an.
    Verwendet ein 2D String-Array.
    */

    public static void main(String[] args) {

        String[][] arr2d = new String[5][7];
        arr2d[3][5] = "Peter";
        arr2d[4][2] = "Carol";
        arr2d[0][0] = "Bruce";
        arr2d[4][6] = "Natasha";

        for (String[] reihe : arr2d) {
            for(String sitz : reihe) {
                if (sitz == null) {
                    System.out.print(" FREI ");
                }
                else {
                    System.out.print(" " + sitz + " ");
                }
            }
            System.out.println();
        }
    }
}
