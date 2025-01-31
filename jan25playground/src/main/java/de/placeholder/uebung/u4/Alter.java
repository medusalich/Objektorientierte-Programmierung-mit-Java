package de.placeholder.uebung.u4;

import java.util.Scanner;

public class Alter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Gib dein Alter ein: ");
        int alter = scanner.nextInt();

        if (alter >= 0 && alter <= 12) {
            System.out.println("Kind!");
        }
        else if (alter <= 19) {
            System.out.println("Teenager!");
        }
        else if (alter <= 64) {
            System.out.println("Erwachsener!");
        }
        else if (alter > 64){
            System.out.println("Senior!");
        }
        else {
            System.out.println("Falsche Eingabe!");
        }
    }
}
