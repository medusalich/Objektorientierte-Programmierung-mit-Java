package de.placeholder.uebung.u16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaffeeAutomatDisplay {

    public static void main(String[] args) {

        display();

    }

    public static void display() {

        Scanner scanner = new Scanner(System.in);
        KaffeeAutomat automat = new KaffeeAutomat();

        AutomatenProdukt produkt = null;

        while (true) {
            System.out.println("\n1. Espresso" +
                    "\n2. Latte Macchiato" +
                    "\n3. Cappuccino" +
                    "\n4. Schwarzer Kaffee" +
                    "\n5. Heiße Schokolade" +
                    "\n6. Tomatensuppe" +
                    "\n7. Heißes Wasser" +
                    "\nWählen ein Getränk aus : ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1 -> produkt = new Espresso();
                case 2 -> produkt = new LatteMacchiato();
                case 3 -> produkt = new Cappuccino();
                case 4 -> produkt = new SchwarzerKaffee();
                case 5 -> produkt = new HeisseSchokolade();
                case 6 -> produkt = new Tomatensuppe();
                case 7 -> produkt = new HeissesWasser();
                default -> System.out.println("Ungültige Auswahl.");
            }
            if (produkt != null) {
                break;
            }
        }

        automat.bezahlen(produkt);

        automat.produziert(produkt);
    }
}



interface Zahlbar {
    double getPreis();
}

class AutomatenProdukt implements Zahlbar {

    private final String name;
    private double preis;

    protected AutomatenProdukt(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
}

class Espresso extends AutomatenProdukt {
    public Espresso() {
        super("Espresso", 1.50);
    }
}

class LatteMacchiato extends AutomatenProdukt {
    public LatteMacchiato() {
        super("Latte Macchiato", 2.50);
    }
}

class Cappuccino extends AutomatenProdukt {
    public Cappuccino() {
        super("Cappuccino", 2.00);
    }
}

class SchwarzerKaffee extends AutomatenProdukt {
    public SchwarzerKaffee() {
        super("Schwarzer Kaffee", 0.50);
    }
}

class HeisseSchokolade extends AutomatenProdukt {
    public HeisseSchokolade() {
        super("Heiße Schokolade", 1.00);
    }
}

class Tomatensuppe extends AutomatenProdukt {
    public Tomatensuppe() {
        super("Tomatensuppe", 0.80);
    }
}

class HeissesWasser extends AutomatenProdukt {
    public HeissesWasser() {
        super("Heißes Wasser", 0.00);

    }
}

class KaffeeAutomat {
    StringBuilder sb = new StringBuilder();
    Scanner scanner = new Scanner(System.in);

    public void bezahlen(AutomatenProdukt produkt) {

        double eingeworfenerBetrag = 0;
        while (true) {
            System.out.println("Bitte den Betrag einwerfen: ");
            double betrag = scanner.nextDouble();
            eingeworfenerBetrag += betrag;

            if (eingeworfenerBetrag < produkt.getPreis()) {
                sb.setLength(0);
                sb.append("\n")
                        .append("Nicht genügend Geld. Der Preis für ")
                        .append(produkt.getName())
                        .append(" beträgt ")
                        .append(produkt.getPreis())
                        .append(" Euro. Bitte genügen Geld einwerfen.");
                System.out.println(sb.toString());
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
            sb.append("\n").append(produkt.getName()).append(" wird zubereitet. ");
            System.out.println(sb.toString());
            break;
        }
    }

    public void produziert(AutomatenProdukt produkt) {
        sb.setLength(0);
        sb.append("Einen Moment Bitte :)").append("\n");
        sb.append(produkt.getName()).append(" ist fertig, VORSICHT HEIß!");
        System.out.println(sb.toString());
    }
}

class MitarbeiterProtokoll {

    private List<String> protokoll = new ArrayList<>();
    private String dateiName = "protokoll.txt";

    public void hinzufuegen(String produkt) {
        protokoll.add(produkt);
        schreibeInDatei();
    }

    public void zeigeProtokoll() {
        StringBuilder sb = new StringBuilder();
        if (protokoll.isEmpty()) {
            sb.append("\n").append("Leeres Protokoll");
            System.out.println(sb.toString());
        } else {
            sb.append("\n").append("Gewählte Produkte");
            for (String produkt : protokoll) {
                sb.append("\n").append("- ").append(produkt);
            }
            System.out.println(sb.toString());
        }
    }

    private void schreibeInDatei() {
        try (FileWriter fw = new FileWriter(dateiName, true)) {
            fw.write(protokoll.get(protokoll.size() - 1) + "\n");
        } catch (IOException e) {
            System.out.println("Fehler beim Schreiben in die Datei: " + e.getMessage());
        }
    }

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




