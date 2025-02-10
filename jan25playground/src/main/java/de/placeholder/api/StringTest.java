package de.placeholder.api;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hamburg"; // Landet im String-Literal-Pool.
        String s2 = "Hamburg"; // Hamburg wird aus dem Pool referenziert.

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
        Integer i1 = 100;
        Integer i2 = 100;

        System.out.println(i1 == i2); // Referenzvergleich: Ist es das gleiche Objekt.
        System.out.println(i1.equals(i1)); // Inhaltsvergleich: Hat es den gleichen Inhalt.

        Long l1 = 10l;
    }
}
