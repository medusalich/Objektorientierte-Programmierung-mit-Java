package de.placeholder;

public class VariablenTest {

    //Automatisch package-private
    static int zahl = 100; //Klassenvariable: gehören dem Bauplan

    int andereZahl = 500; //Instanzvariable: gehören dem Objekt

    //Scopes:
    //Lokale Variablen leben nur bis zum Ende der umgebenden Methode.
    //Instanzvariablen leben nur solange das Objekt da ist.
    //Klassenvariablen leben ab dem laden der Klasse bis zum Ende des Programms.

    public static void main(String[] args) {

        //Lokale Variable = Variable wird in einer Methode deklariert
        int ganzAndereZahl = -800;
    }
}
