package de.placeholder.uebung.u11;

import java.util.Scanner;

class FitnessTracker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte gib deinen Namen ein: ");
        String name = scanner.nextLine();

        System.out.print("Bitte gib dein Alter ein: ");
        int alter = scanner.nextInt();

        System.out.print("Bitte gib dein Gewicht in kg ein: ");
        double gewicht = scanner.nextDouble();

        System.out.print("Bitte gib deine Größe in cm ein: ");
        double groesse = scanner.nextDouble();

        Benutzer benutzer = new Benutzer(name, alter, gewicht, groesse);

        double bmi = benutzer.berechneBMI();
        System.out.printf("Ihr BMI ist: %.2f%n", bmi);
        System.out.println(benutzer.gesundheitsEmpfehlung());
    }
}