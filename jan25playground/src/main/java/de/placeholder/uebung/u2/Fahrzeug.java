package de.placeholder.uebung.u2;

public class Fahrzeug {

    private String kennzeichen;
    private String marke;
    private String modell;
    private double kilometerStand;

    public Fahrzeug(String kennzeichen, String marke, String modell, double kilometerStand) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.kilometerStand = kilometerStand;
    }

    public void fahren(int kilometer) {
        this.kilometerStand += kilometer;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "kennzeichen='" + kennzeichen + '\'' +
                ", marke='" + marke + '\'' +
                ", modell='" + modell + '\'' +
                ", kilometerStand=" + kilometerStand +
                '}';
    }
}
