package de.placeholder; // Kleinbuchstaben und Punkte und KEINE Sonderzeichen

public class FirstStep { // Klassenname

    //Namenskonventionen
    //PascalCase: Klassen- und Interfacenamen
    //camelCase: Methoden und Eigenschaften
    //snake_case: wird in Java nicht benutzt
    //SCREAMING_SNAKE_CASE: public Konstanten (Eigenschaften, die ihren Wert nicht ändern können)

    public static final double PI = 3.14; // Konstante

    private String kurzerText = "Hallo Text"; // Eigenschaft

    public void machWas() { //Methoden (haben eine Parameterklammer)
        System.out.println(kurzerText); //Ausgabe der Variable auf der Konsole
        System.out.println("Das ist das Haus vom Nikigraus"); //Ausgabe eines Literals
    }

    //Ohne main-Methode kann das Programm NICHT gestartet werden
    public static void main(String[] args) { //Einstiegspunkt als Methode
        FirstStep fs = new FirstStep(); //Objekt wird aus der Klasse erzeugt

        //Methodenaufruf
        fs.machWas(); //Aufruf der Methode auf einem Objekt

        //int = Ganzzahl
        int zahl = 10; //lokale Variable (nur in dieser Methode sichtbar)

        // zahl = 10.5; //Error: Die Zahl ist zu "groß" für diese Variable (Datentyp)
        zahl = 2_000; // int = NUR GANZZAHLEN (_ ist optional)
        System.out.println(zahl);

        //Variable für Text
        String name = "Peter Parker";
        //name = 1; //Error: 1 ist kein Text

        //Gleitkommazahl
        double zahl2 = 10.5; //Deklaration und Initialisierung
        System.out.println(zahl2);
        System.out.println(zahl + zahl2);
        zahl2 = 1; // Box zahl2 ist groß genug. Inhalt der Box wird ersetzt
        System.out.println(zahl2);
    }



}
