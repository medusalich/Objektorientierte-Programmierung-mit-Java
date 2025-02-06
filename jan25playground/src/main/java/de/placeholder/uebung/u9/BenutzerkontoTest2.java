package de.placeholder.uebung.u9;

public class BenutzerkontoTest2 {

    public static void main(String[] args) {

        Benutzerkonto2 b1 = new Benutzerkonto2();

        b1.zeigeStatus();
        b1.kontoAktivieren();
        System.out.println(b1);
        System.out.println();

        //Neue Email
        b1.aendereEmail("Hans@hanshans.de");
        System.out.println();

        //True
        b1.validiereBenutzernameUndEmail("Hans", "Hans@hanshans.de");
        System.out.println();

        //False
        b1.validiereBenutzernameUndEmail("Hani", "Hani@hanshans.de");
        System.out.println();
    }
}
