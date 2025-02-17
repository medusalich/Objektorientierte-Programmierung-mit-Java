package de.placeholder.exception;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class LesenUndSchreiben {

    // relative Pfade gehen vom Projektordner aus.
    // absolute Pfade enthalten einen vollständigen Pfad.
    private static final Path path = Paths.get("content"); // Relativer Pfad

    public static void main(String[] args) {

        createFile();
//        writeToFile();
        readFromFile();

    }

    private static void readFromFile() {

        try {
            // readAllLines liest die komplette Datei in den Speicher ein.
            List<String> zeilen = Files.readAllLines(path);
            for(String zeile : zeilen) {
                System.out.println(zeile);
            }
        }
        catch (IOException e) {
            System.out.println("Daten konnten nicht gelesen werden!");
        }
    }

    private static void createFile() {
        // NIO
        if (!Files.exists(path)) { // Ist die Datei verfügbar?
            try {
                Files.createFile(path); // Wenn nicht vorhanden, dann Datei erzeugen.
            }
            catch (IOException e) {
                System.out.println("Datei konnte nicht erzeugt werden!");
            }
        }
    }

    private static void writeToFile() {
        // Streams schreiben und lesen Bytes.
        // Writer und Reader schreiben und lesen Zeichen.

        try (BufferedWriter out = Files.newBufferedWriter(path, StandardOpenOption.APPEND)) {
            // Verwenden des Writers
            out.append("Das ist das Haus von Nikigraus\n");

            // Am Ende des Blockes wird der Writer automatisch geschlossen.
        }
        catch(IOException e) {
            System.out.println("Es konnte nicht in die Datei geschrieben werden. ");
        }
    }
}
