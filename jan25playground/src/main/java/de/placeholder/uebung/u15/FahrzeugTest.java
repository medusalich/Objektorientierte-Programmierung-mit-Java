package de.placeholder.uebung.u15;

public class FahrzeugTest {

    public static void main(String[] args) {

        Pkw pkw = new Pkw("Auto");
        Motorrad motorrad = new Motorrad("Motorrad");
        Boot boot = new Boot("Boot");
        Flugzeug flugzeug = new Flugzeug("Flugzeug");


        pkw.vorwaertsFahren();
        pkw.rueckwaertsFahren();

        motorrad.vorwaertsFahren();
        motorrad.rueckwaertsFahren();

        boot.vorwaertsFahren();
        boot.rueckwaertsFahren();

        flugzeug.vorwaertsFahren();
        flugzeug.rueckwaertsFahren();
    }
}

class Fahrzeug {

    private String fahrzeug;

    public Fahrzeug(String fahrzeug) {
        this.fahrzeug = fahrzeug;
    }

    public void vorwaertsFahren() {
        System.out.println(fahrzeug + " fährt vorwärts.\n");
    }

    public void rueckwaertsFahren() {
        System.out.println(fahrzeug + " fährt rückwärts.\n");
    }

    public String getFahrzeug() {
        return fahrzeug;
    }
}

class Pkw extends Fahrzeug {

    public Pkw(String fahrzeug) {
        super(fahrzeug);
    }
}

class Motorrad extends Fahrzeug {

    public Motorrad(String fahrzeug) {
        super(fahrzeug);
    }

    @Override
    public void rueckwaertsFahren() {
        System.out.println(getFahrzeug() + " kann nicht rückwärts fahren.\n");
    }
}

class Boot extends Fahrzeug {

    public Boot(String fahrzeug) {
        super(fahrzeug);
    }
}

class Flugzeug extends Fahrzeug {

    public Flugzeug(String fahrzeug) {
        super(fahrzeug);
    }

    @Override
    public void rueckwaertsFahren() {
        System.out.println(getFahrzeug() + " kann nicht rückwärts fahren.\n");
    }
}

