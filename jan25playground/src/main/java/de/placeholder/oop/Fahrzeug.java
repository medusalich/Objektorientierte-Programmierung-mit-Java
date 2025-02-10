package de.placeholder.oop;

public class Fahrzeug {

    private String kennzeichen;

    private String marke;

    private String modell;

    private int baujahr;

    private int kmStand;

    // Hier wird ein Motor Objekt abgelegt.
    private Motor motor;

    public Fahrzeug(String kennzeichen, String marke, String modell, int baujahr, int kmStand) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
        this.kmStand = kmStand;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
