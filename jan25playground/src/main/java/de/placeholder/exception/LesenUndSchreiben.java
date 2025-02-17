package de.placeholder.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LesenUndSchreiben {

    public static void main(String[] args) {

        // NIO = New Input Output

        // relative Pfade gehen vom Projektordner aus.
        // absolute Pfade enthalten einen vollständigen Pfad.

        Path path = Paths.get("content"); // Relativer Pfad

        if (!Files.exists(path)) { // Ist die Datei verfügbar?
            try {
                Files.createFile(path); // Wenn nicht vorhanden, dann Datei erzeugen.
            } catch (IOException e) {
                System.out.println("Datei konnte nicht erzeugt werden!");
            }
        }


    }
}
