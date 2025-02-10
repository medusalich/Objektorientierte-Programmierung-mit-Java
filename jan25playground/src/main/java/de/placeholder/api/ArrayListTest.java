package de.placeholder.api;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        // List: Eine geordnete (aber nicht sortierte) Sammlung von Daten.
        // Ordnung = Einfügereihenfolge.
        // Daten werden als Objekt drin abgelegt.
        // Verfügt über einen Index.
        // Erlaubt Duplikate.
        // Ist eine Collection.

        // Basiert auf einem Array.
        ArrayList list1 = new ArrayList(); // Erzeugt eine leere Liste.
        list1.add(123); // Der int wird in Integer-Wrapper verpackt.
        list1.add("Peter"); // String ist ein Objekt.
        list1.add(10.25); // Der double wird in Double-Wrapper verpackt.

        // Dieser Loop funktioniert mit Arrays und Collections.
        for(Object o : list1) {
            System.out.println(o); // toString wird automatisch benutzt.
        }

        // Typisierte Liste
        List<String> namen = new ArrayList<>();
        //ArrayList<String> namen = new ArrayList<>();
        namen.add("Peter"); // Fügt elemente ans Ende der Liste hinzu.
        namen.add("Carol");
        namen.add("Bruce");
        namen.add("Natasha");
        System.out.println(namen);

        System.out.println();

        for (String s : namen) {
            System.out.println(s);
        }

        System.out.println();

        // Bei Listen beginnt der Index bei 0.
        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i));
        }

        System.out.println();

        System.out.println(namen);
        // Verändern
        namen.add(2, "Steven"); // Wird auf Index 2 abgelegt, andere Elemente rücken nach rechts.
        System.out.println(namen);
        namen.add("Carol"); // Fügt Elemente ans Ende der Liste hinzu.
//        namen.remove("Carol"); // Entfernt das erste Vorkommen des Wertes.
        String entferntesElement = namen.remove(2);
        // Entfernt das Objekt am passenden Index. Folgeelemente rücken nach links.
        System.out.println(entferntesElement);

        System.out.println(namen);

        String ersetztesElement = namen.set(1, "Scott"); // Element auf Index 1 wird ersetzt.
        System.out.println(ersetztesElement);
        System.out.println(namen);
    }
}
