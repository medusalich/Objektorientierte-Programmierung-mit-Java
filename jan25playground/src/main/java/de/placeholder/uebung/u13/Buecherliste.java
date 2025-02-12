package de.placeholder.uebung.u13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Buecherliste {

    private final List<Buch> buchListe = new ArrayList<>();

    private final String ROW_TPL = "| %18s | %10s | %15s | %5d | %15s | %15s | %5d | \n";

    public void hinzufuegen(Buch buch) {
        buchListe.add(buch);
    }

    public void printAusgeliehen() {
        print(BuecherAuswahl.AUSGELIEHEN);
    }

    public void printAngelegt() {
        print(BuecherAuswahl.ANGELEGT);
    }

    public void printVerzeichnis() {
        print(BuecherAuswahl.VERZEICHNIS);
    }

    private void print(BuecherAuswahl buecher) {
        for(Buch b : buchListe) {
            switch(buecher) {
                case AUSGELIEHEN -> {
                    if(b.isAusgeliehen())
                        System.out.printf(
                                ROW_TPL,
                                b.getIsbn(),
                                b.getAutor(),
                                b.getTitel(),
                                b.getErscheinungsjahr(),
                                b.getVerlag(),
                                b.getGenre(),
                                b.getSeitenanzahl());
                }
                case VERZEICHNIS -> {
                    if(!b.isAusgeliehen())
                        System.out.printf(
                                ROW_TPL,
                                b.getIsbn(),
                                b.getAutor(),
                                b.getTitel(),
                                b.getErscheinungsjahr(),
                                b.getVerlag(),
                                b.getGenre(),
                                b.getSeitenanzahl());
                }
                case ANGELEGT -> System.out.printf(
                        ROW_TPL,
                        b.getIsbn(),
                        b.getAutor(),
                        b.getTitel(),
                        b.getErscheinungsjahr(),
                        b.getVerlag(),
                        b.getGenre(),
                        b.getSeitenanzahl());
            }
        }
    }

//    public void speichernInDatei(String buecherlistendatei) {
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter(buecherlistendatei))) {
//            for (Buch buch : buchListe) {
//                writer.write(buchToString(buch));
//                writer.newLine();
//            }
//            System.out.println("Bücher wurden in die Datei gespeichert.");
//        } catch (IOException e) {
//            System.err.println("Fehler beim Speichern in die Datei: " + e.getMessage());
//        }
//    }
//
//    private String buchToString(Buch buch) {
//        return ROW_TPL(
//                buch.getIsbn(),
//                buch.getAutor(),
//                buch.getTitel(),
//                buch.getErscheinungsjahr(),
//                buch.getVerlag(),
//                buch.getGenre(),
//                buch.getSeitenanzahl(),
//                buch.isAusgeliehen())
//    }
}
