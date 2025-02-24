package de.placeholder.datenbanken;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class VerbindungsTest {

    public static void main(String[] args) {

        datenAbfragen();

//        datenSchreiben();

//        datenLoeschen();

//        datenAendern();
    }

    private static void datenAendern() {
        try (Connection verbindung = DbUtility.getConnection();
             Statement stmt = verbindung.createStatement()) {

            final String SQL = "UPDATE kunden SET vorname = 'Scott', nachname = 'Lang', aktiv = 1 WHERE id = 2";

            if (stmt.executeUpdate(SQL) == 1) {
                System.out.println("Geändert.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datenLoeschen() {
        try (Connection verbindung = DbUtility.getConnection();
             Statement stmt = verbindung.createStatement()) {

            final String SQL = "DELETE FROM kunden WHERE id = 3";

            if (stmt.executeUpdate(SQL) == 1) {
                System.out.println("Gelöscht.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datenSchreiben() {
        try (Connection verbindung = DbUtility.getConnection();
             Statement stmt = verbindung.createStatement()) {

            final String SQL = "INSERT INTO kunden (vorname, nachname) VALUES('Tony', 'Stark')";

            if (stmt.executeUpdate(SQL) > 0) {
                System.out.println("Gespeichert.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void datenAbfragen() {
        // try-with-resources: Alle Ressourcen müssen AutoCloseable sein.
        // Aufbau der Verbindung und Anfrage wird vorbereitet.
        try (Connection verbindung = DbUtility.getConnection();
             Statement stmt = verbindung.createStatement()) {

            // Anfrage wird vorbereitet.
            // ResultSet ist eine Sammlung in der sich die Daten Zeilenweise befindenn.
            // Der Zeiger befindet dich am Anfang VOR der ersten Zeile
            // und wird mit next auf die nächste Zeile versetzt.
            ResultSet daten = stmt.executeQuery("SELECT * FROM kunden");

            // Daten anzeigen/verarbeiten.
            while (daten.next()) {
                // Daten werden mit passender Methode pro Spalte abgefragt.
                // Passende Methode muss zu dem jeweiligen Datentyp der Spalte passen.
                System.out.println(daten.getInt("id") + " " +
                        daten.getString("vorname") + " " +
                        daten.getString("nachname") + ", "+
                        (daten.getBoolean("aktiv") ? "aktiv" : "nicht aktiv"));
            }
            // Verbindung und stmt werden automatisch geschlossen.
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
