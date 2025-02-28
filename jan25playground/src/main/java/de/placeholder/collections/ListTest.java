package de.placeholder.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ListTest {

    public static void main(String[] args) {

//        List<String> namen = new ArrayList<>();
        // Wahlfreier Zugriff sehr schnell.
        // Hinzufügen und Entfernen mittendrin sind langsamer und führen zu Verschiebungen im Array.
        // Das Array muss ggf vergrößert oder verkleinert werden.


        List<String> namen = new ArrayList<>(); // Basiert auf Objektbeziehungen.
        // Wahl freier Zugriff langsam.
        // Hinzufügen und Entfernen mittendrin ist sehr schnell.

        namen.add("Peter");
        namen.add("Bruce");
        namen.add(1, "Carol");
        System.out.println(namen.get(2));

        for (String name : namen) {
            System.out.println(name);
        }

        System.out.println();

        // Listen sind Speicher für das Aufbewahren von Elementen.
        // Queues sind Durchgangspeicher (werden befüllt und entleert).

        // Referenztyp: Queue<String>
        // Objekttyp: LinkedList<>(); (Typ auf dem Heap)
        Queue<String> namenQ = new LinkedList<>();
        // LinkedList<String> namenQ = new LinkedList<>();
        // Wir können über die Variable die Methoden des Referenztyps benutzen.
        namenQ.offer("Peter");
        namenQ.offer("Bruce");
        namenQ.offer("Carol");

        System.out.println(namenQ);

        System.out.println(namenQ.element()); // Zeigt das Element am Anfang der Warteschlange
        System.out.println(namenQ.poll()); // Entnimmt das Element am Anfang der Warteschlange
        System.out.println(namenQ.poll());
        System.out.println(namenQ.poll());
        System.out.println(namenQ);
    }
}
