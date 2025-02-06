package de.placeholder.uebung.u9;

public class Benutzerkonto2 {

        private String benutzername;
        private String email;
        private boolean aktiv;

        public Benutzerkonto2() {
        }

        @Override
        public String toString() {
            return  "Benutzername: " + benutzername +
                    "\nEmail: " + email +
                    "\nKonto aktiv: " + (aktiv ? "Ja" : "Nein");
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
}
