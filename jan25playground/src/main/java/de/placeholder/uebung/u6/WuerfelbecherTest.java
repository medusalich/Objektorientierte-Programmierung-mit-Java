package de.placeholder.uebung.u6;

import java.util.Scanner;

public class WuerfelbecherTest {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Gib ein wie viele Würfel sollen es werden: ");
        int anzahl = scanner.nextInt();

        for(int wert : Wuerfel.roll(anzahl)) {
            System.out.println(wert + "\n");
        }

        System.out.println(Wuerfel.wuerfel());

    }
}
