package de.placeholder.uebung.u15;

public class GasthofTest {

    public static void main(String[] args) {

        Gasthof gasthof = new Gasthof();

        Radfahrer r1 = new Radfahrer("Bruce");
        Wanderer w1 = new Wanderer("Peter");

        gasthof.bewirten(r1);
        gasthof.ausruhen(r1);
        gasthof.versogen(r1);

        System.out.println();

        gasthof.bewirten(w1);
        gasthof.ausruhen(w1);
        gasthof.versogen(w1);
    }
}

class Gasthof {
    public void ausruhen(Gast gast) {
        System.out.println(gast.getBezeichnung() + " ruht sich aus.");
    }

    public void bewirten(Gast gast) {
        System.out.println(gast.getBezeichnung() + " wird bewirtet.");
    }

    public void versogen(Tierhalter tierhalter) {
        System.out.println(tierhalter.getTier() + " wird mit Futter und Wasser versorgt");
    }
}

interface Gast {
    String getBezeichnung();
}

interface Tierhalter {
    String getTier();
}

class Radfahrer extends Person implements Gast, Tierhalter {

    public Radfahrer(String name) {
        super(name);
    }

    @Override
    public String getBezeichnung() {
        return "Radfahrer " + getName();
    }

    @Override
    public String getTier() {
        return "Katze Mais";
    }
}

class Wanderer extends Person implements Gast, Tierhalter {

    public Wanderer(String name) {
        super(name);
    }

    @Override
    public String getBezeichnung() {
        return "Wanderer " + getName();
    }

    @Override
    public String getTier() {
        return "Hund Sesam";
    }
}

class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}