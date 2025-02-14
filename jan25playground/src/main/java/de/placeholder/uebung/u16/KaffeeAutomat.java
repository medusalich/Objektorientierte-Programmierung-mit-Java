package de.placeholder.uebung.u16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KaffeeAutomat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Kaffeemaschine maschine = new Kaffeemaschine();

        System.out.println("\n1. Espresso" +
                "\n2. Latte Macchiato" +
                "\n3. Cappuccino" +
                "\n4. Schwarzer Kaffee" +
                "\n5. Heiße Schokolade" +
                "\n6. Tomatensuppe" +
                "\nWählen ein Getränk aus : ");
        int auswahl = scanner.nextInt();

        Automatenprodukt produkt = null;
        switch (auswahl) {
            case 1 -> produkt = new Espresso();
            case 2 -> produkt = new LatteMacchiato();
            case 3 -> produkt = new Cappuccino();
            case 4 -> produkt = new SchwarzerKaffee();
            case 5 -> produkt = new HeisseSchokolade();
            case 6 -> produkt = new Tomatensuppe();
            default -> System.out.println("Ungültige Auswahl.");
        }

        assert produkt != null;
        maschine.produziert(produkt);

        System.out.println("Bitte den Betrag einwerfen: ");
        double betrag = scanner.nextDouble();
        maschine.bezahlen(betrag, produkt);
    }
}

interface Zahlbar {
    double getPreis();
}

abstract class Automatenprodukt implements Zahlbar {
    protected String name;
    protected double preis;

    public String getName() {
        return name;
    }

    @Override
    public double getPreis() {
        return preis;
    }
}

class Espresso extends Automatenprodukt {
    public Espresso() {
        this.name = "Espresso";
        this.preis = 1.50;
    }
}

class LatteMacchiato extends Automatenprodukt {
    public LatteMacchiato() {
        this.name = "Latte Macchiato";
        this.preis = 2.50;
    }
}

class Cappuccino extends Automatenprodukt {
    public Cappuccino() {
        this.name = "Cappuccino";
        this.preis = 2.00;
    }
}

class SchwarzerKaffee extends Automatenprodukt {
    public SchwarzerKaffee() {
        this.name = "Schwarzer Kaffee";
        this.preis = 0.50;
    }
}

class HeisseSchokolade extends Automatenprodukt {
    public HeisseSchokolade() {
        this.name = "Heiße Schokolade";
        this.preis = 1.00;
    }
}

class Tomatensuppe extends Automatenprodukt {
    public Tomatensuppe() {
        this.name = "Tomatensuppe";
        this.preis = 0.80;
    }
}

class Kaffeemaschine {
    StringBuilder sb = new StringBuilder();
    List<String> protokoll = new ArrayList<>();

    public void bezahlen(double betrag, Automatenprodukt produkt) {
        if (betrag < produkt.getPreis()) {
            sb.append("\n")
                    .append("Nicht genügend Geld. Der Preis für ")
                    .append(produkt.getName())
                    .append(" beträgt ")
                    .append(produkt.getPreis())
                    .append(" Euro. ");
            System.out.println(sb.toString());
        } else if (betrag > produkt.getPreis()) {
            double rueckgeld = betrag - produkt.getPreis();
            sb.append("\n")
                    .append("Du bekommst ")
                    .append(String.format("%.2f", rueckgeld))
                    .append(" Euro Rückgeld. ")
                    .append("\n")
                    .append(produkt.getName())
                    .append(" wird zubereitet. ");
            System.out.println(sb.toString());
        } else {
            sb.append("\n")
                    .append("Zahlung erfolgreich. ")
                    .append("\n")
                    .append(produkt.getName())
                    .append(" wird zubereitet. ");
            System.out.println(sb.toString());
        }
    }

    public void produziert(Automatenprodukt produkt) {
        sb.append("Einen Moment Bitte :)");
    }

    public void zeigeProtokoll() {
        if (protokoll.isEmpty()) {
            sb.append("\n").append("Leeres Protokoll");
            System.out.println(sb.toString());
        }
        else {
            sb.append("\n").append("Gewählte Produkte");
            for (String produkt : protokoll) {
                sb.append("\n").append("- ").append(produkt);
                System.out.println(sb.toString());
            }
        }
    }
}
