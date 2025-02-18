package de.placeholder.exception;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DeclareTestChecked {

    public static void main(String[] args) {
        // main-Methode ist die letzte Möglichkeit eine Exception zu behandeln.
        try {
            machWasAnderes();
        } catch (SQLException e) {
            System.out.println("Problem beim Verbinden mit der Datenbank.");
        }
    }

    private static void machWasAnderes() throws SQLException {
        // Entweder behandeln (try-catch) oder deklarieren (throws)
        machWas();
    }

    // Weitergabe der Exception an den Aufrufer der Methode erfolgt über throws.
    private static void machWas() throws SQLException { // throws = deklarieren
        // CheckedException
        // try-catch = Behandeln
        Connection connection = DriverManager.getConnection("xyz");
    }
}
