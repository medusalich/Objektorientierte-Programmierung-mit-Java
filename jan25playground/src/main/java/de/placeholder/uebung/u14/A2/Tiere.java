package de.placeholder.uebung.u14.A2;

public class Tiere {

    public static void main(String[] args) {
        Hund hund = new Hund("Sesam");
        Katze katze = new Katze("Mais");
        Kuh kuh = new Kuh("Muhkuh");

        hund.bewegen();
        hund.lautGeben();

        katze.bewegen();
        katze.lautGeben();

        kuh.bewegen();
        kuh.lautGeben();
    }
}

abstract class Tierart {

    protected String name;

    public void bewegen() {
        System.out.println(name + " bewegt sich nach vorne.");
    }

    public abstract void lautGeben();
}

class Kuh extends Tierart {
    public Kuh(String name) {
        this.name = name;
    }

    @Override
    public void lautGeben() {
        System.out.println(name + " muht.");
    }
}

class Katze extends Tierart {
    public Katze(String name) {
        this.name = name;
    }

    @Override
    public void lautGeben() {
        System.out.println(name + " miaut.");
    }
}

class Hund extends Tierart {
    public Hund(String name) {
        this.name = name;
    }

    @Override
    public void lautGeben() {
        System.out.println(name + " bellt.");
    }
}
