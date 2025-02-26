package de.placeholder.libtest;

import de.placeholder.datenbanken.BenutzerCrud;

import java.sql.SQLException;

public class BenutzerTest {

    public static void main(String[] args) {

        try {
            BenutzerCrud crud = new BenutzerCrud();
            crud.delete(1);

        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
