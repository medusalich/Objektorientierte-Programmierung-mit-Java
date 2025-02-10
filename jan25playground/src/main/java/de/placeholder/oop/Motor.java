package de.placeholder.oop;

public class Motor {

    private final String typ;
    private final String modellNr;
    private final int anzahlZylinder;
    private final int staerkeInPs;
    private final double hubraum;

    // finale Instanzvariablen müssen gleich einen Wert zugewiesen bekommen
    // oder spätestens im Konstruktor gesetzt werden.

    public Motor(String typ, String modellNr, int anzahlZylinder, int staerkeInPs, double hubraum) {
        this.typ = typ;
        this.modellNr = modellNr;
        this.anzahlZylinder = anzahlZylinder;
        this.staerkeInPs = staerkeInPs;
        this.hubraum = hubraum;
    }

    public String getTyp() {
        return typ;
    }

    public String getModellNr() {
        return modellNr;
    }

    public int getAnzahlZylinder() {
        return anzahlZylinder;
    }

    public int getStaerkeInPs() {
        return staerkeInPs;
    }

    public double getHubraum() {
        return hubraum;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "typ='" + typ + '\'' +
                ", modellNr='" + modellNr + '\'' +
                ", anzahlZylinder=" + anzahlZylinder +
                ", staerkeInPs=" + staerkeInPs +
                ", hubraum=" + hubraum +
                '}';
    }
}
