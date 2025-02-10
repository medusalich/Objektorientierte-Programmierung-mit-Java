package de.placeholder.uebung.u12;

public class SummeOverloading {

    /*
    Aufgabe 1:
    Schreibe eine Methode, die mehrere Zahlen entgegennimmt und eine Summe davon zurückgibt.
    Und eine zweite gleichnamige Methode mit nur 2 Zahlen. Sie gibt ebenfalls eine Summe zurück.
     */

    public double summeZahlen(double...j) {
        double ergebnis = 0;
        for (double i : j) {
            ergebnis += i;
        }
        return ergebnis;
    }

    public double summeZahlen(double i, double j) {
        return i + j;
    }

    public static void main(String[] args) {

        SummeOverloading summeO = new SummeOverloading();
        System.out.println(summeO.summeZahlen(5,8,13,50,666));
        System.out.println(summeO.summeZahlen(10,10));
        System.out.println(summeO.summeZahlen(10));
        System.out.println(summeO.summeZahlen());
    }
}


