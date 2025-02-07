package de.placeholder.uebung.u9;

public class Benutzerkonto3 {

    private String benutzername;
    private String email;
    private boolean aktiv;

    private Profil profil;

    public Benutzerkonto3(String benutzername, String email, boolean aktiv) {
        this.benutzername = benutzername;
        this.email = email;
        this.aktiv = aktiv;
    }

//    @Override
//    public String toString() {
//        return  "Benutzername: " + benutzername +
//                "\nEmail: " + email +
//                "\nKonto aktiv: " + (aktiv ? "Ja" : "Nein");
//    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void kontoAktivieren() {
        if(!aktiv) {
            aktiv = true;
            System.out.println("\nDas Benutzerkonto wurde aktiviert");
        }
    }

    public void kontoDeaktivieren() {
        if(aktiv) {
            aktiv = false;
            System.out.println("\nDas Benutzerkonto wurde deaktiviert");
        }
    }

    public void zeigeStatus () {
        System.out.println("Benutzername: " + benutzername + "\nEmail: " + email + "\nKonto aktiv: " + (aktiv ? "Ja" : "Nein"));
        if(profil != null)
            profil.zeigeProfil();
    }

    public void aendereEmail(String neueEmail) {
        this.email = neueEmail;
        System.out.println("Die E-mail-adresse wurde erfolgreich geändert zu: " + this.email);
    }

    boolean validiereBenutzernameUndEmail(String benutzername, String email) {
        System.out.println("Konto Validierung mit: " + benutzername + ", " + email);
        if(this.benutzername.equals(benutzername) && this.email.equals(email)) {
            System.out.println("Validierung erfolgreich: Ja");
            return true;
        }
        else {
            System.out.println("Validierung erfolgreich: Nein");
            return false;
        }
    }

    public void speicherProfil(Profil profil) {
        this.profil = profil;
        System.out.println("Profil wurde dem Benutzerkonto hinzugefügt.");
    }
}

