package de.placeholder.uebung.u21;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TiereCrud {

    private final String TABLE = "tiere";

    public List<Tier> findAll() throws SQLException {

        try (Connection verbindung = DbUtilityTier.getConnection();
             Statement stmt = verbindung.createStatement()) {

            ResultSet daten = stmt.executeQuery("SELECT * FROM " + TABLE);

            List<Tier> kunden = new ArrayList<>();
            while (daten.next()) {
                kunden.add(create(daten));
            }
            return kunden;
        }
    }

    public boolean insert(Tier tier) throws SQLException {

        try (Connection verbindung = DbUtilityTier.getConnection();
             Statement stmt = verbindung.createStatement()) {

            final String SQL = "INSERT INTO " + TABLE + " (id, chip_nr, name, tierart, rasse, aktiv) " +
                    "VALUES(NULL, '%d', '%s', '%s', '%s', true)";

            return stmt.executeUpdate(String.format(SQL,
                    tier.getChip_nr(),
                    tier.getName(),
                    tier.getTierart(),
                    tier.getRasse(),
                    tier.isAktiv())) > 0;
        }
    }

    private Tier create(ResultSet zeile) throws SQLException {
        Tier tier = new Tier();
        tier.setId(zeile.getInt("id"));
        tier.setChip_nr(zeile.getInt("chip_nr"));
        tier.setName(zeile.getString("name"));
        tier.setTierart(zeile.getString("tierart"));
        tier.setRasse(zeile.getString("rasse"));
        tier.setAktiv(zeile.getBoolean("aktiv"));
        return tier;
    }
}
