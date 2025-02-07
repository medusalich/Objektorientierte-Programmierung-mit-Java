package de.placeholder.uebung.u9;

public class Profil {

    private final String vorname;
    private final String nachname;
    private final String geburtsDatum;

    public Profil(String vorname, String nachname, String geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    public void zeigeProfil() {
        System.out.println("Vorname: " + vorname + "\nNachname: " + nachname + "\nGeburtsdatum: " + geburtsDatum);
    }
}
