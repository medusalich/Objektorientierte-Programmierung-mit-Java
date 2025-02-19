package de.placeholder.uebung.u18;

public class StaubsaugerTest {

    public static void main(String[] args) {

        Staubsauger staubsauger = new Staubsauger();

        staubsauger.einschalten();
        staubsauger.saugen(10);
        staubsauger.beutelLeeren();
        staubsauger.akkuAufladen();
        staubsauger.ausschalten();

    }
}
