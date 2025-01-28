package de.placeholder.uebung.u2;

public class FahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug Auto1 = new Fahrzeug("DD-HH-22", "VW", "TDI-5", 5008.0);
        Fahrzeug Auto2 = new Fahrzeug("WW-LL-88", "SEAT", "Leon", 6449.9);

        Auto1.fahren(150);
        Auto2.fahren(556);

        Auto1.fahren(75);
        Auto2.fahren(235);

        Auto1.fahren(985);
        Auto2.fahren(456);

        System.out.println(Auto1);
        System.out.println(Auto2);
    }
}
