package de.placeholder.uebung.u9;

public class BenutzerkontoTest {

    public static void main(String[] args) {

        Benutzerkonto b1 = new Benutzerkonto();

        System.out.println();

        b1.zeigeStatus();
        System.out.println(b1);

        System.out.println();

        b1.kontoAktivieren();
        System.out.println(b1);

        System.out.println();

        b1.kontoDeaktivieren();
        System.out.println(b1);
    }
}
