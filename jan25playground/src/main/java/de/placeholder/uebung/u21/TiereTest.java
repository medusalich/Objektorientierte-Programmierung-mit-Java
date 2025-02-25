package de.placeholder.uebung.u21;

import java.sql.SQLException;

public class TiereTest {

    public static void main(String[] args) {

        TiereCrud crud = new TiereCrud();

        Tier tier1 = new Tier(234, "Mais", "Katze", "Japanese Bobtail");
        Tier tier2 = new Tier(345, "Paprika", "Katze", "Norwegische Waldkatze");
        Tier tier3 = new Tier(456, "Sesam", "Hund", "Briard");
        Tier tier4 = new Tier(567, "Peanut", "Hund", "Irish Setter");
        Tier tier5 = new Tier(678, "Mohn", "Hamster", "Teddyhamster");
        Tier tier6 = new Tier(789, "Hafer", "Hamster", "Goldhamster");
        Tier tier7 = new Tier(21, "Test", "Test", "Test");

        try {
            if(crud.insert(tier7)) {
                System.out.println("Wurde gespeichert!");
            }
            else {
                System.out.println("Konnte nicht gespeichert werden!");
            }

            System.out.println();

            for (Tier tier : crud.findAll()) {
                System.out.println(tier.getId() + ": " +
                        tier.getChip_nr() + ", " +
                        tier.getName() + ", " +
                        tier.getTierart() + ", " +
                        tier.getRasse() + ", " +
                        ((tier.isAktiv()) ? "aktiv" : "nicht aktiv"));
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
