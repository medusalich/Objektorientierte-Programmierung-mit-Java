package de.placeholder.uebung.u11;

public class Benutzer {

    private String name;
    private int alter;
    private double gewicht;
    private double groesse;

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public void setGroesse(double groesse) {
        this.groesse = groesse;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public double getGewicht() {
        return gewicht;
    }

    public double getGroesse() {
        return groesse;
    }

    public Benutzer(String name, int alter, double gewicht, double groesse) {
        this.name = name;
        this.alter = alter;
        this.gewicht = gewicht;
        this.groesse = groesse;
    }

    public Benutzer(String name, int alter, double gewicht) {
        this.name = name;
        this.alter = alter;
        this.gewicht = 70;
        this.groesse = 170;
    }
}
