package de.placeholder;

public class PersonenTest {

    public static void main(String[] args) {

        // Ein Objekt ist eine Sammlung unterschiedlicher Informationen
        // und Fähigkeiten (Methoden)
        Person p1 = new Person(); // Aus dem Bauplan (Klasse) wird ein Person_Objekt gebaut
        p1.vorname = "Peter"; // Wertzuweisung
        p1.nachname = "Parker";  // Wertzuweisung
        p1.alter = 25; // Wertzuweisung
        p1.fuehrerschein = true; // Wertzuweisung
        p1.sagHallo();
        p1.sagAlter();
        p1.hatFuehrerschein();

        System.out.println(); // Leerzeile

        Person p2 = new Person("Bruce", "Banner", 46, false); //Aus dem Bauplan (Klasse) wird ein Person_Objekt gebaut
        p2.sagHallo();
        p2.sagAlter();
        p2.hatFuehrerschein();

        System.out.println(); // Leerzeile

        Person p3 = new Person("Hans", "Bass", 72, true);
        p3.sagHallo();
        p3.sagAlter();
        p3.hatFuehrerschein();

        // primitive Datentypen: byte, short, int, char, float, double, boolean, null
        int i = 10;

        // komplexe Datentypen basieren IMMER auf einer Klasse
        String s = "Moin";

        // Komplexe Datentypen haben Methoden
        System.out.println(s.toUpperCase());
        System.out.println(s.substring(2));

        // Wenn vorhanden, wird automatisch die toString-Methode verwendet
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
