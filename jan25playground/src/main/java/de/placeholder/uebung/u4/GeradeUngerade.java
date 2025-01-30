package de.placeholder.uebung.u4;

import java.util.Scanner;

public class GeradeUngerade {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bitte eine Zahl eingeben: ");
        int zahl = scanner.nextInt();

        if (zahl % 2 == 0) {
            System.out.println("Die eingegebene Zahl ist gerade.");
        }
        else {
            System.out.println("Die eingegebene Zahl ist ungerade.");
        }
    }
}
