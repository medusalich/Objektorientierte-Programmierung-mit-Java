package de.placeholder.uebung.u12;

import java.util.ArrayList;
import java.util.List;

public class EinkaufsListe {

    private final List<String> einkaufsliste = new ArrayList<>();

    public void listeFuellen(String artikel) {
        einkaufsliste.add(artikel);
    }

    public String listeAusgeben() {
        StringBuilder liste = new StringBuilder();
        for (String artikel : einkaufsliste) {
            liste.append(artikel).append("\n");
        }
        return liste.toString();
    }
}
