package de.placeholder.uebung.u16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaffeeAutomatDisplay {

    /**
     * Startet die Anzeige des Kaffeeautomaten.
     */
    public static void main(String[] args) {

        display();

    }

    /**
     * Hauptanzeigemethode, die dem Benutzer alle Produkte anzeigt und auswählen lassen kann.
     */
    public static void display() {

        Scanner scanner = new Scanner(System.in);
        KaffeeAutomat automat = new KaffeeAutomat();

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
    }
}

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
}

class Produkt {

    private final String name;
    private final int ml;

    /**
     * Erstellt ein neues Produkt mit einem Namen, einem Preis und der Menge.
     */
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

class KaffeeAutomat {

    private final StringBuilder sb = new StringBuilder();
    private final Scanner scanner = new Scanner(System.in);
    private final List<AutomatenProdukt> produkte = new ArrayList<>();

    public KaffeeAutomat() {
        produkte.add(new AutomatenProdukt(new Espresso(), 1.50, 0));
        produkte.add(new AutomatenProdukt(new LatteMacchiato(), 2.50, 20));
        produkte.add(new AutomatenProdukt(new Cappuccino(), 2.00, 20));
        produkte.add(new AutomatenProdukt(new SchwarzerKaffee(), 0.50, 20));
        produkte.add(new AutomatenProdukt(new HeisseSchokolade(), 1.00, 20));
        produkte.add(new AutomatenProdukt(new Tomatensuppe(), 0.80, 10));
        produkte.add(new AutomatenProdukt(new HeissesWasser(), 0.00, 30));
    }

    public List<AutomatenProdukt> getProdukte() {
        return produkte;
    }

    public void bezahlen(AutomatenProdukt produkt) {

        double eingeworfenerBetrag = 0;
        while (true) {
            System.out.println("Bitte den Betrag einwerfen: ");
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
                        .append(" Euro. ")
                        .append("\n")
                        .append("Bitte genügend Geld einwerfen.");
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
     *
     * @param produkt Das zu produzierende Produkt.
     */
    public void produziert(AutomatenProdukt produkt) {
        sb.setLength(0);
        sb.append("Einen Moment Bitte :)").append("\n");
        sb.append(produkt.getProdukt().getName()).append(" ist fertig, VORSICHT HEIß!");
        System.out.println(sb);
    }

    public boolean bestandPruefen(AutomatenProdukt produkt) {
        return produkt.getAnzahl() > 0;
    }
}

class MitarbeiterProtokoll {

    private final StringBuilder sb = new StringBuilder();
    private final List<String> protokoll = new ArrayList<>();
    private final String dateiName = "protokoll.txt";

    /**
     * Fügt ein Produkt zum Protokoll hinzu und schreibt es in die Datei.
     *
     * @param produkt Der Name des Produkts, das hinzugefügt wird.
     */
    public void hinzufuegen(String produkt) {
        protokoll.add(produkt);
        schreibeInDatei();
    }

    /**
     * Zeigt das aktuelle Protokoll an.
     */
    public void zeigeProtokoll() {
        if (protokoll.isEmpty()) {
            sb.append("\n").append("Leeres Protokoll");
            System.out.println(sb.toString());
        } else {
            sb.append("\n").append("Gewählte Produkte");
            for (String produkt : protokoll) {
                sb.append("\n").append("- ").append(produkt);
            }
            System.out.println(sb);
        }
    }

    /**
     * Schreibt das Protokoll in die Datei.
     */
    private void schreibeInDatei() {
        try (FileWriter fw = new FileWriter(dateiName, true)) {
            fw.write(protokoll.get(protokoll.size() - 1) + "\n");
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
        }
    }

    /**
     * Liest das Protokoll aus der Datei und aktualisiert die interne Liste.
     */
    public void leseProtokollAusDatei() {
        try (BufferedReader br = new BufferedReader(new FileReader(dateiName))) {
            String zeile;
            protokoll.clear(); // Vorherige Einträge löschen
            while ((zeile = br.readLine()) != null) {
                protokoll.add(zeile);
            }
        } catch (IOException e) {
            System.out.println("Fehler beim Lesen der Datei: " + e.getMessage());
        }
    }
}




