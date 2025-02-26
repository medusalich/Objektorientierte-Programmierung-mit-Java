package de.placeholder.datenbanken;

public class Benutzer extends AbstractEntity {

    // Durch Vererbung ist hier die Id enthalten
    private String vorname;

    private String nachname;

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }
}
