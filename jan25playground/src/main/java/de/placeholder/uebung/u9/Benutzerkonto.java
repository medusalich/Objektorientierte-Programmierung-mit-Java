package de.placeholder.uebung.u9;

public class Benutzerkonto {

    private String benutzername;
    private String email;
    private boolean aktiv;

    public Benutzerkonto() {
    }

    @Override
    public String toString() {
        return "Benutzername:" + benutzername +
               "\nEmail:" + email +
               "\nKonto aktiv:" + (aktiv ? "Ja" : "Nein")
                ;
    }

    public void kontoAktivieren() {
        if(aktiv == false) {
            aktiv = true;
            System.out.println("\nDas Benutzerkonto wurde aktiviert");
        }
    }

    public void kontoDeaktivieren() {
        if(aktiv == true) {
            aktiv = false;
            System.out.println("\nDas Benutzerkonto wurde deaktiviert");
        }
    }

    public String zeigeStatus () {

        benutzername = "Hans";
        email = "Hans@example.com";
        aktiv = false;
        return toString();
    }
}
