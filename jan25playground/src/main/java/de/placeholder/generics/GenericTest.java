package de.placeholder.generics;

import de.placeholder.Person;

public class GenericTest {

    public static void main(String[] args) {

        String s = null;

        TextBox b1 = new TextBox("Mach das nicht Dave!");
        GanzzahlBox b2 = new GanzzahlBox(123);
        FliesskommazahlBox b3 = new FliesskommazahlBox(10.5);

        GenericBox<String> b4 = new GenericBox<>("Hallo");
        GenericBox<Integer> b5 = new GenericBox<>(567);
        // Generische Typen sind immer komplex d.h. bei primitiven Zahlen verwenden wir die Wrapper
        GenericBox<Person> b6 = new GenericBox<>(new Person());

        b6.getContent();

    }
}

// Ändert sich bei Versionen einer Klasse nur der Datentyp,
// dann kann man sehr wahrscheinlich die Klasse generisch machen.

// Ist der Inhalt der Methode aber unterschiedlich,
// werden die generischen Typen nicht verwendet werden können.

class TextBox {

    //Instanz-Konstanten müssen spätestens im Konstruktor einen Wert bekommen.
    private final String content;

    public TextBox(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

class GanzzahlBox {

    private final int content;

    public GanzzahlBox(int content) {
        this.content = content;
    }

    public int getContent() {
        return content;
    }
}

class FliesskommazahlBox {

    private final double content;

    public FliesskommazahlBox(double content) {
        this.content = content;
    }

    public double getContent() {
        return content;
    }
}