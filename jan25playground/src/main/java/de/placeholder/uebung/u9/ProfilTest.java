package de.placeholder.uebung.u9;

public class ProfilTest {

    public static void main(String[] args) {

        Benutzerkonto3 b1 = new Benutzerkonto3("asd", "asd", false);
        Profil p1 = new Profil("Jin-Woo", "Sung", "8.März.XXXX");


        b1.speicherProfil(p1);
        b1.zeigeStatus();
    }
}
