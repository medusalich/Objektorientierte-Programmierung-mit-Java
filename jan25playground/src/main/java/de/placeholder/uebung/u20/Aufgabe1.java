package de.placeholder.uebung.u20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import java.util.Scanner;

public class Aufgabe1 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Datum + Uhrzeit (dd.MM.yyyy HH:mm) eingeben: ");
        String eingabe = scanner.next();

        Locale.setDefault(Locale.US);

        DateTimeFormatter eingabeF = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        DateTimeFormatter ausgabeF = DateTimeFormatter.ofPattern("EEEE, dd.MM.yyyy HH:mm 'Uhr'");

        try{
            LocalDateTime eingegebenes = LocalDateTime.parse(eingabe, eingabeF);
            System.out.println(eingegebenes);
            System.out.println(eingegebenes.format(ausgabeF));
        }
        catch (DateTimeParseException e) {
            System.out.println("Falsche Format. Eingabe: dd.MM.yyyy HH:mm .");
        }
    }
}
