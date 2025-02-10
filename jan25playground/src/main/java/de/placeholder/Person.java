package de.placeholder;

public class Person {

    // String = Text
    public String vorname;

    public String nachname;

    public int alter;

    public boolean fuehrerschein;

    // Erzeugt ein leeres Person-Objekt
    public Person() {
    }

    // Konstruktoren erzeugen ein Objekt nach Vorgabe
    // Heißen IMMER gleich wie die Klasse
    public Person(String vorname, String nachname, int alter, boolean hatFuehrerschein) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.fuehrerschein = hatFuehrerschein;
    }

    public void sagHallo() {
        System.out.println("Hallo! Mein Name ist " + vorname + " " + nachname);
    }

    public void sagAlter() {
        System.out.println("Ich bin " + alter + " Jahre alt.");
    }

    public void hatFuehrerschein() {
        if(fuehrerschein) {
            System.out.println("Ich habe einen Führerschein.");
        }
        else {
            System.out.println("Ich habe noch keinen Führerschein.");
        }
    }

    // Methode zum Konvertieren in einen String
    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", alter=" + alter +
                ", fuehrerschein=" + fuehrerschein +
                '}';
    }


}


