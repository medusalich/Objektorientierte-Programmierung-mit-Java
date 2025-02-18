package de.placeholder.exception;

import java.util.Scanner;

public class ExceptionTest4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Alter: ");
            int zahl = scanner.nextInt();

            try {
                System.out.println(check(zahl));
                break;
            }
            catch (RuntimeException e) {
                System.out.println("Falsche Eingabe!");
            }
        }
    }

    private static String check(int zahl) {

        if (zahl <= 0) throw new RuntimeException("Ungültiger Wert!");

        if(zahl > 0 && zahl < 18) {
            return  "Jugendlicher";
        }
        else if(zahl < 65) {
            return "Erwachsener";
        }
        else {
            return "Senior";
        }
    }
}
