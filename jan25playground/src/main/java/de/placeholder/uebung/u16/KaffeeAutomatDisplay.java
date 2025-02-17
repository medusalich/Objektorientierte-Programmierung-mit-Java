package de.placeholder.uebung.u16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Die Hauptklasse für die Anzeige und Interaktion mit dem Kaffeeautomaten.
 * Sie ermöglicht dem Benutzer, Produkte auszuwählen und Zahlungen durchzuführen.
 */
public class KaffeeAutomatDisplay {

    /**
     * Startet die Anzeige des Kaffeeautomaten.
     */
    public static void main(String[] args) {

        display();

    }

    /**
     * Zeigt die verfügbaren Produkte des Kaffeeautomaten an und ermöglicht dem Benutzer,
     * ein Produkt auszuwählen. Überprüft den Bestand und führt die Zahlung durch.
     */
    public static void display() {

        Scanner scanner = new Scanner(System.in);
        KaffeeAutomat automat = new KaffeeAutomat();

        automat.leseAusDatei();

        AutomatenProdukt produkt = null;

        while (true) {
            List<AutomatenProdukt> produkte = automat.getProdukte();
            for (int i = 0; i < produkte.size(); i++) {
                int position = i + 1;
                String name = produkte.get(i).getProdukt().getName();
                int menge = produkte.get(i).getProdukt().getMl();
                double preis = produkte.get(i).getPreis();
                System.out.printf("%d %-20s %3d ml %6.2f\n", position, name, menge, preis);

            }
            System.out.println("\nWählen die Zahl für ein Getränk aus: ");
            int auswahl = scanner.nextInt();

            if ((auswahl > 0) && (auswahl <= produkte.size())) {
                produkt = produkte.get(auswahl - 1);
                if (automat.bestandPruefen(produkt)) {
                    break;
                } else {
                    System.out.println("Getränk leer, bitte Mitarbeiter informieren.\n");
                }
            }
            else {
                System.out.println("Ungültige Auswahl.");
            }

        }

        automat.bezahlen(produkt);

        automat.produziert(produkt);

        automat.schreibeInDatei();
    }
}

/**
 * Repräsentiert ein Produkt im Kaffeeautomaten mit Preis und Verfügbarkeit.
 */
class AutomatenProdukt {

    private Produkt produkt;
    private double preis;
    private int anzahl;

    public AutomatenProdukt(Produkt produkt, double preis, int anzahl) {
        this.produkt = produkt;
        this.preis = preis;
        this.anzahl = anzahl;
    }

    public Produkt getProdukt() {
        return produkt;
    }

    public double getPreis() {
        return preis;
    }

    public int getAnzahl() {
        return anzahl;
    }

    public void setAnzahl(int anzahl) {
        this.anzahl = anzahl;
    }

    public void reduziereAnzahl() {
         anzahl -= 1;
    }
}

/**
 * Repräsentiert ein Produkt mit einem Namen und einer Menge in Millilitern.
 */
class Produkt {

    private final String name;
    private final int ml;

    protected Produkt(String name, int ml) {
        this.name = name;
        this.ml = ml;
    }

    public String getName() {
        return name;
    }

    public int getMl() {
        return ml;
    }
}

class Espresso extends Produkt {
    public Espresso() {
        super("Espresso", 45);
    }
}

class LatteMacchiato extends Produkt {
    public LatteMacchiato() {
        super("Latte Macchiato", 150);
    }
}

class Cappuccino extends Produkt {
    public Cappuccino() {
        super("Cappuccino", 150);
    }
}

class SchwarzerKaffee extends Produkt {
    public SchwarzerKaffee() {
        super("Schwarzer Kaffee", 200);
    }
}

class HeisseSchokolade extends Produkt {
    public HeisseSchokolade() {
        super("Heiße Schokolade", 250);
    }
}

class Tomatensuppe extends Produkt {
    public Tomatensuppe() {
        super("Tomatensuppe", 250);
    }
}

class HeissesWasser extends Produkt {
    public HeissesWasser() {
        super("Heißes Wasser", 250);
    }
}

/**
 * Repräsentiert den Kaffeeautomaten, der Produkte verwaltet, Zahlungen verarbeitet
 * und den Bestand überwacht.
 */
class KaffeeAutomat {

    private final StringBuilder sb = new StringBuilder();
    private final Scanner scanner = new Scanner(System.in);
    private final List<AutomatenProdukt> produkte = new ArrayList<>();
    private final String dateiName = "protokoll.txt";

    public KaffeeAutomat() {
        produkte.add(new AutomatenProdukt(new Espresso(), 1.50, 0));
        produkte.add(new AutomatenProdukt(new LatteMacchiato(), 2.50, 20));
        produkte.add(new AutomatenProdukt(new Cappuccino(), 2.00, 20));
        produkte.add(new AutomatenProdukt(new SchwarzerKaffee(), 0.50, 20));
        produkte.add(new AutomatenProdukt(new HeisseSchokolade(), 1.00, 20));
        produkte.add(new AutomatenProdukt(new Tomatensuppe(), 0.80, 10));
        produkte.add(new AutomatenProdukt(new HeissesWasser(), 0.00, 30));
    }

    /**
     * Schreibt die aktuellen Bestände der Produkte in eine Datei.
     */
    public void schreibeInDatei() {
        try (FileWriter fw = new FileWriter(dateiName)) {
            for (AutomatenProdukt produkt : produkte) {
                fw.write(produkt.getAnzahl() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
        }
    }

    /**
     * Liest die Bestände der Produkte aus einer Datei und aktualisiert die internen Werte.
     */
    public void leseAusDatei() {
        try (BufferedReader br = new BufferedReader(new FileReader(dateiName))) {
            String zeile;
            int i = 0;
            while ((zeile = br.readLine()) != null) {
                produkte.get(i).setAnzahl(Integer.valueOf(zeile));
                i++;
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }

    public List<AutomatenProdukt> getProdukte() {
        return produkte;
    }

    /**
     * Verarbeitet die Zahlung für das ausgewählte Produkt. Fordert den Benutzer auf,
     * Münzen einzuwerfen, und gibt Rückmeldungen zur Zahlung.
     */
    public void bezahlen(AutomatenProdukt produkt) {

        double eingeworfenerBetrag = 0;
        while (true) {
            System.out.println("Münzen einwerfen: ");
            double betrag = scanner.nextDouble();
            eingeworfenerBetrag += betrag;

            if (eingeworfenerBetrag < produkt.getPreis()) {
                sb.setLength(0);
                sb.append("\n")
                        .append("Nicht genügend Geld. ")
                        .append("\n")
                        .append("Der Preis für ")
                        .append(produkt.getProdukt().getName())
                        .append(" beträgt ")
                        .append(String.format("%.2f", produkt.getPreis()))
                        .append(" Euro. ");
                System.out.println(sb);
                continue;
            }

            sb.setLength(0);
            sb.append("\n").append("Zahlung erfolgreich. ");
            if (eingeworfenerBetrag > produkt.getPreis()) {
                double rueckgeld = eingeworfenerBetrag - produkt.getPreis();
                sb.append("\n")
                        .append("Du bekommst ")
                        .append(String.format("%.2f", rueckgeld))
                        .append(" Euro Rückgeld. ");
            }
            sb.append("\n").append(produkt.getProdukt().getName()).append(" wird zubereitet. ");
            System.out.println(sb);
            break;
        }
    }

    /**
     * Produziert das ausgewählte Produkt und gibt eine entsprechende Meldung aus.
     */
    public void produziert(AutomatenProdukt produkt) {
        sb.setLength(0);
        sb.append("Einen Moment Bitte :)").append("\n");
        sb.append(produkt.getProdukt().getName()).append(" ist fertig, VORSICHT HEIß!");
        produkt.reduziereAnzahl();
        System.out.println(sb);
    }

    /**
     * Überprüft, ob das angegebene Produkt im Automaten verfügbar ist.
     *
     * @param produkt Das Produkt, dessen Bestand überprüft wird.
     * @return true, wenn das Produkt verfügbar ist, andernfalls false.
     */
    public boolean bestandPruefen(AutomatenProdukt produkt) {
        return produkt.getAnzahl() > 0;
    }
}

//class MitarbeiterProtokoll {
//
//    private final StringBuilder sb = new StringBuilder();
//    private final List<String> protokoll = new ArrayList<>();
//    private final String dateiName = "protokoll.txt";
//
//    public void hinzufuegen(String produkt) {
//        protokoll.add(produkt);
//        schreibeInDatei();
//    }
//
//    public void zeigeProtokoll() {
//        if (protokoll.isEmpty()) {
//            sb.append("\n").append("Leeres Protokoll");
//            System.out.println(sb.toString());
//        } else {
//            sb.append("\n").append("Gewählte Produkte");
//            for (String produkt : protokoll) {
//                sb.append("\n").append("- ").append(produkt);
//            }
//            System.out.println(sb);
//        }
//    }
//
//    private void schreibeInDatei() {
//        try (FileWriter fw = new FileWriter(dateiName, true)) {
//            fw.write(protokoll.get(protokoll.size() - 1) + "\n");
//        } catch (IOException e) {
//            System.out.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
//        }
//    }
//
//    public void leseProtokollAusDatei() {
//        try (BufferedReader br = new BufferedReader(new FileReader(dateiName))) {
//            String zeile;
//            protokoll.clear(); // Vorherige Einträge löschen
//            while ((zeile = br.readLine()) != null) {
//                protokoll.add(zeile);
//            }
//        } catch (IOException e) {
//            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
//        }
//    }
//}




