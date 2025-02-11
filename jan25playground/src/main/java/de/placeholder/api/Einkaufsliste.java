package de.placeholder.api;

import java.util.ArrayList;
import java.util.List;

public class Einkaufsliste {

    // Sammlung von Artikel-Objekten
    private final List<Artikel> produkt = new ArrayList<>();

    private final String ROW_TPL = "| %14s | %6d | %10.2f | %10s | \n";

    public void hinzufuegen(Artikel artikel) {
        produkt.add(artikel);
    }

    public void printGekaufte() {
        print(ArtikelAuswahl.GEKAUFTE);
        }

    public void printOffene() {
        print(ArtikelAuswahl.OFFENE);
        }

    public void printAlle() {
        print(ArtikelAuswahl.ALLE);
    }

    private void print(ArtikelAuswahl auswahl) {
        for(Artikel a : produkt) {
            switch (auswahl) {
                case GEKAUFTE -> {
                    if (a.isGekauft())
                        System.out.printf(ROW_TPL, a.getName(), a.getAnzahl(), a.getMaxPreis(), a.getDatum());
                }
                case OFFENE -> {
                    if(!a.isGekauft())
                        System.out.printf(ROW_TPL, a.getName(), a.getAnzahl(), a.getMaxPreis(), a.getDatum());
                }
                case ALLE -> System.out.printf(ROW_TPL, a.getName(), a.getAnzahl(), a.getMaxPreis(), a.getDatum());
            }
        }
    }
}
