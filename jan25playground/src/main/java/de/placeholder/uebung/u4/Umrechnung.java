package de.placeholder.uebung.u4;

import java.util.Scanner;

public class Umrechnung {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib die Minuten ein: ");
        int input = scanner.nextInt();

        int sekunden = input * 60;

        System.out.println(input + " Minuten sind " + sekunden + " Sekunden.");
    }
}
