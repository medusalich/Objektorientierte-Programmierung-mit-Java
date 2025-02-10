package de.placeholder.api;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hamburg"; // Landet im String-Literal-Pool.
        String s2 = "Hamburg"; // Hamburg wird aus dem Pool referenziert.
        s2 += "...";

        System.out.println(s1 == s2); // == Vergleicht bei Objekten ob, es das gleiche Objekt auf dem Heap ist.
        System.out.println(s1.equals(s2)); // Inhaltsvergleich.

        System.out.println();
        String s3 = new String("Hamburg"); // Landet NICHT im String-Literal-Pool.
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));

        int i = 10; // Kein Pool für Primitive.
        Integer j = i; // Autoboxing: Primitiver Wert wird in ein Objekt verpackt.
        i = j; // Auto-Unboxing: Wrappertyp wird ausgepackt.

        System.out.println();

        // Byte-Pool: Werte zwischen -128 und 127 sind als
        // Ganzzahlen-Wrapper (Byte, Short, Integer, Long) schon alle im Pool.
        Integer i1 = 130;
        Integer i2 = 130;

        System.out.println(i1 == i2); // Referenzvergleich: Ist es das gleiche Objekt.
        System.out.println(i1.equals(i1)); // Inhaltsvergleich: Hat es den gleichen Inhalt.

        Long l1 = 10l;

        System.out.println("Das ist das Haus von Nikigraus.");

        String name = "Peter";
        System.out.println("Das ist das Haus von " + name + "!");

        // Standard = rechtsbündig (%20s).
        // - = linksbündig (%-20s).
        final String TPL = "Das ist das Haus von %s! \n"; // Zeilenumbruch \n oder %n .
        System.out.printf(TPL, name);
        System.out.printf(TPL, "Carol");
        System.out.printf(TPL, "Bruce");
        System.out.printf(TPL, "Tony");

        System.out.println();

        final String ROW_TPL = "| %10s | %5s | %10s | %10s | \n";

        // Gibt den Zusammengesetzten String auf der Konsole aus.
        System.out.printf(ROW_TPL, "Peter", 25, "Spiderman", "New York");
        System.out.printf(ROW_TPL, "Bruce", 42, "Hulk", "New York");

        // Liefert den Zusammengesetzten String zurück.
        String s = String.format(ROW_TPL, "Tony", 58, "Iron Man", "New York");
        System.out.println(s);

    }
}
