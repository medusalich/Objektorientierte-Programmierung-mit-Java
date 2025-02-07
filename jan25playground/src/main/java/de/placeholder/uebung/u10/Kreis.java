package de.placeholder.uebung.u10;

public class Kreis {

    private double radius;

    public Kreis() {
        this.radius = 0.0;
    }

    public Kreis(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getUmfang() {
        return (2 * Math.PI * radius);
    }

    public double getFlaeche() {
        return (Math.PI * Math.pow(radius, 2));
    }
}
