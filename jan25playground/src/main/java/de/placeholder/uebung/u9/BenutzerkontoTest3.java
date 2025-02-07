package de.placeholder.uebung.u9;

public class BenutzerkontoTest3 {

    public static void main(String[] args) {

        Benutzerkonto3 b1 = new Benutzerkonto3("hans", "hans@hanshans.de", false);

        b1.zeigeStatus();
        b1.kontoAktivieren();
        System.out.println(b1);
        System.out.println();

        //Neue Email
        b1.aendereEmail("Hans@hanshans.de");
        System.out.println();

        //True
        b1.validiereBenutzernameUndEmail("hans", "Hans@hanshans.de");
        System.out.println();

        //False
        b1.validiereBenutzernameUndEmail("Hani", "Hani@hanshans.de");
        System.out.println();
    }
}

