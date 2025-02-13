package de.placeholder.vererbung;

// Top-Level-Klassen sind IMMER public oder package-private.
// protected und private sind nicht erlaubt!!!

public class InterfaceTest {

    public static void main(String[] args) {

        Fahrrad f = new Fahrrad();
        f.bewege(20, 25);
        f.bewege(17, 0);

        System.out.println();

        Bewegbar b = new Fahrrad();
        b.bewege(17, 0);

        System.out.println();

        GibtLicht l = new Fahrrad();
        l.leuchten(); // Die Referenz eines Interface bietet nur Methoden an, die drin deklariert sind.

        l = new Lampe();
        l.leuchten();

        // Instanzmethoden werden auf dem Objekttyp (rechte Seite) ausgeführt.
        // Klassenmethoden werden auf dem Referenztyp (linke Seite) ausgeführt.
        GibtLicht l2 = new Fahrrad();

        // Ein Interface kann auch seit java 1.7 statische Methoden enthalten.
        // Statische-Methoden eines Interfaces werden nicht vererbt.
    }

    // Innere-Klasse (nicht Top-Level) können auch static, protected und private sein.
    class Inner {

    }
}

// Ein Interface beschreibt, was eine Klasse können muss,
// d.h. welche Methoden sie realisieren/implementieren/einbauen muss.
// Das Interface beschreibt die öffentliche Schnittstelle,
// d.h. alle Methoden und Eigenschaften sind public.

// Interfaces sind IMMER abstrakt.
interface Bewegbar {

    // Automatisch IMMER public.
    // Wenn kein body verfügbar - automatisch abstract.
    void bewege(int x, int y);
}

interface GibtLicht {

    void leuchten();
}

// Bei Interface benutzt man immer implements.
// Das Fahrrad realisiert das Interface.
class Fahrrad implements Bewegbar, GibtLicht {

    private int x;
    private int y;

    @Override
    public void bewege(int x, int y) {
        // Die Klasse muss die Methode einbauen.
        this.x = x;
        this.y = y;
        System.out.printf("Das Fahrrad wurde nach %d / %d bewegt \n", x, y);
    }


    @Override
    public void leuchten() {
        System.out.println("Die Fahrradleuchte leuchtet hell.");
    }
}

class Lampe implements GibtLicht {

    @Override
    public void leuchten() {
        System.out.println("Lampe leuchtet hell");
    }
}