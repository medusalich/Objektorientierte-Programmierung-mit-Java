package de.placeholder.uebung.u7;

public class Produkte {

    private final String name;
    private final String beschreibung;
    private final double preis;


    public Produkte(String name, String beschreibung, double preis) {
        this.name = name;
        this.beschreibung = beschreibung;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", beschreibung='" + beschreibung + '\'' +
                ", preis=" + preis +
                '}';
    }

}
