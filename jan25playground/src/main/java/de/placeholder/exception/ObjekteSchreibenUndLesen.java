package de.placeholder.exception;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ObjekteSchreibenUndLesen {

    private static final String FILE = "products.ser";

    public static void main(String[] args) {

        List<Produkt> produkte = new ArrayList<>();
//        produkte.add(new Produkt("Mütze", 10, 19.99));
//        produkte.add(new Produkt("Handschuhe", 20, 17.29));
//        produkte.add(new Produkt("Socken", 50, 8.99));

//        saveToFile(produkte);

        produkte = readFromFile();
        for(Produkt p : produkte) {
            System.out.println(p);
        }

        // Daten für das Produkt abfragen.
        Scanner scanner = new Scanner(System.in);
        Produkt p = new Produkt();
        System.out.println("Name: ");
        p.setName(scanner.next());
        System.out.println("Anzahl");
        p.setAnzahl(scanner.nextInt());
        System.out.println("Preis");
        p.setPreis(scanner.nextDouble());

        // Produkt der Liste hinzufügen
        produkte.add(p);

        saveToFile(produkte); // Aktuellen Zustand der Liste speichern.
    }

    private static List<Produkt> readFromFile() {

        // Input = Einlesen
        // Deserialisierung = Bytecode in Objekt übersetzen.
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE))) {
             return (List<Produkt>) ois.readObject(); // Liest das serialisierte Objekt ein und deserialisiert es.
        }
        catch (IOException e) {
            System.out.println("Lesen aus der Datei ist nicht möglich.");
        }
        // Wenn, für die serialisierten Objekte keine passende Klasse gefunden wird.
        catch (ClassNotFoundException e) {
            System.out.println("Daten konnten nicht rekonstruiert werden.");
        }
        return new ArrayList<>(); // Bei Fehlern eine leere Liste zurückgeben.
    }

    private static void saveToFile(List<Produkt> produkte) {

        // Output = Schreiben
        // Serialisierung = Objekte werden automatisch in Text/Bytecode übersetzt.
        // new FileOutputStream(FILE): Schreibende Verbindung zu der Datei.
        // ObjectOutputStream: Möglichkeit Objekte zu schreiben.
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE))) {
            oos.writeObject(produkte); // Schreibt die Liste inkl. der Produkte in die Datei.
        }
        catch (IOException e) {
            System.out.println("Daten konnten nicht gespeichert werden.");
            System.out.println(e.getMessage()); // Zeigt die Nachricht der Exception.
            e.printStackTrace(); // Komplette Meldung - nur fürs Debugging gedacht.
        }
    }
}
