package de.placeholder.uebung.u10;

public class Rechteck {

    private double laenge;
    private double breite;

    public Rechteck() {
        this.laenge = 0;
        this.breite = 0;
    }

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    public void setSeiten(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public double getBreite() {
        return breite;
    }

    public double getLangeSeite() {
        return Math.max(laenge, breite);
    }

    public double getKurzeSeite() {
        return Math.min(laenge, breite);
    }

    public double getDiagonale() {
        return Math.sqrt(laenge * laenge + breite * breite);
    }

    public double getFlaeche() {
        return (laenge * breite);
    }

    public double getUmfang() {
        return (2 * (laenge + breite));
    }
}
