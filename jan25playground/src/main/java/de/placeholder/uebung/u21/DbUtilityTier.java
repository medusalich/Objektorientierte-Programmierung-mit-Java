package de.placeholder.uebung.u21;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtilityTier {

    private static final String URL = "jdbc:mysql://localhost:3306/tierverwaltung";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private DbUtilityTier() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
