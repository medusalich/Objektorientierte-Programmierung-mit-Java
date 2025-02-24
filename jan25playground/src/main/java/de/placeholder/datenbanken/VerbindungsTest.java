package de.placeholder.datenbanken;

import java.sql.*;

public class VerbindungsTest {

    public static void main(String[] args) {

        // try-with-resources: Alle Ressourcen müssen AutoCloseable sein.
        // Aufbau der Verbindung und Anfrage wird vorbereitet.
        try (Connection verbindung = DbUtility.getConnection();
             Statement stmt = verbindung.createStatement()) {

            // Anfrage wird vorbereitet.
            ResultSet daten = stmt.executeQuery("SELECT * FROM kunden");

            // Daten anzeigen.
            while (daten.next()) {
                System.out.println(daten.getString("vorname") + " " + daten.getString("nachname"));
            }

            // Verbindung und stmt werden automatisch geschlossen.

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
